package com.smart.cleanup.SmartCleanUp.Mysql.MysqlRepo;

import com.smart.cleanup.SmartCleanUp.Mysql.MysqlModel.MysqlCicPolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MysqlRepo extends JpaRepository<MysqlCicPolicy, String> {
}
