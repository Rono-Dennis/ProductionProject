package c.s.integ.db.engine.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

// import c.s.integ.sync.reso.interfaces.IViewMembership;
// import c.s.integ.sync.reso.model.ViewMembership;

// import c.s.integ.sync.smart.model.MapMembers;
// import c.s.integ.sync.smart.model.MapPolicies;
import c.s.integ.db.engine.model.DataUpdateSettings;

public interface DataUpdateSettingsRepository extends PagingAndSortingRepository<DataUpdateSettings, Long> {

    
    // @Query(value = "SELECT A "
    // + "FROM DataUpdateSettings as A "
    // + "WHERE is_active = 1 AND frequency = ?1 "
    // )
    // List<DataUpdateSettings> getDataUpdateByFrequency(String frequency);

    // @Query(value = "SELECT A "
    //     + "FROM DataUpdateSettings as A "
    //     + "WHERE is_active = 1 "
    //     )
    // List<DataUpdateSettings> getAllDataUpdates();
  
    @Query(value = "SELECT upd "
        + "FROM DataUpdateSettings as upd "
        + "WHERE upd.id IN (1,2,3,4,5)"       
        )
    List<DataUpdateSettings> getBigDataUpdateTest();


    @Query(value = "SELECT A "
    + "FROM DataUpdateSettings as A "
    + "WHERE is_active = 1 AND frequency = ?1 "
        )
    List<DataUpdateSettings> getUpdatesByFrequency(String frequency);

    @Query(value = "SELECT A "
    + "FROM DataUpdateSettings as A "
    + "WHERE is_active = 1 AND frequency = ?1 AND daily_at = ?2 "
    )
    List<DataUpdateSettings> getUpdatesAt(String frequency, Integer hour);
    
    }

