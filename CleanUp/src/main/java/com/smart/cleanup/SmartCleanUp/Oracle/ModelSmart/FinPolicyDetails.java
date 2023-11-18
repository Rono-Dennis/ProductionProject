package com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fin_policy_details", schema = "ABACUS", catalog = "")
public class FinPolicyDetails {
    @Id
    @Basic
    @Column(name = "POL_ID")
    private int polId;

    @Basic
    @Column(name = "CLIENT_ID")
    private int clientId;

    @Basic
    @Column(name = "POL_NAME")
    private String polName;

    @Basic
    @Column(name = "SCHEME_CODE")
    private String schemeCode;

    @Basic
    @Column(name = "START_DATE")
    private Date startDate;

    @Basic
    @Column(name = "END_DATE")
    private Date endDate;

    @Basic
    @Column(name = "STATUS")
    private String status;

    @Basic
    @Column(name = "SMART_CODE")
    private String smartCode;

    @Basic
    @Column(name = "POLICY_NUMBER")
    private String policyNumber;

    @Basic
    @Column(name = "POL_TYPE_ID")
    private int polTypeId;

    @Basic
    @Column(name = "DATE_ADDED")
    private Date dateAdded;

    @Basic
    @Column(name = "POL_CODE")
    private String polCode;

    @Basic
    @Column(name = "NO_PRIN_SUFFIX")
    private int noPrinSuffix;

    @Basic
    @Column(name = "PREFIX")
    private String prefix;

    @Basic
    @Column(name = "DEP_CODE_FORMAT")
    private String depCodeFormat;

    @Basic
    @Column(name = "IS_ROAMING")
    private int isRoaming;

    @Basic
    @Column(name = "CUTOFF_AGE")
    private int cutoffAge;

    @Basic
    @Column(name = "LINE_STATUS")
    private String lineStatus;

    @Basic
    @Column(name = "LINE_USER")
    private String lineUser;

    @Basic
    @Column(name = "COUNTRY_CODE")
    private String countryCode;

    @Basic
    @Column(name = "CURRENCY_CODE")
    private String currencyCode;

    @Basic
    @Column(name = "ROAMING_COUNTRIES")
    private String roamingCountries;

    @Basic
    @Column(name = "IS_TSC")
    private int isTsc;

    @Basic
    @Column(name = "LEGACY_POL_ID")
    private int legacyPolId;

    @Basic
    @Column(name = "LEGACY_CLIENT_ID")
    private int legacyClientId;

    @Basic
    @Column(name = "BO_ID")
    private int boId;

    @Basic
    @Column(name = "IS_MGT")
    private int isMgt;

    @Basic
    @Column(name = "IS_MULTICARD")
    private int isMulticard;

    @Basic
    @Column(name = "ABACUS_LIVE")
    private int abacusLive;

    @Basic
    @Column(name = "ABACUS_INSERT_TIME")
    private Date abacusInsertTime;

    @Basic
    @Column(name = "PERIOD_ID")
    private int periodId;

    @Basic
    @Column(name = "POLICY_CURRENCY_ID")
    private int policyCurrencyId;

    @Basic
    @Column(name = "FP_REUSE")
    private int fpReuse;

    @Basic
    @Column(name = "ROAMING_LEVEL")
    private int roamingLevel;

    @Basic
    @Column(name = "IS_INHOUSE")
    private int isInhouse;

    @Basic
    @Column(name = "PRIN_SUFFIX_COUNT")
    private int prinSuffixCount;

    @Basic
    @Column(name = "IS_TEST_SCHEME")
    private int isTestScheme;

    @Basic
    @Column(name = "IS_MULTI_CATEGORY")
    private int isMultiCategory;

    @Basic
    @Column(name = "IS_CARD_COST")
    private int isCardCost;

    @Basic
    @Column(name = "IS_MEMBER_COST")
    private int isMemberCost;

    @Basic
    @Column(name = "CARD_COST")
    private int cardCost;

    @Basic
    @Column(name = "MEMBER_COST")
    private int memberCost;

    @Basic
    @Column(name = "CARD_COST_POOL")
    private int cardCostPool;

    @Basic
    @Column(name = "MEMBER_COST_POOL")
    private int memberCostPool;

