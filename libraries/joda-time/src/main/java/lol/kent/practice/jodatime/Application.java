package lol.kent.practice.jodatime;

import com.google.common.collect.Lists;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
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
        DateTime dateTime = new DateTime(DateTimeZone.UTC);
        System.out.println(dateTime.toString("yyyyMMdd"));
        System.out.println(String.format("water:%s:usr:643f992d0f60235e492fe6ca", dateTime.toString("yyyyMMdd")));
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getMonthOfYear());
        System.out.println(dateTime.getHourOfDay() + ":" + dateTime.getMinuteOfHour());

        DateTimeFormatter fmt = ISODateTimeFormat.dateTime();
//        DateTimeFormatter fmt2 = DateTimeFormat
//                .forPattern(java.time.format.DateTimeFormatter.ISO_DATE.toString());

//        System.out.println(fmt.print(dateTime));

        DateTime date = DateTime.now();
        DateTime dateAfterOneWeek = date.plusWeeks(1);
        List<DateTime> weekDate = Lists.newArrayList();
        while (date.isBefore(dateAfterOneWeek)) {
            weekDate.add(date);
            date = date.plusDays(1);
        }

        System.out.println(weekDate.get(6).toDateTimeISO());

        DateTime b = new DateTime();
        System.out.println(b.dayOfWeek().get());
        b = b.withYear(2023).withDayOfWeek(1).withWeekOfWeekyear(20);
        System.out.println(b);
        b = b.withYear(2023).withDayOfWeek(7).withWeekOfWeekyear(20);
        System.out.println(b);

    }

}
