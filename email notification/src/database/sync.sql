
CREATE public database link 
  lnk_integ_dev
connect to 
  INTERACTIVE
identified by 
  INTERACTIVE_#2017 
USING '192.180.3.14:5433/integstaging';


CREATE public database link 
  lnk_integ_prod
connect to 
  INTEG_USER
identified by 
  integ_123
USING '192.180.3.14:1521/integstaging';


CREATE TABLE INTEG_API.query_offset(
    query_offset_id   integer primary key,
    offset_key            varchar(150),
    value             varchar(50)
    );
CREATE SEQUENCE INTEG_API.query_offset_id_seq MINVALUE 1 INCREMENT BY 1 START WITH 1;
CREATE OR REPLACE TRIGGER INTEG_API.tr_query_offset_id BEFORE INSERT ON INTEG_API.query_offset
    for each row
    begin
     if inserting then
       if :NEW.query_offset_id is null then
         SELECT INTEG_API.query_offset_id_seq.nextval into :NEW.query_offset_id  from dual;
       end if;
     end if;
    end;
    /


CREATE TABLE INTEG_API.edi_claim_cache(
    edi_claim_cache_id    integer primary key,
    claims_key            varchar(200),
    claim_code            varchar(500),
    customer_id           integer,
    provider_id           integer,
    smart_prov_code         varchar(50),
    client_prov_code         varchar(50),
    request_url           varchar(500),    
    picked                integer default 0,
    claim_json            clob,
    claim_soap            clob
    );
CREATE SEQUENCE INTEG_API.edi_claim_cache_id_seq MINVALUE 1 INCREMENT BY 1 START WITH 1;
CREATE OR REPLACE TRIGGER INTEG_API.tr_edi_claim_cache_id BEFORE INSERT ON INTEG_API.edi_claim_cache
    for each row
    begin
     if inserting then
       if :NEW.edi_claim_cache_id is null then
         SELECT INTEG_API.edi_claim_cache_id_seq.nextval into :NEW.edi_claim_cache_id  from dual;
       end if;
     end if;
    end;
    /
    

--1. Member Mapping
--======================================================
-- CREATE TABLE INTEG_API.actisure_member_policy(
--     actisure_member_policy_id integer primary key,
--     customer_id integer not null default 156578462,      --consolidated customer id
--     --pol_id      integer not null default ,      --smart pol id
--     entity_id   integer not null,
--     policy_id   integer not null,
--     --policy_effective_date date not null null default current_date,
--     effective_date_string           varchar(50),    --holds the text version of date from the data import process
--     policy_holder_id      integer not null,
--     policy_holder_name    varchar(150),
    
--     division_entity_id    varchar(50),
--     product_name          varchar(50),
--     product_id            varchar(50),

--     extra_fields_json     CLOB
--   );
-- ALTER TABLE INTEG_API.actisure_member_policy ADD (
--   CONSTRAINT member_policy_json CHECK (extra_fields_json IS JSON (STRICT))
--   );
-- CREATE SEQUENCE INTEG_API.actisure_member_policy_id_seq MINVALUE 1 INCREMENT BY 1 START WITH 1;
-- CREATE OR REPLACE TRIGGER INTEG_API.tr_actisure_member_policy_id BEFORE INSERT ON INTEG_API.actisure_member_policy
--     for each row
--     begin
--      if inserting then
--        if :NEW.actisure_member_policy_id is null then
--          SELECT INTEG_API.actisure_member_policy_id_seq.nextval into :NEW.actisure_member_policy_id  from dual;
--        end if;
--      end if;
--     end;
--     /


CREATE TABLE INTEG_API.act_staging_member_policy(
    act_staging_member_policy_id integer primary key,

    entity_id   varchar(50),
    policy_id   varchar(50),
    policy_holder_id      varchar(50),
    
    effective_date_string           varchar(50),    --holds the text version of date from the data import process
    
    policy_holder_name    varchar(150),
    
    policy_type           varchar(50),
    policy_status         varchar(50),

    division_entity_id    varchar(50),
    product_id            varchar(50),

    extra_fields_json     varchar(500)
  );
