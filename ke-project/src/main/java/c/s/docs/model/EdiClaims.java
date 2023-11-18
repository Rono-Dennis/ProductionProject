package c.s.docs.model;

import java.util.List;

public class EdiClaims {
    private Boolean successful;
    private String status_msg="";
    private Long fetch_id_from;
    private Long fetch_id_to;
    private Integer claim_count;
    private Boolean has_more;
    private List claims;
    
    public EdiClaims() {
    }

    public void setResponse(boolean isSuccessful, String myStatus_msg) {
        this.setStatus_msg(myStatus_msg);
        this.setSuccessful(isSuccessful);
    }

    public Boolean getSuccessful() {
        return successful;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }

    public String getStatus_msg() {
        return status_msg;
    }

    public void setStatus_msg(String status_msg) {
        this.status_msg = status_msg;
    }

    public Long getFetch_id_from() {
        return fetch_id_from;
    }

    public void setFetch_id_from(Long fetch_id_from) {
        this.fetch_id_from = fetch_id_from;
    }

    public Long getFetch_id_to() {
        return fetch_id_to;
    }

    public void setFetch_id_to(Long fetch_id_to) {
        this.fetch_id_to = fetch_id_to;
    }

    public Integer getClaim_count() {
        return claim_count;
    }

    public void setClaim_count(Integer claim_count) {
        this.claim_count = claim_count;
    }

    public Boolean getHas_more() {
        return has_more;
    }

    public void setHas_more(Boolean has_more) {
        this.has_more = has_more;
    }

    public List getClaims() {
        return claims;
    }

    public void setClaims(List claims) {
        this.claims = claims;
    }
    


}
