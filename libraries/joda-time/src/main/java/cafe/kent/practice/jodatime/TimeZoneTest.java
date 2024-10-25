package cafe.kent.practice.jodatime;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.TimeZone;

/**
 * <pre>
 *    Description:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2023年04月11日 22:33
 * <p>
 *
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class TimeZoneTest {

    public static void main(String[] args) {
        DateTime now = DateTime.now();
        System.out.println(now.toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println(now.withZone(DateTimeZone.forTimeZone(TimeZone.getTimeZone("GMT-08:00"))).toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println(now.withZone(DateTimeZone.forTimeZone(TimeZone.getTimeZone("UTC"))).toString("yyyy-MM-dd HH:mm:ss"));
    }
}
