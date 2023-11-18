package com.smart.cleanup.SmartCleanUp.Oracle.SmartRepo;

import com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart.STG_CIC_POLICY;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CicPolicyRepo extends JpaRepository<STG_CIC_POLICY, String> {

    @Query(
            value = "SELECT DISTINCT * FROM API_CIC_OWNER.STG_CIC_POLICY " +
                    "WHERE ABACUS_RESPONSE LIKE %:suffix AND PICKED_STATUS = :pickedStatus AND ROWNUM <=1",
            nativeQuery = true
    )
    STG_CIC_POLICY AllPolicyWithPickedStatus2(int pickedStatus, @Param("suffix") String suffix);

    @Modifying
    @Query(
            value = "UPDATE API_CIC_OWNER.STG_CIC_POLICY " +
                    "SET PICKED_STATUS = 0, ABACUS_RESPONSE = '', " +
                    "POL_NAME = :polName WHERE CLN_POL_CODE=:clnPolCode",
            nativeQuery = true
    )
    @Transactional
    void updatePolName(@Param("clnPolCode") String clnPolCode, @Param("polName") String polName);

    /*UPDATE API_CIC_OWNER.STG_CIC_POLICY " +
                    "SET PICKED_STATUS=0,ABACUS_RESPONSE=''," +
                    "POL_NAME=:polName+'_'+:clnPolCode WHERE CLN_POL_CODE:clnPolCode*/
    @Modifying
    @Query(
            value = "UPDATE API_CIC_OWNER.STG_CIC_POLICY SET PICKED_STATUS=2,ABACUS_RESPONSE=:abacusResponse,POL_NAME=:polName WHERE CLN_POL_CODE:clnPolCode",
            nativeQuery = true
    )
    @Transactional
    void updatePolNameBack(@Param("clnPolCode") String clnPolCode, @Param("polName") String polName, String abacusResponse);
}
