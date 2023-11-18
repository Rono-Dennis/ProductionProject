package c.s.docs.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import c.s.docs.model.Attachment;
import c.s.docs.model.Claims;
import c.s.docs.model.Diagnosis;
import c.s.docs.model.InvoiceLines;
import c.s.docs.model.Invoices;
import c.s.docs.model.ClaimVisitStarts;
import c.s.docs.model.PaymentMod;
import c.s.docs.model.SpAttachment;
import c.s.docs.model.SpAttachmentClaimModel;
import c.s.docs.repo.mapper.ClaimMapper;
import java.sql.Date;

@Repository
@Transactional
public class ClaimsRepo {

	@Autowired
	@Qualifier("abacusJdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	public List<Claims> fetchClaims(Integer custId) {
		String ids="";

		//test EABL Claims submission
//		if (custId==61000955) {
//			ids= "and cl.id in (6344853,\r\n"
//					+ "6344930,\r\n"
//					+ "6344865,\r\n"
//					+ "6344447,\r\n"
//					+ "6344571,\r\n"
//					+ "6344615,\r\n"
//					+ "6344490,\r\n"
//					+ "6344492,\r\n"
//					+ "6344441,\r\n"
//					+ "6344445 )";
//		} 
		String sql ="SELECT\n" +
				"distinct\n" +
				"0 as id,\n" +
				"visit_number,\n" +
				"CASE WHEN upper(nvl(cl.service_type,'UNDF'))='OP' THEN 'Outpatient' when  upper(nvl(cl.service_type,'UNDF'))='IP' THEN 'Inpatient' else nvl(cl.service_type,'UNDF') end as service_type,  \n" +
				"b.prov_name as smart_provider_name,  \n" +
				"mp.cl_prov_name AS client_provider_name,  \n" +
				"cl.payer_name, 0 as amount, 0 as gross_amount,  \n" +
				"cl.patient_name as member_Names, \n" +
				"cl.member_number, \n" +
				"cl.map_member_number, \n" +
				"mem.integ_member_number,  cl.global_id, cl.prov_id  \n" +
				"FROM ABACUS.EDI_CLAIMS cl   \n" +
				"join fin_client_details cd on cl.cust_id=cd.id  and cd.is_docs_integ=1\n" +
				"left outer join fin_member_details mem on cl.global_id=mem.global_id   \n" +
				"JOIN fin_providers b ON cl.prov_id=b.prov_id\n" +
				//                    "JOIN integ_provider_rel prel ON b.PROVIDER_KEY =prel.SM_PROV_CODE AND PREL.CLIENT_ID =cl.CUST_ID \n" +
				"JOIN integ_master_providers mp ON cl.map_prov_code =mp.cl_prov_code  and mp.client_id=cl.cust_id \n"+
				"join edi_claims_inv_lines ln on cl.id=ln.claim_id and cl.cust_id="+custId+" and ln.cust_item_name is not null  and ln.cust_group_name is not null \n" +
				"where \n"+ 
				"has_barcode=100 and "
				+ "is_qualify=2 and "
				//                    + "img_inv_count=0 and "
				+ "cl.id>5624779 and "
				+ "is_integ_data=0 and "
				+ "visit_number is not null and "
				+ "trunc(visit_start)>='15-may-2021' and \n"
				+ "((img_inv_count=0 and  img_cf_count =0 and img_dn_count=0 ) or ((img_inv_count>0 or  img_cf_count >0 or img_dn_count>0 ) and (trunc(sysdate)-trunc(visit_start))>=3 ) ) \n"
				+ ids                  
				+ " fetch next 200 rows only "
				+ "" ;


		List<Claims> listClaims= jdbcTemplate.query(sql, new ClaimMapper());
		return listClaims;
	}

	public List<Diagnosis> fetchDiagnosis(Integer claimId) {
		String sql ="SELECT distinct dg.code as diagCode, nvl(dg.name, dg.diag_name) as diagDesc FROM edi_claims_diag dg where dg.claim_id="+claimId;
		List<Diagnosis> listDiagnosis= jdbcTemplate.query(sql, new BeanPropertyRowMapper(Diagnosis.class));
		return listDiagnosis;
	}

