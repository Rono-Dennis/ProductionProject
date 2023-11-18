--DATA UPDATE queries 
--1. Claims Monitoring Dashboard
--LEGEND: call_id 35 = stg to abacus, call_id 30 = provider to staging

--SELECT call_id, item_name, item_type,source_count, dest_count, item_count FROM abacus.vw_dash_log_edi_claims
--A. STG to ABACUS 
--i. CLAIMS
CREATE OR REPLACE VIEW abacus.vw_dash_log_edi_claims AS 
    select 35 as call_id , 'edi_backend_stg2abacus' AS item_name,'1:claims:'||lg.provider_key AS item_type,count(distinct lg.invoice_nr) AS source_count,count(distinct inv.invoice_number) AS dest_count, count(distinct lg.invoice_nr)-count(distinct inv.invoice_number) AS item_count 
    from abacus.log_edi_claims_delivery lg
    left outer join abacus.edi_claims_inv inv on lg.invoice_nr=inv.invoice_number and lg.provider_key=inv.prov_code
    where claim_date >= trunc(sysdate-1)
    group by lg.provider_key;  
