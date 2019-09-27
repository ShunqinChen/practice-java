package lol.kent.practice.phone;

import com.vdurmont.emoji.EmojiParser;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2019年09月22日 21:26
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class EmojiJavaPractice {


    public static void main(String[] args) {
        String emoji = "  An 😃😀awesome 😃😃string with a few 😃😉emojis!";
        String parse = EmojiParser.parseToAliases(emoji);
        System.out.println(parse);
        String unicode = EmojiParser.parseToUnicode(parse);
        System.out.println(unicode);
    }

}
