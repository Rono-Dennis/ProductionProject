package c.s.integ.daemon;

import c.s.integ.db.engine.model.AlertSettings;
import c.s.integ.db.engine.repository.AlertSettingsRepository;
import c.s.integ.services.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class AlertServiceKE {

    @Autowired
    private AlertService alertService;

    @Autowired
    private AlertSettingsRepository alertSettingsRepo;
    Logger log = Logger.getLogger(AlertServiceKE.class.getName());
    public void sendUAPKEAlerts() {
        log.info("..EXCEPTIONAL ALERTS KE...");
        String subjectKe = "EXCEPTIONAL ALERTS CLAIMS UAP";
        Integer id =135;
        List<AlertSettings> Alerts = alertSettingsRepo.getAlertsByIdAndSubject(id, subjectKe);
        for (AlertSettings alertSettings: Alerts){
            alertSettings.getRecepients();
            log.info("recipients "+ alertSettings.getRecepients());
        }
        log.info("alerts size is "+ Alerts.size());
        alertService.doBigAlerts(Alerts);
    }


}
