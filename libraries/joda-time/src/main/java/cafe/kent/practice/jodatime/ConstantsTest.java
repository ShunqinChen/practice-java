package cafe.kent.practice.jodatime;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import java.time.DayOfWeek;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年12月26日 15:19
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class ConstantsTest {


    public static void main(String[] args) {

        Table<DayOfWeek, String, Boolean> calender = HashBasedTable.create();

        final String timeFormat = "%d:00-%d:00";
        final int startWorkHoursOfDay = 7;
        final int endWorkHoursOfDay = 23;

        for (DayOfWeek day : DayOfWeek.values()) {
            for (int i = startWorkHoursOfDay; i <= endWorkHoursOfDay; i++) {
                String timeRange = String.format(timeFormat, i, i + 1);
                calender.put(day, timeRange, false);
            }
        }

        System.out.println(calender);
    }

}
