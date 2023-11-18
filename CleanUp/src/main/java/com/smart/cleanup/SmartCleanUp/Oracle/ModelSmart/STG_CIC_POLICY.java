package com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "STG_CIC_POLICY", schema = "API_CIC_OWNER", catalog = "")
public class STG_CIC_POLICY {

    @Id
//    @SequenceGenerator(name = "STG_UAP_UG_SEQ_GEN", allocationSize = 1, sequenceName="API_UAP_OWNER.CLAIM_ID_SEQ")
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STG_UAP_UG_SEQ_GEN")
    @Column(name = "REC_ID")
    private Long recId;

    @Basic
    @Column(name = "POLICY_NUMBER")
    private String policyNumber;

    @Basic
    @Column(name = "POL_NAME")
    private String polName;

    @Basic
    @Column(name = "START_DATE")
    private Date startDate;

    @Basic
    @Column(name = "END_DATE")
    private Date endDate;

    @Basic
    @Column(name = "COM_ID")
    private Long comId;

    @Basic
    @Column(name = "STATUS")
    private String status;

    @Basic
    @Column(name = "SMART_CODE")
    private String smartCode;

    @Basic
    @Column(name = "CUT_OFF_IND")
    private Character cutOffInd;

    @Basic
    @Column(name = "CUT_OFF_AGE")
    private String cutOffAge;

    @Basic
    @Column(name = "INVOICE_PT")
    private String invoicePt;

    @Basic
    @Column(name = "INVOICE_CONTACT")
    private String invoiceContact;

    @Basic
    @Column(name = "INV_CONTACT_EMAIL")
    private String invContactEmail;

    @Basic
    @Column(name = "INV_PTCONTACT_TEL")
    private String invPtcontactTel;

    @Basic
    @Column(name = "DELIVERY_POINT")
    private String deliveryPoint;

    @Basic
    @Column(name = "DEL_CONTACT")
    private String delContact;

    @Basic
    @Column(name = "DEL_CONTACT_EMAIL")
    private String delContactEmail;

    @Basic
    @Column(name = "DEL_PTCONTACT_TEL")
    private String delPtcontactTel;

    @Basic
    @Column(name = "POLICY_CURRENCY_ID")
    private String policyCurrencyId;

    @Basic
    @Column(name = "CAPITATION_IND")
    private Character capitationInd;

    @Basic
    @Column(name = "CAPITATION_AMOUNT")
    private Long capitationAmount;

    @Basic
    @Column(name = "CAP_FREQOF_USE")
    private Long capFreqofUse;

    @Basic
    @Column(name = "CAP_WITHIN_DURATION")
    private Long capWithinDuration;

    @Basic
    @Column(name = "CAP_CONSEQ_IND")
    private Character capConseqInd;

    @Basic
    @Column(name = "POL_TYPE_ID")
    private Long polTypeId;

    @Basic
    @Column(name = "DATE_ADDED")
    private Date dateAdded;

    @Basic
    @Column(name = "USER_ID")
    private String userId;

    @Basic
    @Column(name = "CLAIM_GRACE_PERIOD")
    private Long claimGracePeriod;

    @Basic
    @Column(name = "SPEND_THRESPCT")
    private Long spendThrespct;

    @Basic
    @Column(name = "POLICY_STATUS")
    private Long policyStatus;

    @Basic
    @Column(name = "MODIFICATION_DATE")
    private Date modificationDate;

    @Basic
    @Column(name = "ACTIONED_DATE")
    private Date actionedDate;

    @Basic
    @Column(name = "CLN_CODE")
    private String clnCode;

    @Basic
    @Column(name = "AUTO_REPLENISH_IND")
    private Long autoReplenishInd;

    @Basic
    @Column(name = "CLN_POL_TYPE")
    private String clnPolType;

    @Basic
    @Column(name = "CLN_POL_CODE")
    private String clnPolCode;

    @Basic
    @Column(name = "CLN_POL_ID")
    private String clnPolId;

    @Basic
    @Column(name = "CLN_POL_CODE_CLIENT")
    private String clnPolCodeClient;

    @Basic
    @Column(name = "POLICY_CONV_RATE")
    private Long policyConvRate;

    @Basic
    @Column(name = "ANNIV")
    private Long anniv;

    @Basic
    @Column(name = "POL_ID")
    private Long polId;

    @Basic
    @Column(name = "INSURER_ID")
    private Long insurerId;

    @Basic
    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    @Basic
    @Column(name = "TRANS_STATUS")
    private String transStatus;

    @Basic
    @Column(name = "TRANS_STATUS_CODE")
    private Long transStatusCode;

    @Basic
    @Column(name = "CONFIRMED_NAME")
    private String confirmedName;

    @Basic
    @Column(name = "CONFIRMED")
    private Long confirmed;

    @Basic
    @Column(name = "PICKED_STATUS")
    private Long pickedStatus;

    @Basic
    @Column(name = "ROAMING_COUNTRIES")
    private String roamingCountries;

    @Basic
    @Column(name = "IS_ROAMING")
    private String isRoaming;

    @Basic
    @Column(name = "ALERT_SENT")
    private Long alertSent;

    @Basic
    @Column(name = "ALERT_SENT_DATE")
    private Timestamp alertSentDate;

    @Basic
    @Column(name = "ALERT_CONFIRMED")
    private Long alertConfirmed;

    @Basic
    @Column(name = "MAPPED_BY")
    private String mappedBy;

    @Basic
    @Column(name = "ABACUS_RESPONSE")
    private String abacusResponse;

    @Basic
    @Column(name = "PICKED_DATE")
    private Timestamp pickedDate;

}

