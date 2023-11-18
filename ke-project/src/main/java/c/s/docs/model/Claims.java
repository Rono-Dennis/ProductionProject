package c.s.docs.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructord
public class Claims {
	
	private String memberNames;
	private String memberNumber;
	private String provider;
	private String authorizedBy="UNAUTHORIZED";
	private Integer id;	
	private String serviceType;
        private String integ_member_number;
        private String visit_number;
        private String global_id;
        private Integer prov_id;
        private Integer CLAIMS_ID;
        private Integer ATTACHMENTS_COUNT;
        private String CLIENT_PROVIDER_NAME;
        private String CLAIM_CODE;

}