	public List<Invoices> fetchInvoices(String visit_number, String global_id, Integer prov_id) {
		String sql ="select inv.id, inv.claim_id,inv.invoice_date,inv.invoice_number,inv.amount,inv.gross_amount, inv.pool_number,inv.global_invoice_number ,nvl(ben.benefit_desc,pool_desc_cust) benefit_desc\r\n" + 
				"from abacus.edi_claims_inv inv \r\n" + 
				"join edi_claims cl on inv.claim_id=cl.id \r\n" + 
				"join fin_member_details mem on cl.global_id=mem.global_id  \r\n" +
				"left outer join fin_benefits ben on mem.cat_id=ben.cat_id  and inv.pool_number=ben.pool_number\r\n" + 
				"where \r\n" + 
				"cl.id in "
				+ "(select id from edi_claims where visit_number='"+visit_number+"' and global_id='"+global_id+"' and prov_id="+prov_id+ " and has_barcode=100)";
		List<Invoices> listInvoices= jdbcTemplate.query(sql, new BeanPropertyRowMapper(Invoices.class));
		return listInvoices;
	}

	public Date validateVisitStart(String visitNumber, String globalId, Integer provId) {
		String sql ="SELECT "
				+ "MIN(TRUNC(VISIT_START)) AS minVisitStart, "
				+ "MAX(TRUNC(VISIT_START)) AS maxVisitStart, "
				+ "CASE WHEN MIN(TRUNC(VISIT_START)) != MAX(TRUNC(VISIT_START)) THEN 'false' ELSE 'true' END AS sameDay "
				+ "FROM EDI_CLAIMS  "
				+ "where "
				+ "id in "
				+ "(select id from edi_claims where visit_number='"+visitNumber+"' and global_id='"+globalId+"' and prov_id="+provId+ "  and has_barcode=100)";
		ClaimVisitStarts claimStarts= (ClaimVisitStarts) jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper(ClaimVisitStarts.class));
		if(!claimStarts.getSameDay()){
			updateVisitStart(visitNumber, globalId, provId, claimStarts.getMinVisitStart());
		}
		return claimStarts.getMinVisitStart();

	}

	public List<InvoiceLines> fetchInvoiceLines(Integer invoiceId) {
		String sql ="select \r\n" + 
				"ln.id as siNo,\r\n" + 
				"ln.service_group prov_service_group, ln.item_code prov_item_code, ln.cust_item_name description, ln.item_name prov_item_name, \r\n" + 
				"ln.smart_item_code, ln.smart_item_name, ln.cust_item_code, ln.cust_item_name, ln.smart_group_code, ln.smart_group_name, \r\n" + 
				"ln.cust_group_code, ln.cust_group_name, ln.amount as total, " + 
				"ln.quantity, unit_price,  \r\n" + 
				"ln.amount, inv.global_invoice_number as xglobalinv_invoice_number \r\n" + 
				"FROM edi_claims_inv_lines ln \r\n" + 
				"join edi_claims_inv inv on ln.invoice_id=inv.id \r\n" + 
				"join EDI_CLAIMS cl on inv.claim_id=cl.id \r\n" + 
				"join fin_client_details cd on cl.cust_id=cd.id  \r\n" + 
				"where \r\n" + 
				"inv.id="+invoiceId;
		List<InvoiceLines> listInvoiceLines= jdbcTemplate.query(sql, new BeanPropertyRowMapper(InvoiceLines.class));
		return listInvoiceLines;
	}


	public  List<PaymentMod> fetchPaymentModifier(Integer  Claim_id) {
		String sql ="select  ID,INVOICE_ID,AMOUNT,MOD_TYPE,REF_NUMBER,CLAIM_ID,CUST_ID from abacus.edi_claims_inv_paymod  WHERE CLAIM_ID  = ? ";
		List<PaymentMod> paymentMods = jdbcTemplate.query(sql, new Object[]{Claim_id}, new BeanPropertyRowMapper(PaymentMod.class));
		return paymentMods;
	}
	public int saveAttachment(Attachment attachment) {
		String sql ="insert into abacus.edi_claims_attachments (user_id, att_type, att_name, claim_id, invoice_id) values (?,?,?,?,?)";
		return jdbcTemplate.update(
				sql, 
				attachment.getUserId(),
				attachment.getAttType(),
				attachment.getAttName(),
				attachment.getClaimId(),
				attachment.getInvoiceId());
	}

	public int updateClaimBarCode(Attachment attachment, Claims claims) {
		String sql = "update abacus.edi_claims set has_barcode=10, barcode=?, barcode_time=current_timestamp where visit_number=? and global_id=? and prov_id=? and has_barcode=100";
		return jdbcTemplate.update(
				sql,
				attachment.getBarCode(),
				claims.getVisit_number(),
				claims.getGlobal_id(),
				claims.getProv_id());
	}

	public void updateClaimBarCodeSPAttachement(String barcode, Claims claims) {

		String sql = "update abacus.edi_claims set has_barcode=10, barcode=?, barcode_time=current_timestamp"
				+ " where"
				+ " visit_number=? "
				+ "and global_id=?"
				+ " and prov_id=? "
				+ "and has_barcode =100";

		int success = jdbcTemplate.update(
				sql,
				barcode,
				claims.getVisit_number(),
				claims.getGlobal_id(),
				claims.getProv_id());

//		System.out.println("===============UPDATING BARCODE STATUS=================== " + claims.toString() + "Rows Affected:" + success);
	}

	public int updateVisitStart(String visitNumber, String globalId, Integer provId, Date minVisitStart) {
		String sql = "update abacus.edi_claims set visit_start=? where visit_number=? and global_id=? and prov_id=?";
		return jdbcTemplate.update(
				sql,
				minVisitStart,
				visitNumber,
				globalId,
				provId);
	}

	public List<SpAttachment> getSpAttchments(String visitNumber, String globalId, Integer provId) {
		String sql = "SELECT * FROM ABACUS.edi_claims_attachments a  "
				+ "WHERE a.claim_id in "
				+ "(select id from edi_claims where visit_number=? and global_id=? and prov_id=?  and has_barcode=100) "
				+ "and att_name like '%.pdf'";
		List<SpAttachment> spAttachments = jdbcTemplate.query(sql,
				new Object[]{visitNumber, globalId, provId}, 
				new BeanPropertyRowMapper(SpAttachment.class));
		return spAttachments;

	}

	public List<Claims> getSpClaimsWithAttchments(Integer custId) {
		String sql = " SELECT\n"
				+ "distinct\n"
				+ "0 as id,\n"
				+ "0 AS claims_id,\n"
				+ "cl.CLAIM_CODE ,\n"
				+ "visit_number,\n"
				+ "nvl(cl.service_type,'UNDF') as service_type, \n"
				+ "b.prov_name as smart_provider_name,  \n"
				+ "mp.cl_prov_name AS client_provider_name,  \n"
				+ "cl.payer_name, 0 as amount, 0 as gross_amount,  \n"
				+ "cl.patient_name as member_Names, \n"
				+ "cl.member_number, \n"
				+ "cl.map_member_number, \n"
				+ "mem.integ_member_number,  cl.global_id, cl.prov_id  ,\n"
				+ "(SELECT COUNT(*) FROM ABACUS.edi_claims_attachments a  WHERE a.claim_id =  cl.ID) AS attachments_count\n"
				+ "FROM ABACUS.EDI_CLAIMS cl   \n"
				+ "join fin_client_details cd on cl.cust_id=cd.id  and cd.is_docs_integ=1\n"
				+ "left outer join fin_member_details mem on cl.global_id=mem.global_id   \n"
				+ "JOIN fin_providers b ON cl.prov_id=b.prov_id\n"
				+ "JOIN integ_provider_rel prel ON b.PROVIDER_KEY =prel.SM_PROV_CODE AND PREL.CLIENT_ID =cl.CUST_ID \n"
				+ "JOIN integ_master_providers mp ON prel.MASTER_ID =mp.id \n"
				+ "join edi_claims_inv_lines ln on cl.id=ln.claim_id and cl.cust_id="+custId+" and ln.cust_item_name is not null  \n"
				+ "where \n"
				+ "has_barcode=100 and \n"
				+ "is_qualify=2 and  \n"
				+ "cl.id>5624779 and \n"
				+ "is_integ_data=0 and \n"
				+ "visit_number is not null and \n"
				+ "trunc(visit_start)>='15-may-2021' \n"
				+ "AND (SELECT COUNT(*) FROM ABACUS.edi_claims_attachments a  WHERE a.claim_id =  cl.ID) > 0\n"
				+ "fetch next 200 rows only ";

		List<Claims> spAttachments = jdbcTemplate.query(sql, new BeanPropertyRowMapper(Claims.class));
		return spAttachments;

	}
}
