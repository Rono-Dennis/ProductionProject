package com.smart.cleanup.SmartCleanUp.Oracle.SmartRepo;

import com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart.FinCoverPeriods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SouthSudanFinCoverPeriods extends JpaRepository<FinCoverPeriods, String> {
}
