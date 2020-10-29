package lol.kent.practice.basic.condition;

/**
 * <pre>
 *    类描述:
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2020年10月29日 17:29
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class SwitchTest {

    /**
     * 多个CASE使用同一个操作
     */
    public static void main(String[] args) {
        String type = "delete";
        switch (type) {
            case "put":
            case "delete":
            case "create":
                print(type);
                return;
            default:
                return;
        }
    }

    public static final void print(String type) {
        System.out.println(type);
    }
}
