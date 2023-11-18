package com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "integ_master2_schemes", schema = "ABACUS", catalog = "")
public class Schemes {
    @Id
    @Column(name = "TX_ID")
    private String TX_ID;

    @Column(name = "AUTO_ID")
    private String AUTO_ID;

    @Column(name = "AUTO_TIME")
    private String AUTO_TIME;

    @Column(name = "UPDATE_COUNT")
    private int UPDATE_COUNT;

    @Column(name = "SM_CUST_ID")
    private String SM_CUST_ID;

    @Column(name = "SM_POL_ID")
    private String SM_POL_ID;

    @Column(name = "SM_POLICY_CURRENCY_ID")
    private String SM_POLICY_CURRENCY_ID;

    @Column(name = "CS_INTEG_CUST_ID")
    private String CS_INTEG_CUST_ID;

    @Column(name = "CS_CUST_CODE")
    private String CS_CUST_CODE;

    @Column(name = "CS_POL_NAME")
    private String CS_POL_NAME;

    @Column(name = "CS_INTEG_SCHEME_CODE")
    private String CS_INTEG_SCHEME_CODE;

    @Column(name = "CS_START_DATE")
    private String CS_START_DATE;

    @Column(name = "CS_END_DATE")
    private String CS_END_DATE;

    @Column(name = "CS_STATUS")
    private String CS_STATUS;

    @Column(name = "CS_POLICY_NUMBER")
    private String CS_POLICY_NUMBER;

    @Column(name = "CS_POL_TYPE_ID")
    private int CS_POL_TYPE_ID;

    @Column(name = "CS_DATE_ADDED")
    private String CS_DATE_ADDED;

    @Column(name = "CS_ROAMING_COUNTRIES")
    private String CS_ROAMING_COUNTRIES;

    @Column(name = "CS_IS_CUTOFF")
    private int CS_IS_CUTOFF;

    @Column(name = "CS_CUTOFF_AGE")
    private int CS_CUTOFF_AGE;

    @Column(name = "CS_COUNTRY_CODE")
    private String CS_COUNTRY_CODE;

    @Column(name = "CS_CURRENCY_CODE")
    private String CS_CURRENCY_CODE;

    @Column(name = "CS_CUTOFF_RULE_LEVEL")
    private int CS_CUTOFF_RULE_LEVEL;

    @Column(name = "CS_CUTOFF_YEARS")
    private int CS_CUTOFF_YEARS;

    @Column(name = "CS_CUTOFF_MONTHS")
    private int CS_CUTOFF_MONTHS;

    @Column(name = "CS_CUTOFF_MEM_TYPE")
    private String CS_CUTOFF_MEM_TYPE;

    @Column(name = "CS_LINE_USER")
    private String CS_LINE_USER;

    @Column(name = "CS_USER_ID")
    private String CS_USER_ID;

    @Column(name = "CS_WS_OBJECT")
    private String CS_WS_OBJECT;

    @Column(name = "CS_WS_ACTION")
    private String CS_WS_ACTION;

    @Column(name = "CS_WS_DATA")
    private String CS_WS_DATA;

    @Column(name = "OLD_START_DATE")
    private String OLD_START_DATE;

    @Column(name = "OLD_END_DATE")
    private String OLD_END_DATE;

    @Column(name = "IS_PERIOD_NEW")
    private int IS_PERIOD_NEW;

    @Column(name = "IS_PERIOD_EDIT")
    private int IS_PERIOD_EDIT;

    @Column(name = "OLD_STATUS")
    private String OLD_STATUS;

    @Column(name = "IS_STATUS")
    private int IS_STATUS;

    @Column(name = "OLD_ROAMING_COUNTRIES")
    private String OLD_ROAMING_COUNTRIES;

    @Column(name = "IS_ROAMING")
    private int IS_ROAMING;

    @Column(name = "OLD_CUTOFF_YEARS")
    private int OLD_CUTOFF_YEARS;

    @Column(name = "OLD_CUTOFF_MONTHS")
    private int OLD_CUTOFF_MONTHS;

    @Column(name = "IS_CUTOFF")
    private int IS_CUTOFF;

    @Column(name = "WS_ACTION")
    private String WS_ACTION;

    @Column(name = "ACTIONS")
    private String ACTIONS;

    @Column(name = "ACTION_COUNT")
    private int ACTION_COUNT;

    @Column(name = "ACTION_COUNT_DONE")
    private int ACTION_COUNT_DONE;

    @Column(name = "ACTION_COUNT_FAILED")
    private int ACTION_COUNT_FAILED;

    @Column(name = "OLD_IS_CUTOFF")
    private int OLD_IS_CUTOFF;

    @Column(name = "POL_ID")
    private String POL_ID;

    @Column(name = "REFRESH_TIME")
    private String REFRESH_TIME;

    @Column(name = "ACTION_MSG")
    private String ACTION_MSG;

    @Column(name = "CUST_ID")
    private String CUST_ID;

    @Column(name = "SM_USER_ID")
    private String SM_USER_ID;

    @Column(name = "IS_MARKBACK")
    private int IS_MARKBACK;
}
