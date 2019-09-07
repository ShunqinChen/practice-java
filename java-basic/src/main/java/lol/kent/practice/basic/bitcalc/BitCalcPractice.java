package lol.kent.practice.basic.bitcalc;

/**
 * 标题、简要说明. <br>
 * Java位运算测试
 * <p>
 * Copyright: Copyright (c) 2019年04月09日 17:25
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version x.x.x
 */
public class BitCalcPractice {

    public static void main(String[] args) {
        int number = 125;
        int result = 0;
        System.out.println("原始二进制数："+Integer.toBinaryString(number));
        System.out.println("==========================================");
        //原始数二进制
        result = number << 1;
        //左移一位
        printInfo(result);
        //复位
        result = number >> 1;
        //右移一位
        printInfo(result);
    }

    /**
     * 输出一个int的二进制数
     *
     * @param result 移位计算后的结果
     */
    private static void printInfo(int result) {
        System.out.println("移位后的结果:"+Integer.toBinaryString(result));
    }
}
