package com.smart.cleanup.SmartCleanUp.Mysql.MysqlRepo;

import com.smart.cleanup.SmartCleanUp.Mysql.MysqlModel.PolicyTracker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyTrackerRepo extends JpaRepository<PolicyTracker, String> {
}
