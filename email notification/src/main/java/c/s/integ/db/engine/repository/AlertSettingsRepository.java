package c.s.integ.db.engine.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.PagingAndSortingRepository;

// import c.s.integ.sync.reso.interfaces.IViewMembership;
// import c.s.integ.sync.reso.model.ViewMembership;

// import c.s.integ.sync.smart.model.MapMembers;
// import c.s.integ.sync.smart.model.MapPolicies;
import c.s.integ.db.engine.model.AlertSettings;

public interface AlertSettingsRepository extends PagingAndSortingRepository<AlertSettings, Long> {

    
    @Query(value = "SELECT A "
    + "FROM AlertSettings as A "
    + "WHERE is_active = 1 AND frequency = ?1 "
    )
    List<AlertSettings> getAlertsByFrequency(String frequency);

    @Query(value = "SELECT A "
        + "FROM AlertSettings as A "
        + "WHERE is_active = 1 "
        )
    List<AlertSettings> getAllAlerts();
  
    @Query(value = "SELECT A "
        + "FROM AlertSettings as A "
        + "WHERE is_active = 0 AND id = 3 "       
        )
    List<AlertSettings> getBigAlertTest();


    @Query(value = "SELECT A "
    + "FROM AlertSettings as A "
    + "WHERE is_active = 1 AND frequency = ?1 AND daily_at = ?2 "
    )
    List<AlertSettings> getAlertsAt(String frequency, Integer hour);

    @Query(value = "SELECT A "
            + "FROM AlertSettings as A "
            + "WHERE is_active = 1 AND frequency = ?1 AND subject = ?2 "
    )
    List<AlertSettings> getAlertsByFrequencyAnsSubject(String s, String subject);

    @Query(value = "SELECT A "
            + "FROM AlertSettings as A "
            + "WHERE is_active = 1 AND subject = ?1 "
    )
    List<AlertSettings> getAlertsBySubject(String subject1);

    @Query(value = "SELECT A "
            + "FROM AlertSettings as A "
            + "WHERE is_active = 1 AND id = ?1 AND subject = ?2"
    )
    List<AlertSettings> getAlertsByIdAndSubject(Integer id, String subjectSS);
}