ALTER TABLE INTEG_API.act_staging_member_policy ADD (
  CONSTRAINT act_member_policy_json CHECK (extra_fields_json IS JSON (STRICT))
  );
CREATE SEQUENCE INTEG_API.act_stg_member_policy_id_seq MINVALUE 1 INCREMENT BY 1 START WITH 1;
CREATE OR REPLACE TRIGGER INTEG_API.tr_act_stg_member_policy_id BEFORE INSERT ON INTEG_API.act_staging_member_policy
    for each row
    begin
     if inserting then
       if :NEW.act_staging_member_policy_id is null then
         SELECT INTEG_API.act_stg_member_policy_id_seq.nextval into :NEW.act_staging_member_policy_id  from dual;
       end if;
     end if;
    end;
    /



--a. Load data from csv via sql developer import

--b. Cleanup
--fix effective date
UPDATE INTEG_API.act_staging_member_policy
  SET effective_date_string = SUBSTR(effective_date_string,0,instr(effective_date_string,' '));

UPDATE INTEG_API.act_staging_benefits
  SET effective_date = SUBSTR(effective_date,0,instr(effective_date,' '));

UPDATE INTEG_API.act_staging_sub_benefits
  SET effective_date = SUBSTR(effective_date,0,instr(effective_date,' '));


