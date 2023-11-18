package com.smart.cleanup.SmartCleanUp.Oracle.SmartRepo;

import com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart.Schemes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SouthSudanSchemeRepo extends JpaRepository<Schemes, String> {
}
