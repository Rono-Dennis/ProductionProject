--DATA UPDATE queries 
--1. Claims Monitoring Dashboard
--LEGEND: call_id 35 = stg to abacus, call_id 30 = provider to staging

-- Data updates
-- 1. SELECT call_id, current_timestamp as call_time, item_name, item_type, source_count, dest_count, item_count
--    FROM abacus.vw_akuh_invoice_kisumu;
-- 2. SELECT call_id, current_timestamp as call_time, item_name, item_type, source_count, dest_count, item_count
--    FROM abacus.vw_akuh_diagnosis_kisumu;
-- 3. SELECT call_id, current_timestamp as call_time, item_name, item_type, source_count, dest_count, item_count
--    FROM abacus.vw_akuh_batches_kisumu;      


-- VIEW TO STG 
--i. CLAIMS

CREATE OR REPLACE VIEW abacus.vw_akuh_invoice_kisumu AS 

    SELECT 30 as call_id, 'edi_backend_view2stg' AS item_name,'1:claims:SKSPKDN_4' AS item_type,
        count(DISTINCT bill_no) as source_count,
        (SELECT count(distinct invoice_nr) from abacus.log_edi_claims_delivery where trunc(claim_date)=trunc(sysdate-1) and provider_key = 'SKSPKDN_4') as dest_count,
        (count(DISTINCT bill_no) - (SELECT count(distinct invoice_nr) from abacus.log_edi_claims_delivery where trunc(claim_date)=trunc(sysdate-1) and provider_key = 'SKSPKDN_4')) as item_count
        FROM smart_trans_opip@dblink_akuh_kisumu 
        WHERE trunc(voucher_date) = (CURRENT_DATE-1)
        GROUP BY 30, 'edi_backend_view2stg', '1:claims:SKSPKDN_4'
        ;

--B. diagnosis 
CREATE OR REPLACE VIEW abacus.vw_akuh_diagnosis_kisumu AS 

    SELECT 30 as call_id, 'edi_backend_view2stg' AS item_name,'1:diagnosis_ip:SKSPKDN_4' AS item_type,
            count(1) as source_count,
            (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSPKDN_4' and view_source='SMART_DIAG_IP') as dest_count,
            (count(1) - (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSPKDN_4' and view_source='SMART_DIAG_IP')) as item_count
            FROM care.smart_diag_ip@dblink_akuh_kisumu 
            WHERE trunc(diagnosis_date) = (CURRENT_DATE-1)
            GROUP BY 30, 'edi_backend_view2stg', '1:diagnosis_ip:SKSPKDN_4'

    UNION

        SELECT 30 as call_id, 'edi_backend_view2stg' AS item_name,'1:diagnosis_op:SKSPKDN_4' AS item_type,
            count(1) as source_count,
            (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSPKDN_4' and view_source='SMART_DIAG_OP') as dest_count,
            (count(1) - (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSPKDN_4' and view_source='SMART_DIAG_OP')) as item_count
            FROM care.smart_diag_op@dblink_akuh_kisumu 
            WHERE trunc(bill_date) = (CURRENT_DATE-1)
            GROUP BY 30, 'edi_backend_view2stg', '1:diagnosis_op:SKSPKDN_4'

    UNION 
        
        SELECT 30 as call_id, 'edi_backend_view2stg' AS item_name,'1:diagnosis_outreach:SKSPKDN_4' AS item_type,
                count(1) as source_count,
                (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSPKDN_4' and view_source='SMART_DIAG_OUTREACH') as dest_count,
                (count(1) - (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSPKDN_4' and view_source='SMART_DIAG_OUTREACH')) as item_count
                FROM care.smart_diag_outreach@dblink_akuh_kisumu 
                WHERE trunc(appt_date) = (CURRENT_DATE-1)
                GROUP BY 30, 'edi_backend_view2stg', '1:diagnosis_outreach:SKSPKDN_4'

        ;



--C. batches
CREATE OR REPLACE VIEW abacus.vw_akuh_batches_kisumu AS 
        SELECT 30 as call_id, 'edi_backend_view2stg' AS item_name,'1:batches:SKSPKDN_4' AS item_type,
                count(1) as source_count,
                (SELECT count(1) from abacus.log_edi_batches  where trunc(batch_date)=trunc(sysdate-1) and provider_key = 'SKSPKDN_4') as dest_count,
                (count(1) - (SELECT count(1) from abacus.log_edi_batches  where trunc(batch_date)=trunc(sysdate-1) and provider_key = 'SKSPKDN_4')) as item_count
                FROM smart.smartbatch@dblink_akuh_kisumu 
                WHERE trunc(ibd_batch_date) = (CURRENT_DATE-1)
                GROUP BY 30, 'edi_backend_view2stg', '1:batches:SKSPKDN_4'
        ;		