--remove single quotes
UPDATE integ_api.act_staging_benefits
  SET 
  benefit = replace(benefit,'''',''),
  benefit_type = replace(benefit_type,'''',''),
  policy_holder_name = replace(policy_holder_name,'''',''),
  policy_status = replace(policy_status,'''','');


UPDATE integ_api.act_staging_sub_benefits
  SET 
  sub_benefit = replace(sub_benefit,'''',''),
  sub_benefit_type = replace(sub_benefit_type,'''',''),
  policy_holder_name = replace(policy_holder_name,'''',''),
  policy_status = replace(policy_status,'''','');


  --WHERE pol_id = 555;  


-- UPDATE INTEG_API.actisure_member_policy
--   SET policy_effective_date = to_date(date_string,'MM/DD/YYYY')
--   WHERE pol_id = 555 AND date_string LIKE '%/201%';


--LOB hack
-- ALTER TABLE INTEG_API.map_members ADD extra_fields_json_varchar VARCHAR(500);

-- UPDATE INTEG_API.map_members SET extra_fields_json_varchar = to_char(extra_fields_json);
-- WHERE customer_id = 61000954 AND extra_fields_json_varchar IS NULL;

-- --c. insert into consolidated
-- --DELETE FROM INTEG_API.map_members WHERE pol_id = 555;

-- --Run this in Production to benefit from the link to Production Abacus
-- INSERT INTO INTEG_API.map_members@lnk_integ_dev (smart_membership_number, client_membership_number, pol_id, mapped_by, country_code, customer_id, extra_fields_json_varchar)
-- SELECT abacus.member_number, mem_pol.entity_id, abacus.pol_id1, 'ii', 'ke', 156578462, '{"policyid":"' || mem_pol.policy_id || '", "policyeffectivedate":"' || mem_pol.policy_effective_date || '", "divisionentityid":"' || mem_pol.division_entity_id ||'"}'
--   FROM INTEG_API.actisure_member_policy@lnk_integ_dev mem_pol
--   INNER JOIN abacus.fin_member_details@lnk_abacus abacus ON abacus.other_number = to_char(mem_pol.entity_id) 
--   AND abacus.other_number IS NOT NULL 
--   AND mem_pol.date_string LIKE '%/2018%'
--   AND cust_id = 61000954
--   --AND extra_fields_json_varchar IS NULL
--   AND mem_pol.pol_id = 555;

-- --REVERSE the hack in DEV
-- UPDATE INTEG_API.map_members 
-- SET extra_fields_json = extra_fields_json_varchar
-- WHERE extra_fields_json IS NULL

--c. Clear in DEV
--DELETE FROM INTEG_API.map_members WHERE customer_id = 156578462;

--C. Load FUNDED STUFF in dev (run in PRODUCTION)
INSERT INTO INTEG_API.map_members@lnk_integ_dev (smart_membership_number, client_membership_number, pol_id, mapped_by, country_code, customer_id, extra_fields_json_varchar)
SELECT abacus.member_number, mem_pol.entity_id, abacus.pol_id1, 'ii', 'ke', 156578462, '{"policyid":"' || mem_pol.policy_id || '", "policyeffectivedate":"' || to_date(mem_pol.effective_date_string,'MM/DD/YYYY') || '", "divisionentityid":"' || mem_pol.division_entity_id || '", "productid":"' || mem_pol.product_id ||'"}'
  FROM INTEG_API.act_staging_member_policy@lnk_integ_dev mem_pol
  INNER JOIN abacus.fin_member_details@lnk_abacus abacus ON abacus.other_number = to_char(mem_pol.entity_id) 
  AND abacus.other_number IS NOT NULL 
  --AND mem_pol.effective_date_string LIKE '%/2018%'
  AND abacus.cust_id = 61000954;

--FIX json field (couldn't transfer clob over the wire)
UPDATE INTEG_API.map_members 
SET extra_fields_json = extra_fields_json_varchar
WHERE customer_id = 156578462 AND extra_fields_json IS NULL;


--disparities
-- SELECT *
-- FROM abacus.fin_member_details@lnk_abacus abacus
-- WHERE abacus.member_number = 'UK008049-00'

--2. Benefit Mapping
--======================================================
--a. staging table
-- CREATE TABLE INTEG_API.actisure_benefit_mapping(
--     actisure_benefit_mapping_id     integer primary key,

--     customer_id             integer not null,      --consolidated customer id
--     pol_id                  integer not null,      --smart pol id
--     policy_id               integer not null,

--     policy_effective_date   date not null,         --only for validation. authoritative date is the one on member_policy mapping
--     policy_holder_id        integer not null,
--     policy_holder_name      varchar(150),

--     principal_benefit     varchar(200),
--     sub_benefit           varchar(200),
--     is_principal          varchar(5),

--     pool_number           varchar(5),

--     extra_fields_json     CLOB
--   );
-- CREATE SEQUENCE INTEG_API.act_benefit_mapping_id_seq MINVALUE 1 INCREMENT BY 1 START WITH 1;
-- CREATE OR REPLACE TRIGGER INTEG_API.tr_actisure_benefit_mapping_id BEFORE INSERT ON INTEG_API.actisure_benefit_mapping
--     for each row
--     begin
--      if inserting then
--        if :NEW.actisure_benefit_mapping_id is null then
--          SELECT INTEG_API.act_benefit_mapping_id_seq.nextval into :NEW.actisure_benefit_mapping_id  from dual;
--        end if;
--      end if;
--     end;
--     /
--b. data into staging (via sql script)



--c. BENEFITS 
--ROYAL MEDIA BENEFITS ONLY !!!
-- INSERT INTO INTEG_API.MAP_BENEFITS (cln_ben_code, cln_description, smart_pool_number, smart_description, mapped_by, country_code, customer_id, extra_fields_json)
-- SELECT substr(sub_benefit,1,10), substr(sub_benefit,1,100), pool_number, 'Smart Description', 'ii', 'ke', customer_id, '{"subbenefit":"' || sub_benefit || '", "principalbenefit":"' || principal_benefit || '"}'
-- FROM INTEG_API.actisure_benefit_mapping;

-- DELETE FROM INTEG_API.MAP_BENEFITS WHERE customer_id = 156578462;

--ALL OUTPATIENT BENEFITS 
set define off;
INSERT INTO integ_api.map_benefits (cln_ben_code, cln_description, smart_pool_number, smart_description, mapped_by, country_code, customer_id, extra_fields_json)
--SELECT DISTINCT substr(sub.sub_benefit,1,10), substr(sub.sub_benefit,1,100), sub.pool_number, 'Smart Description', 'ii', 'ke', 156578462, '{"policyid":"' || sub.policy_id || '","subbenefit":"' || sub.sub_benefit || '", "principalbenefit":"' || ben.benefit || '", "divisionentityid":"' || ben.division_entity_id || '"}'
SELECT DISTINCT ben.benefit_id, substr(sub.sub_benefit,1,100), sub.pool_number, 'Smart Description', 'ii', 'ke', 156578462, '{"policyid":"' || sub.policy_id || '","subbenefit":"' || sub.sub_benefit || '", "principalbenefit":"' || ben.benefit || '", "policyeffectivedate":"' || to_date(sub.effective_date,'MM/DD/YYYY') || '", "divisionentityid":"' || ben.division_entity_id || '"}'
  FROM INTEG_API.act_staging_sub_benefits sub
  INNER JOIN INTEG_API.act_staging_benefits ben ON sub.policy_id = ben.policy_id;
  --WHERE sub.pool_number in ('1','2','3','18');
  --WHERE sub.is_principal_benefit = 0 AND ben.is_principal_benefit = 1;
  --WHERE sub.is_principal_benefit is null AND ben.is_principal_benefit is null
  COMMIT;
  --WHERE sub.is_principal_benefit = 0 AND sub.policy_id = 11089;

--OPTICAL
-- set define off;
-- INSERT INTO INTEG_API.MAP_BENEFITS (cln_ben_code, cln_description, smart_pool_number, smart_description, mapped_by, country_code, customer_id, extra_fields_json)
-- SELECT DISTINCT substr(sub.sub_benefit,1,10), substr(sub.sub_benefit,1,100), sub.pool_number, 'Smart Description', 'ii', 'ke', 156578462, '{"policyid":"' || sub.policy_id || '","subbenefit":"' || sub.sub_benefit || '", "principalbenefit":"' || ben.benefit ||'"}'
--   FROM INTEG_API.act_staging_sub_benefits sub
--   INNER JOIN INTEG_API.act_staging_benefits ben ON sub.policy_id = ben.policy_id
--   WHERE sub.pool_number = 3 ;

-- SELECT DISTINCT substr(sub.sub_benefit,1,10), substr(sub.sub_benefit,1,100), sub.pool_number, 'Smart Description', 'ii', 'ke', 156578462, '{"policyid":"' || sub.policy_id || '","subbenefit":"' || sub.sub_benefit || '", "principalbenefit":"' || ben.benefit ||'"}'
--   FROM INTEG_API.act_staging_sub_benefits sub
--   INNER JOIN INTEG_API.act_staging_benefits ben ON sub.policy_id = ben.policy_id
--   WHERE sub.is_principal_benefit = 0 AND ben.is_principal_benefit = 1  AND sub.policy_id = 11089;

--=================


CREATE TABLE INTEG_API.actisure_log
   (
    actisure_log_id     integer primary key,
    client              varchar(10) default 'RI',    --APA or RI

    client_id           integer,      --smart client id
    customer_id         integer,      --integ consolidated cust id
    sksp_key            varchar(20),
    log_time            timestamp default current_timestamp,
    claim_central_id    varchar(50),
    edi_claim_code      varchar(500),
    payload_name        varchar(50) default 'assessment',

    payload_id         integer,
    request_body       clob,
    response_body      clob,
    error_message      clob,

    request_clob      clob,
    response_clob     clob,

    smart_log_time_epoch    timestamp default current_timestamp,
    status                    char(1)
    );
CREATE SEQUENCE INTEG_API.actisure_log_id_seq MINVALUE 1 INCREMENT BY 1 START WITH 1;
CREATE OR REPLACE TRIGGER INTEG_API.tr_actisure_log_id BEFORE INSERT ON INTEG_API.actisure_log
    for each row
    begin
     if inserting then
       if :NEW.actisure_log_id is null then
         SELECT INTEG_API.actisure_log_id_seq.nextval into :NEW.actisure_log_id  from dual;
       end if;
     end if;
    end;
    /



--staging tables 
CREATE TABLE INTEG_API.act_staging_benefits(
      act_staging_benefit_id     integer primary key,
      policy_id           varchar(100), 
      effective_date      varchar(100), 
      benefit_id          varchar(100), 
      benefit             varchar(100), 
      benefit_type        varchar(100),
      pool_number         varchar(100),

      is_principal_benefit    varchar(100), 
      policy_holder_id        varchar(100), 
      policy_holder_name      varchar(100), 

      policy_status     varchar(100), 
      codeset           varchar(100), 
      code_id           varchar(100), 

      division_entity_id    varchar(100),
      product_id            varchar(100),

      benefit_category    varchar(100)
      );
CREATE SEQUENCE INTEG_API.act_staging_benefit_id_seq MINVALUE 1 INCREMENT BY 1 START WITH 1;
CREATE OR REPLACE TRIGGER INTEG_API.tr_actisure_staging_benefit_id BEFORE INSERT ON INTEG_API.act_staging_benefits
    for each row
    begin
     if inserting then
       if :NEW.act_staging_benefit_id is null then
         SELECT INTEG_API.act_staging_benefit_id_seq.nextval into :NEW.act_staging_benefit_id  from dual;
       end if;
     end if;
    end;
    /



CREATE TABLE INTEG_API.act_staging_sub_benefits(
    act_staging_sub_benefit_id     integer primary key,
    policy_id    varchar(100), 
    effective_date    varchar(100),
    benefit_id    varchar(100),
    pool_number    varchar(100),
    sub_benefit    varchar(100),
    sub_benefit_type    varchar(100),
    is_principal_benefit    varchar(100),
    policy_holder_id    varchar(100), 
    policy_holder_name    varchar(100),
    policy_status    varchar(100),
    code_set    varchar(100),
    code_id    varchar(100),

    division_entity_id    varchar(100),
    product_id            varchar(100),

    sub_benefit_category    varchar(100)
    );
CREATE SEQUENCE INTEG_API.act_staging_sub_benefit_id_seq MINVALUE 1 INCREMENT BY 1 START WITH 1;
CREATE OR REPLACE TRIGGER INTEG_API.tr_act_staging_sub_benefit_id BEFORE INSERT ON INTEG_API.act_staging_sub_benefits
    for each row
    begin
     if inserting then
       if :NEW.act_staging_sub_benefit_id is null then
         SELECT INTEG_API.act_staging_sub_benefit_id_seq.nextval into :NEW.act_staging_sub_benefit_id  from dual;
       end if;
     end if;
    end;
    /



--SLACK STUFF
CREATE TABLE INTEG_API.slack_message (
    
    slack_message_id      integer primary key,
    message_type          varchar(20) default 'BUSINESS',    --BUSINESS,APPLICATION,OTHERS 
    payload               clob,     --actual message
    response              clob,     --slack response
    webhook               clob,     --url
    log_level             varchar(10),  --INFO, WARNING, CRITICAL, SEVERE
    status                integer,      --0,1,2

    client_id             integer,      --smart client id
    customer_id           integer,      --integ consolidated cust id
    sksp_key              varchar(20),
    claim_central_id      varchar(50),
    edi_claim_code        varchar(500),
    log_time              timestamp default current_timestamp    
    );
CREATE SEQUENCE INTEG_API.slack_message_id_seq MINVALUE 1 INCREMENT BY 1 START WITH 1;
CREATE OR REPLACE TRIGGER INTEG_API.tr_slack_message_id BEFORE INSERT ON INTEG_API.slack_message
    for each row
    begin
     if inserting then
       if :NEW.slack_message_id is null then
         SELECT INTEG_API.slack_message_id_seq.nextval into :NEW.slack_message_id  from dual;
       end if;
     end if;
    end;
    /



--MISSING SCHEMES (run in prod)
INSERT INTO integ_api.map_policies (pol_name, pol_id, cln_pol_code, mapped_by, mem_type, policy_currency_code, customer_id, country_code, delimiter_flag, company_name)
SELECT DISTINCT company_name, pol_id, cln_pol_code,'INSERT',0,'KES',156578462,'KE',1,substr(company_name,1,45)
FROM API_RI_OWNER.MAP_RI_COMPANIES@lnk_integ_prod
WHERE pol_id NOT IN (SELECT pol_id FROM INTEG_API.map_policies WHERE customer_id = 156578462)
AND company_name NOT IN (SELECT company_name FROM INTEG_API.map_policies WHERE customer_id = 156578462)
--AND pol_id NOT IN (23066,6965,1009002123,1009002280,1009002302,1009003436,1009015220,13638)
ORDER BY company_name
FETCH NEXT 10 ROWS ONLY



--GET ASSESSMENT IDS
select edi_claim_code, response_body, substr(response_body,instr(response_body,'<b:AssessmentId>')+15,10) as assessmentId,smart_log_time_epoch
from integ_api.actisure_log 
where request_body not like '%placeholder%' AND response_body like '%<b:AssessmentId>%'
order by smart_log_time_epoch desc
fetch first 20 rows only


--Get Summary Stats
select smart_prov_code, 
  decode(picked,
  0,'Pending',
  1,'Load Success',
  2,'Load Failure',
  5,'Missing Diagnosis',
  6,'Missing Actisure Details',
  7,'Missing Scheme Mapping',
  8,'Missing Provider Mapping',
  9,'Missing Benefits',
  'Others'
  ) as status, 
count(1) as total
from integ_api.edi_claim_cache
group by smart_prov_code,picked
order by smart_prov_code


--declare namespace xmlns:soap="http://www.w3.org/2003/05/soap-envelope" ;
SELECT XMLQuery(
'declare namespace soap="http://www.w3.org/2003/05/soap-envelope";
declare namespace ns="http://services.activus.com/claimsloadservice/messagecontracts/2011/05";
declare namespace ns2="http://schemas.activus.com/dispublicobject/claimsload/2011/05";
		/soap:Envelope/soap:Body/ns:LoadClaimRequestMessage/ns:LoadClaimRequest/ns2:Claim/ns2:PolicyId'
		PASSING xmltype(claim_soap) 
		RETURNING CONTENT
		).getCLOBVal()
FROM integ_api.EDI_CLAIM_CACHE            
WHERE edi_claim_cache_id = 55479




--UPDATE
UPDATE integ_api.EDI_CLAIM_CACHE e
  SET e.CLAIM_SOAP =
    XMLQuery('
			declare namespace soap="http://www.w3.org/2003/05/soap-envelope"; 
			declare namespace ns="http://services.activus.com/claimsloadservice/messagecontracts/2011/05"; 
			declare namespace ns2="http://schemas.activus.com/dispublicobject/claimsload/2011/05"; 
			copy $i := $p1 modify
			(
              (for $j in $i/soap:Envelope/soap:Body/ns:LoadClaimRequestMessage/ns:LoadClaimRequest/ns2:Claim/ns2:PolicyId
                return replace value of node $j with $pid),
              (for $j in $i/soap:Envelope/soap:Body/ns:LoadClaimRequestMessage/ns:LoadClaimRequest/ns2:Claim/ns2:PolicyEffectiveDate
                return replace value of node $j with $ped)
			)
              return $i' 
    	PASSING 
    		xmltype(e.claim_soap) AS "p1",
			'TESTPOLICYID' AS "pid",
	      'TESTEFFECTIVEDATE' AS "ped"
			RETURNING CONTENT).getCLOBVal()
WHERE edi_claim_cache_id = 55479

