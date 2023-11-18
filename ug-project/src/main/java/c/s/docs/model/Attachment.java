package c.s.docs.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attachment {
	private Integer userId;
	private String attType;
	private String attName;
	private Integer claimId;
	private Integer invoiceId;
	private String barCode;

}
