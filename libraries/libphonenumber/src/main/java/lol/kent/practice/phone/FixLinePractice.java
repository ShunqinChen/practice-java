package lol.kent.practice.phone;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberType;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年09月09日 11:55
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class FixLinePractice {

    public static final String PHONE = "0592 5629010";

    public static final PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();


    public static void main(String[] args) {
        PhoneNumber phoneNumber = null;
        try {
            phoneNumber = phoneUtil.parse(PHONE, Locale.CHINA.getCountry());
        } catch (NumberParseException e) {
            e.printStackTrace();
        }
        Logger logger = LoggerFactory.getLogger(FixLinePractice.class);

        assert phoneUtil.getNumberType(phoneNumber)
                .equals(PhoneNumberType.FIXED_LINE) : "Not a FixLine Number";

        logger.info("Phone Number Type: {}", phoneUtil.getNumberType(phoneNumber));
    }
}
