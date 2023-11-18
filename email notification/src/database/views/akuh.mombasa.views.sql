--DATA UPDATE queries 
--1. Claims Monitoring Dashboard
--LEGEND: call_id 35 = stg to abacus, call_id 30 = provider to staging

-- Data updates
-- 1. SELECT call_id, current_timestamp as call_time, item_name, item_type, source_count, dest_count, item_count
--    FROM abacus.vw_akuh_invoice_mombasa;
-- 2. SELECT call_id, current_timestamp as call_time, item_name, item_type, source_count, dest_count, item_count
--    FROM abacus.vw_akuh_diagnosis_mombasa;
-- 3. SELECT call_id, current_timestamp as call_time, item_name, item_type, source_count, dest_count, item_count
--    FROM abacus.vw_akuh_batches_mombasa;      


-- VIEW TO STG 
--i. CLAIMS

CREATE OR REPLACE VIEW abacus.vw_akuh_invoice_mombasa AS 

    SELECT 30 as call_id, 'edi_backend_view2stg' AS item_name,'1:claims:SKSP_183' AS item_type,
        count(bill_no) as source_count,
        (SELECT count(distinct invoice_nr) from abacus.log_edi_claims_delivery where trunc(claim_date)=trunc(sysdate-1) and provider_key = 'SKSP_183') as dest_count,
        (count(bill_no) - (SELECT count(invoice_nr) from abacus.log_edi_claims_delivery where trunc(claim_date)=trunc(sysdate-1) and provider_key = 'SKSP_183')) as item_count
        FROM smart_trans_opip@dblink_akuh_mombasa 
        WHERE trunc(voucher_date) = (CURRENT_DATE-1)
        GROUP BY 30, 'edi_backend_view2stg', '1:claims:SKSP_183'
        ;

--B. diagnosis 
CREATE OR REPLACE VIEW abacus.vw_akuh_diagnosis_mombasa AS 

    SELECT 30 as call_id, 'edi_backend_view2stg' AS item_name,'1:diagnosis_ip:SKSP_183' AS item_type,
            count(1) as source_count,
            (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSP_183' and view_source='SMART_DIAG_IP') as dest_count,
            (count(1) - (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSP_183' and view_source='SMART_DIAG_IP')) as item_count
            FROM care.smart_diag_ip@dblink_akuh_mombasa 
            WHERE trunc(diagnosis_date) = (CURRENT_DATE-1)
            GROUP BY 30, 'edi_backend_view2stg', '1:diagnosis_ip:SKSP_183'

    UNION

        SELECT 30 as call_id, 'edi_backend_view2stg' AS item_name,'1:diagnosis_op:SKSP_183' AS item_type,
            count(1) as source_count,
            (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSP_183' and view_source='SMART_DIAG_OP') as dest_count,
            (count(1) - (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSP_183' and view_source='SMART_DIAG_OP')) as item_count
            FROM care.smart_diag_op@dblink_akuh_mombasa 
            WHERE trunc(bill_date) = (CURRENT_DATE-1)
            GROUP BY 30, 'edi_backend_view2stg', '1:diagnosis_op:SKSP_183'

    UNION 
        
        SELECT 30 as call_id, 'edi_backend_view2stg' AS item_name,'1:diagnosis_outreach:SKSP_183' AS item_type,
                count(1) as source_count,
                (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSP_183' and view_source='SMART_DIAG_OUTREACH') as dest_count,
                (count(1) - (SELECT count(1) from abacus.log_edi_diagnosis  where trunc(bill_date)=trunc(sysdate-1) and provider_key = 'SKSP_183' and view_source='SMART_DIAG_OUTREACH')) as item_count
                FROM care.smart_diag_outreach@dblink_akuh_mombasa 
                WHERE trunc(appt_date) = (CURRENT_DATE-1)
                GROUP BY 30, 'edi_backend_view2stg', '1:diagnosis_outreach:SKSP_183'
        ;



--C. batches
CREATE OR REPLACE VIEW abacus.vw_akuh_batches_mombasa AS 
        SELECT 30 as call_id, 'edi_backend_view2stg' AS item_name,'1:batches:SKSP_183' AS item_type,
                count(1) as source_count,
                (SELECT count(1) from abacus.log_edi_batches  where trunc(batch_date)=trunc(sysdate-1) and provider_key = 'SKSP_183') as dest_count,
                (count(1) - (SELECT count(1) from abacus.log_edi_batches  where trunc(batch_date)=trunc(sysdate-1) and provider_key = 'SKSP_183')) as item_count
                FROM smart.smartbatch@dblink_akuh_mombasa 
                WHERE trunc(ibd_batch_date) = (CURRENT_DATE-1)
                GROUP BY 30, 'edi_backend_view2stg', '1:batches:SKSP_183'
--         ;		
