package lol.kent.practice.basic.date;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年12月25日 16:09
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class DayOfWeekEnumTest {

    public static void main(String[] args) {
        System.out.println(DayOfWeek.MONDAY.getDisplayName(TextStyle.FULL, Locale.getDefault()));

        long hoursOfADay = TimeUnit.DAYS.toHours(1);
        System.out.println(hoursOfADay);

        for (int i = 0; i < 10; i++) {
            String time = String.valueOf(System.currentTimeMillis());
            System.out.println(time.substring(5, 13));
        }
    }

}
