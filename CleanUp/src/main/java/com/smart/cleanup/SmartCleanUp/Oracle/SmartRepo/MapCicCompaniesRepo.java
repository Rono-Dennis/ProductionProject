package com.smart.cleanup.SmartCleanUp.Oracle.SmartRepo;

import com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart.MapCicCompanies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface MapCicCompaniesRepo  extends JpaRepository<MapCicCompanies, String> {

    @Query(
            value = "SELECT * FROM API_CIC_OWNER.MAP_CIC_COMPANIES mcc WHERE MEM_TYPE = 0 AND ROWNUM <=10",
            nativeQuery = true
    )
    List<MapCicCompanies> findFirstByMemType(long l);

    @Modifying
    @Query(
            value = "UPDATE API_CIC_OWNER.MAP_CIC_COMPANIES SET MEM_TYPE =1 WHERE POL_ID=:polId",
            nativeQuery = true
    )
    @Transactional
    void updateMemTypeByPolId(String polId);
}
