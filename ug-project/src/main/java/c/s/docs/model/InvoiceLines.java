package c.s.docs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceLines {
	private Integer siNo;
	private String description;
	private String quantity;
	private String unitPrice;
	private Double total;	

}
