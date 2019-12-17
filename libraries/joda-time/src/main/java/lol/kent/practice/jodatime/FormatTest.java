package lol.kent.practice.jodatime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年12月17日 15:03
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class FormatTest {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date time = sf.parse("2019-10-10");

        System.out.println(time);

        DateTime jodaTime = new DateTime(time);
        System.out.println(jodaTime.toString("yyyy-MM-dd"));

        sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        time = sf.parse("2019-10-10 12:10:15");
        jodaTime = new DateTime(time);
        System.out.println(jodaTime.toString("HH:mm"));

        sf = new SimpleDateFormat("HH:mm:ss");
        time = sf.parse("12:10:15");
        jodaTime = new DateTime(time);
        System.out.println(jodaTime.toString("yyyy-MM-dd"));

        LocalDateTime localDateTime = LocalDateTime.fromDateFields(time);
        System.out.println(localDateTime.getDayOfMonth());
    }

}
