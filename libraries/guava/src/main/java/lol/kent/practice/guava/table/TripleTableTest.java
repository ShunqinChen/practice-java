package lol.kent.practice.guava.table;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import java.time.DayOfWeek;

/**
 * <pre>
 *    类描述: 三元数据结构测试
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年12月25日 15:50
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class TripleTableTest {


    public static void main(String[] args) {
        Table<DayOfWeek, String, Boolean> calender = HashBasedTable.create();
        calender.put(DayOfWeek.MONDAY, "9:00-10:00", false);

        System.out.println(calender.get(DayOfWeek.MONDAY, "9:00-10:00"));
    }

}
