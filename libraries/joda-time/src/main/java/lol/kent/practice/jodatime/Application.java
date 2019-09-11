package lol.kent.practice.jodatime;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年09月11日 11:50
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class Application {


    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonthOfYear());
        System.out.println(dateTime.getHourOfDay() + ":" + dateTime.getMinuteOfHour());

        DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
        DateTimeFormatter fmt2 = DateTimeFormat
                .forPattern(java.time.format.DateTimeFormatter.ISO_DATE.toString());

        System.out.println(fmt.print(dateTime));
    }

}