    @Basic
    @Column(name = "STATUS_EVENT_USER")
    private String statusEventUser;

    @Basic
    @Column(name = "STATUS_EVENT_MSG")
    private String statusEventMsg;

    @Basic
    @Column(name = "IS_CASH_TIER")
    private int isCashTier;

    @Basic
    @Column(name = "PREFERRED_PROV_SPLIT")
    private int preferredProvSplit;

    @Basic
    @Column(name = "IS_LOYALTY")
    private int isLoyalty;

    @Basic
    @Column(name = "IS_NOTIFY")
    private int isNotify;

    @Basic
    @Column(name = "NOTIFY_EMAILS")
    private String notifyEmails;

    @Basic
    @Column(name = "ALERT_GROUP_FUND")
    private int alertGroupFund;

    @Basic
    @Column(name = "FUND_ADMIN_CLAIM_TYPE")
    private int fundAdminClaimType;

    @Basic
    @Column(name = "FUND_ADMIN_CLAIM_RATE")
    private double fundAdminClaimRate;

    @Basic
    @Column(name = "FUND_ADMIN_MEM_RATE")
    private double fundAdminMemRate;

    @Basic
    @Column(name = "FUND_ADMIN_VAT_RATE")
    private double fundAdminVatRate;

    @Basic
    @Column(name = "FUND_ADMIN_EXCISE_RATE")
    private double fundAdminExciseRate;

    @Basic
    @Column(name = "FUND_ALERT_FROM")
    private int fundAlertFrom;

    @Basic
    @Column(name = "CUTOFF_RULE_LEVEL")
    private int cutoffRuleLevel;

    @Basic
    @Column(name = "CUTOFF_YEARS")
    private int cutoffYears;

    @Basic
    @Column(name = "CUTOFF_MONTHS")
    private int cutoffMonths;

    @Basic
    @Column(name = "IS_CUTOFF")
    private int isCutoff;

    @Basic
    @Column(name = "CUTOFF_MEM_TYPE")
    private int cutoffMemType;

    @Basic
    @Column(name = "USER_ID")
    private int userId;

    @Basic
    @Column(name = "WS_METHOD")
    private String wsMethod;

    @Basic
    @Column(name = "WS_OBJECT")
    private String wsObject;

    @Basic
    @Column(name = "INTEG_SCHEME_CODE")
    private String integSchemeCode;

    @Basic
    @Column(name = "IS_STANDARD_POOL")
    private int isStandardPool;

    @Basic
    @Column(name = "CUST_ID")
    private int custId;

    @Basic
    @Column(name = "INTEG_SCHEME_NAME")
    private String integSchemeName;

    @Basic
    @Column(name = "SPLIT_PC_MEMBER")
    private int splitPcMember;

    @Basic
    @Column(name = "IS_CARDLESS")
    private int isCardless;

    @Basic
    @Column(name = "IS_OTP")
    private int isOtp;

    @Basic
    @Column(name = "OTP")
    private String otp;

    @Basic
    @Column(name = "SPLIT_PC_MEMBER_COPAY")
    private int splitPcMemberCopay;

    @Basic
    @Column(name = "SPLIT_PC_MEMBER_COPAY_REIMB")
    private int splitPcMemberCopayReimb;

    @Basic
    @Column(name = "SPLIT_PC_MEMBER_CUTOFF")
    private int splitPcMemberCutoff;

    @Basic
    @Column(name = "IS_STATUS")
    private int isStatus;

    @Basic
    @Column(name = "TO_STATUS")
    private int toStatus;

    @Basic
    @Column(name = "TO_STATUS_TIME")
    private Date toStatusTime;

    @Basic
    @Column(name = "STATUS_SOURCE")
    private String statusSource;

    @Basic
    @Column(name = "STATUS_USER_ID")
    private int statusUserId;

    @Basic
    @Column(name = "STATUS_CHANGE_REASON")
    private String statusChangeReason;

    @Basic
    @Column(name = "TO_STATUS_MSG")
    private String toStatusMsg;

    @Basic
    @Column(name = "IS_INHERIT_POOLMAP")
    private int isInheritPoolmap;

    @Basic
    @Column(name = "IS_IGNORE_BTS")
    private int isIgnoreBts;

}
