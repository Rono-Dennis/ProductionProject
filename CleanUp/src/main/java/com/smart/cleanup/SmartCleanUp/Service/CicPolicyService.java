package com.smart.cleanup.SmartCleanUp.Service;

import com.smart.cleanup.SmartCleanUp.Mysql.MysqlModel.MysqlCicPolicy;
import com.smart.cleanup.SmartCleanUp.Mysql.MysqlModel.PolicyTracker;
import com.smart.cleanup.SmartCleanUp.Mysql.MysqlRepo.MysqlRepo;
import com.smart.cleanup.SmartCleanUp.Mysql.MysqlRepo.PolicyTrackerRepo;
import com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart.MapCicCompanies;
import com.smart.cleanup.SmartCleanUp.Oracle.SmartRepo.CicPolicyRepo;
import com.smart.cleanup.SmartCleanUp.Oracle.ModelSmart.STG_CIC_POLICY;
import com.smart.cleanup.SmartCleanUp.Oracle.SmartRepo.MapCicCompaniesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

@Service
public class CicPolicyService {

    Logger log = Logger.getLogger(CicPolicyService.class.getName());
    private final int PickedStatus =2;
    @Autowired
    private CicPolicyRepo cicPolicyRepo;
    @Autowired
    private MysqlRepo cicMysqlRepo;
    @Autowired
    private PolicyTrackerRepo policyTrackerRepo;

    @Autowired
    private MapCicCompaniesRepo mapCicCompaniesRepo;

    public void InitiateCicAlreadyExistProcess() {
        System.out.println("getting data");
        final STG_CIC_POLICY PolicyWithPickedStatus2 = getAllPolicyWithPickedStatus2();
        System.out.println(PolicyWithPickedStatus2);
        if (UpdateSchemePickedStatus(PolicyWithPickedStatus2)){
            System.out.println("POLICY UPDATED");

            List<MysqlCicPolicy> mysqlCicPolicy = findClnPolCodeIfExist();
            for (MysqlCicPolicy cicPolicy : mysqlCicPolicy) {
                if (cicPolicy.getClnPolCode().equals(PolicyWithPickedStatus2.getClnPolCode())){
                    System.out.println("EVERYTHING FAILED UPDATED");
                    UpdateSchemePickedStatusBack(PolicyWithPickedStatus2);
                }else {
                    InsertToTrackerAndStaging(PolicyWithPickedStatus2);
                }
            }
        }else {
            System.out.println("FAILED TO UPDATE");
            throw new RuntimeException("Failed to update scheme picked status.");
        }
        if (InsertToTrackerAndStaging(PolicyWithPickedStatus2)){
            System.out.println("EVERYTHING UPDATED SUCCESSFULLY");
        }else {
            System.out.println("EVERYTHING FAILED UPDATED");
            UpdateSchemePickedStatusBack(PolicyWithPickedStatus2);
        }
    }


    public STG_CIC_POLICY getAllPolicyWithPickedStatus2(){
        return cicPolicyRepo.AllPolicyWithPickedStatus2(PickedStatus, "already exists");
    }

