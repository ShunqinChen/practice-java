package lol.kent.practice.phone;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年09月07日 11:58
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class MobilePractice {


    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(MobilePractice.class);

        String chinesePhoneNumber = "18959678900";
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();

        PhoneNumber phonenumber = null;
        try {
            // 可以直接使用CN字符串或Locale.{COUNTRY}.getCountry()方法
//             phonenumber = phoneUtil.parse(chinesePhoneNumber, "CN");
            phonenumber = phoneUtil.parse(chinesePhoneNumber, Locale.CHINA.getCountry());
        } catch (NumberParseException e) {
            logger.info("phone number parse error" + e);
        }

        logger.info("Country Code:{},National Number:{}", phonenumber.getCountryCode(),
                phonenumber.getNationalNumber());

        logger.info("Valid Number:{}", phoneUtil.isValidNumber(phonenumber));

        logger.info("Phone Number Type:{}", phoneUtil.getNumberType(phonenumber));

    }

}
