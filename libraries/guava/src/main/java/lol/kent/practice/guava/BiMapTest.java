package lol.kent.practice.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * <pre>
 *    类描述:  bimap的作用很清晰：它是一个一一映射，可以通过key得到value，也可以通过value得到key
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2020年07月04日 11:09
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class BiMapTest {

    public static void main(String[] args) {
        BiMap<Long, String> idNameBiMap = HashBiMap.create();
        idNameBiMap.put(100L, "Kent");
        idNameBiMap.put(101L, "Bob");
        idNameBiMap.put(102L, "Rose");
        idNameBiMap.put(103L, "Billy");
        idNameBiMap.put(100L, "Sam");

        System.out.println(idNameBiMap.get(100L));
        System.out.println(idNameBiMap.inverse().get("Billy"));

        // Value默认不能重复
//        idNameBiMap.put(104L, "Sam");

        // 强制设置重复的Value将清空原值
        idNameBiMap.forcePut(104L, "Sam");
        System.out.println(idNameBiMap.get(100L));

        idNameBiMap.computeIfAbsent(100L, aLong -> "Nancy to " + aLong);
        System.out.println(idNameBiMap.get(100L));

    }

}
