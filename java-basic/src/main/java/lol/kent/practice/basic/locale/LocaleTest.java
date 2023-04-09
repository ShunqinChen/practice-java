package lol.kent.practice.basic.locale;

import java.util.Locale;
import org.apache.commons.lang3.LocaleUtils;

/**
 * <pre>
 *    Description:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2023年03月01日 16:04
 * <p>
 *
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */

public class LocaleTest {

    public static void main(String[] args) {
        var country = "cn";
        System.out.println("getCountry:" + Locale.CHINA.getCountry());
        System.out.println("getDisplayCountry:" + Locale.CHINA.getDisplayCountry());
        System.out.println("getDisplayName:" + Locale.CHINA.getDisplayName());
        System.out.println("getDisplayLanguage:" + Locale.CHINA.getDisplayLanguage());
        System.out.println("getISO3Country:" + Locale.CHINA.getISO3Country());
        System.out.println("getISO3Language:" + Locale.CHINA.getISO3Language());
        System.out.println("getDisplayScript:" + Locale.CHINA.getDisplayScript());
        System.out.println("getDisplayVariant:" + Locale.CHINA.getDisplayVariant());

        System.out.println("===================================================");

        /**测试CN->LOCALE*/
        var localeFromStr = new Locale("", country);
        System.out.println("getCountry:" + localeFromStr.getCountry());
        System.out.println("getDisplayLanguage:" + localeFromStr.getDisplayLanguage());
        System.out.println("Locale equals result: " + Locale.CHINA.equals(localeFromStr));
        System.out.println("Country equals result: " + Locale.CHINA.getCountry().equals(localeFromStr.getCountry()));

        System.out.println("===================================================");
        var locale = LocaleUtils.toLocale("zh_CN");
        System.out.println(locale);
    }

}
