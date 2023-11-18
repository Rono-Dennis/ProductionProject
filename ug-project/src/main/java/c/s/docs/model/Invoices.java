package c.s.docs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Invoices {
	private Integer id;
	private String claimId;
	private String invoiceDate;
	private String invoiceNumber;
	private String amount;
	private String grossAmount;
	private String poolNumber;
	private String globalInvoiceNumber;
	private String benefitDesc;	

}
