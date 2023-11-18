package com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fin_cover_periods", schema = "ABACUS", catalog = "")
public class FinCoverPeriods {
    @Id
    @Basic
    @Column(name = "ID")
    private int id;

    @Basic
    @Column(name = "INSERT_TIME")
    private Timestamp insertTime;

    @Basic
    @Column(name = "LOADED_BY")
    private String loadedBy;

    @Basic
    @Column(name = "POL_TYPE_ID")
    private int polTypeId;

    @Basic
    @Column(name = "POL_ID")
    private int polId;

    @Basic
    @Column(name = "SERVICE_TYPE_ID")
    private int serviceTypeId;

    @Basic
    @Column(name = "BEN_ID")
    private int benId;

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
    @Column(name = "RENEWED_ON")
    private Timestamp renewedOn;

    @Basic
    @Column(name = "EXPIRED_ON")
    private Timestamp expiredOn;

    @Basic
    @Column(name = "ACC_ID")
    private int accId;

    @Basic
    @Column(name = "GLOBAL_ID")
    private String globalId;

    @Basic
    @Column(name = "REDIS_INDEX")
    private int redisIndex;


}
