package c.s.integ.interfaces;

import org.json.simple.DeserializationException;
import org.json.simple.JsonArray;
import org.json.simple.JsonObject;
import org.json.simple.Jsoner;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.math.BigDecimal;
import javax.sql.DataSource;

public interface IAlertService {

    void testAlerts();
    void sendHourlyAlerts();
    void sendDailyAlerts();
    void sendWeeklyAlerts();
    void sendMonthlyAlerts();

    void sendUAPSSAlerts();

    void sendUAPKEAlerts();

    void sendUAPUGAlerts();

	}