    public boolean UpdateSchemePickedStatus(STG_CIC_POLICY policyWithPickedStatus2) {
        String newPolName= policyWithPickedStatus2.getPolName()+'_'+policyWithPickedStatus2.getClnPolCode();
        System.out.println("new PolName "+newPolName);
        try {
            cicPolicyRepo.updatePolName(policyWithPickedStatus2.getClnPolCode(), newPolName);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean UpdateSchemePickedStatusBack(STG_CIC_POLICY policyWithPickedStatus2) {
        try {
            cicPolicyRepo.updatePolNameBack(policyWithPickedStatus2.getClnPolCode(), policyWithPickedStatus2.getPolName(), policyWithPickedStatus2.getAbacusResponse());
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Transactional
    public boolean InsertToTrackerAndStaging(STG_CIC_POLICY policyWithPickedStatus2) {
        try {
            MysqlCicPolicy mysqlCicPolicy = mapToMysqlCicPolicy(policyWithPickedStatus2);
            PolicyTracker policyTracker = mapToPolicyTracker(policyWithPickedStatus2);

            cicMysqlRepo.save(mysqlCicPolicy);
            policyTrackerRepo.save(policyTracker);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    MysqlCicPolicy mapToMysqlCicPolicy(STG_CIC_POLICY policyWithPickedStatus2) {
        MysqlCicPolicy mysqlCicPolicy = new MysqlCicPolicy();
        mysqlCicPolicy.setRecId(policyWithPickedStatus2.getRecId());
        mysqlCicPolicy.setPolicyNumber(policyWithPickedStatus2.getPolicyNumber());
        mysqlCicPolicy.setPolName(policyWithPickedStatus2.getPolName());
        mysqlCicPolicy.setStartDate(policyWithPickedStatus2.getStartDate());
        mysqlCicPolicy.setEndDate(policyWithPickedStatus2.getEndDate());
        mysqlCicPolicy.setPolicyCurrencyId(policyWithPickedStatus2.getPolicyCurrencyId());
        mysqlCicPolicy.setPolTypeId(policyWithPickedStatus2.getPolTypeId());
        mysqlCicPolicy.setUserId(policyWithPickedStatus2.getUserId());
        mysqlCicPolicy.setActionedDate(policyWithPickedStatus2.getActionedDate());
        mysqlCicPolicy.setClnCode(policyWithPickedStatus2.getClnCode());
        mysqlCicPolicy.setClnPolType(policyWithPickedStatus2.getClnPolType());
        mysqlCicPolicy.setClnPolCode(policyWithPickedStatus2.getClnPolCode());
        mysqlCicPolicy.setClnPolCodeClient(policyWithPickedStatus2.getClnPolCodeClient());
        mysqlCicPolicy.setAnniv(policyWithPickedStatus2.getAnniv());
        mysqlCicPolicy.setCountryCode(policyWithPickedStatus2.getCountryCode());
        mysqlCicPolicy.setConfirmed(policyWithPickedStatus2.getConfirmed());
        mysqlCicPolicy.setPickedStatus(policyWithPickedStatus2.getPickedStatus());
        return mysqlCicPolicy;
    }

    private PolicyTracker mapToPolicyTracker(STG_CIC_POLICY policyWithPickedStatus2) {
        PolicyTracker policyTracker = new PolicyTracker();
        policyTracker.setRecId(policyWithPickedStatus2.getRecId());
        policyTracker.setPolicyNumber(policyWithPickedStatus2.getPolicyNumber());
        policyTracker.setPolName(policyWithPickedStatus2.getPolName());
        policyTracker.setStartDate(policyWithPickedStatus2.getStartDate());
        policyTracker.setEndDate(policyWithPickedStatus2.getEndDate());
        policyTracker.setPolicyCurrencyId(policyWithPickedStatus2.getPolicyCurrencyId());
        policyTracker.setPolTypeId(policyWithPickedStatus2.getPolTypeId());
        policyTracker.setUserId(policyWithPickedStatus2.getUserId());
        policyTracker.setActionedDate(policyWithPickedStatus2.getActionedDate());
        policyTracker.setClnCode(policyWithPickedStatus2.getClnCode());
        policyTracker.setClnPolType(policyWithPickedStatus2.getClnPolType());
        policyTracker.setClnPolCode(policyWithPickedStatus2.getClnPolCode());
        policyTracker.setClnPolCodeClient(policyWithPickedStatus2.getClnPolCodeClient());
        policyTracker.setAnniv(policyWithPickedStatus2.getAnniv());
        policyTracker.setCountryCode(policyWithPickedStatus2.getCountryCode());
        policyTracker.setConfirmed(policyWithPickedStatus2.getConfirmed());
        policyTracker.setPickedStatus(policyWithPickedStatus2.getPickedStatus());
        return policyTracker;
    }

    public List<MysqlCicPolicy> findClnPolCodeIfExist() {
        return cicMysqlRepo.findAll();
    }

    public void AlignMemType() {
       List<MapCicCompanies> mapCicCompanies= mapCicCompaniesRepo.findFirstByMemType(0L);
        log.info("CIC COMPANIES "+mapCicCompanies);
        log.info("size "+mapCicCompanies.size());
       for (MapCicCompanies company : mapCicCompanies) {
            // Access attributes of MapCicCompanies object
            String polId = company.getPolId();
            mapCicCompaniesRepo.updateMemTypeByPolId(polId);
           log.info("MEM_TYPE UPDATED");
        }
    }
}
