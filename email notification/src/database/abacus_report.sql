SELECT to_char(mem.dob,'DD-MM-YYYY') dob, mem.other_number, mem.office_branch, cl.ADMIT_ID, decode(ben.service_type,1,'OP','IP') service_type, cl.CENTRAL_ID, cl.is_miniclaim, cl.loyalty_status, cl.claim_comment, cl.insert_time checkout_time, nvl2(cl.insert_time,
extract(DAY FROM cl.insert_time-cl.insert_date)*24*60  
+ extract(HOUR FROM cl.insert_time-cl.insert_date)*60  
+ extract(minute from cl.insert_time-cl.insert_date),0) duration_min,
to_char(case when cl.abacus_arrive_time is null then cl.fin_claim_time else cl.abacus_arrive_time end,'DD-MM-YYYY hh24:mi') switch_time,
to_char(case when cl.abacus_arrive_time is null then cl.fin_claim_time else cl.abacus_arrive_time end,'DD-MM-YYYY hh24:mi') arrival_date,
case when cl.batch_id is not null then to_char(cl.batch_time,'DD-MM-YYYY hh24:mi') end batch_time, 
cl.batch_number,cl.batch_id,cl.diagnosis, 
cl.claim_type claim_type_id,
decode(cl.claim_type,0,'',cl.switch_refnr) line_user, 
pol.pol_name, mem.MEMBER_NUMBER,decode(cl.claim_type,0,cl.CARD_SERIAL,'') card_serial, 
mem.NAMES_AS_IS PATIENT_NAMES,cat.cat_code,cat.cat_desc,ben.POOL_NUMBER,ben.BENEFIT_DESC,cl.AMOUNT,
cl.INVOICE_NR PROV_INVOICE_NUMBER, 
to_char(cl.insert_date,'DD-MM-YYYY')||' '||to_char(cl.insert_time,'hh24:mi') TRANSACTION_DATE, 
cl.IP_ADDRESS PROVIDER_KEY,pv.PROV_NAME PROVIDER_NAME,cl.is_roamer,cl.roamer_amount,cl.pool_source,
cl.local_conv_rate,cl.policy_conv_rate,
cl2.is_edi,
to_char(mem.status_event_time,'DD-MM-YYYY') mem_deact_date,
case when cl3.is_submit=1 then 'SUBMISSION' 
when cl3.is_qualify=1 then 'TRANSLATION' 
when cl3.is_qualify=2 then 'PAYMENT PROCESSING' end edi_step,
cl2.edi_status_msg,cl3.DIAG_COUNT,cl3.valid_diag_count,nvl2(cl3.INV_COUNT_SMART,decode(cl3.INV_COUNT_SMART,cl3.INV_COUNT,'matched','not_matched'),'') edi_matching
FROM fin_claims cl  
join fin_member_details mem on cl.global_id=mem.global_id and cl.dup_count=0 
and cl.insert_date >='01-SEP-2019' and cl.insert_date <= '10-SEP-2019'
and cl.claim_type=0
join fin_client_details cld on mem.cust_id=cld.id and cl.patient_medicalaid_code=cld.smart_code and cld.smart_code='RI' 
join fin_benefit_category cat on mem.cat2_id=cat.cat_id 
join fin_policy_details pol on mem.pol_id1=pol.pol_id  
join fin_providers pv on cl.ip_address=pv.provider_key and pv.parent_provider in ('SKSP_2303','SKSP_358','SKSP_148','SKSP_174')
join stg_slink_claims cl2 on cl.central_id=cl2.central_id
left outer join edi_claims_inv inv on cl.central_id=inv.central_id
left outer join edi_claims cl3 on inv.claim_id=cl3.id
left outer join FIN_BENEFITS ben on mem.cat2_id=ben.cat_id AND cl.POOL_NR=ben.POOL_NUMBER;