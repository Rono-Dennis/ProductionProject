package com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.Date;

@Data
@Entity
@Table(name = "MAP_CIC_COMPANIES", schema = "API_CIC_OWNER", catalog = "")
public class MapCicCompanies {


    @Column(name = "CLN_CODE")
    private String clnCode;

    @Basic
    @Column(name = "COMPANY_NAME")
    private String companyName;

    @Id
    @Basic
    @Column(name = "POL_ID")
    private String polId;

    @Basic
    @Column(name = "STATUS")
    private Long status;

    @Basic
    @Column(name = "SMART_CODE2")
    private String smartCode2;

    @Basic
    @Column(name = "ALPHACOUNT")
    private Long alphaCount;

    @Basic
    @Column(name = "CLN_POL_CODE")
    private String clnPolCode;

    @Basic
    @Column(name = "CLN_POL_CODE_CLIENT")
    private String clnPolCodeClient;

    @Basic
    @Column(name = "MAPPED_BY")
    private String mappedBy;

    @Basic
    @Column(name = "INSERT_DATE")
    private Timestamp insertDate;

    @Basic
    @Column(name = "MEM_TYPE")
    private Long memType;

    @Basic
    @Column(name = "DELIMITER_FLAG")
    private Long delimiterFlag;

    @Basic
    @Column(name = "START_DATE")
    private Date startDate;

    @Basic
    @Column(name = "DELIMITER")
    private String delimiter;

    @Basic
    @Column(name = "POLICY_CURRENCY_CODE")
    private String policyCurrencyCode;

    @Basic
    @Column(name = "ABACUS_RESPONSE")
    private String abacusResponse;

    // Add getters and setters as needed
}

