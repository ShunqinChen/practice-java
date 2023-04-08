import com.neovisionaries.i18n.CountryCode;
import com.neovisionaries.i18n.CurrencyCode;
import com.neovisionaries.i18n.LanguageCode;
import com.neovisionaries.i18n.LocaleCode;
import com.neovisionaries.i18n.ScriptCode;

/**
 * <pre>
 *    Description:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2023年04月08日 21:10
 * <p>
 *
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class CountryCodeTest {

    public static void main(String[] args) {

        System.out.println(CountryCode.getByCode("CN").getName());

        for (CountryCode code : CountryCode.values()) {
            System.out.format("CountryCode [%s] %s\n", code, code.getName());
        }

// List all the language codes.
        for (LanguageCode code : LanguageCode.values()) {
            System.out.format("LanguageCode [%s] %s\n", code, code.getName());
        }

// List all the locale codes.
        for (LocaleCode code : LocaleCode.values()) {
            String language = code.getLanguage().getName();
            String country = code.getCountry() != null
                    ? code.getCountry().getName() : null;

            System.out.format("LocaleCode [%s] %s, %s\n", code, language, country);
        }

// List all the script codes.
        for (ScriptCode code : ScriptCode.values()) {
            System.out.format("ScriptCode [%s] %03d %s\n", code, code.getNumeric(), code.getName());
        }

// List all the currency codes.
        for (CurrencyCode code : CurrencyCode.values()) {
            System.out.format("CurrencyCode [%s] %03d %s\n", code, code.getNumeric(), code.getName());
        }
    }

}
