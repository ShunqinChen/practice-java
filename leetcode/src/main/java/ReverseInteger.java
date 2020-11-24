import static java.lang.Math.abs;
import static java.lang.Math.floor;
import static java.lang.Math.round;

/**
 * <pre>
 *  类描述: 整数翻转 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *      示例 1:
 *      输入: 123
 *      输出: 321
 *
 *      示例 2:
 *      输入: -123
 *      输出: -321
 *
 *      示例 3:
 *      输入: 120
 *      输出: 21
 *   假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2^31,  2^31 − 1]。
 *  请根据这个假设，如果反转后整数溢出那么就返回 0。
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2020年11月24日 11:23
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 * @see <link src="https://leetcode-cn.com/problems/reverse-integer/"/>
 */
public class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger instance = new ReverseInteger();
        int num = -100;
        System.out.println(instance.reverse(num));

        long abs = abs(num);
        System.out.println(abs);
        while (abs > 9) {
            long pop = abs % 10;
            System.out.println("pop:" + pop);
            abs /= 10;
            System.out.println("abs:" + abs);
        }
    }

    public int reverse(int x) {

        if (x > Integer.MAX_VALUE || x <= Integer.MIN_VALUE) {
            return 0;
        }

        long abs = abs(x);
        double logarithm = floor(Math.log10(abs(x)));
        System.out.println("对数:" + logarithm);
        if (logarithm < 1) {
            return x;
        }

        long length = round(logarithm);
        System.out.println("位数:" + round(logarithm) + ",数值:" + round(Math.pow(10, length)));

        long result = abs % 10 * round(Math.pow(10, length));
        System.out.println("余数:" + result);
        System.out.println("----------------");

        for (int i = 0; i < length; i++) {
            long bit = round(Math.pow(10, length - i));
            System.out.println("bit:" + bit);
            //取每一位的数字
            long cursorNum = abs / bit;

            System.out.println("cursorNum:" + cursorNum);
            //去每一位反向属代表的数值
            long l = result == 0 ? cursorNum : cursorNum * round(Math.pow(10, i));

            //合并此前值
            result = result + l;
            //去掉已计算部分
            abs = abs - cursorNum * bit;
            System.out.println("abs:" + abs);
            System.out.println("result:" + result);
            System.out.println("----------------");
        }

        return (int) (x > 0 ? result : -result);
    }


    /**
     * 官方解答
     */
    public int reverseOfficial(int x) {
        long temp = 0;

        while (x != 0) {
            int pop = x % 10;
            temp = temp * 10 + pop;

            if (temp > Integer.MAX_VALUE || temp < Integer.MIN_VALUE) {
                return 0;
            }
            x /= 10;
        }
        return (int) temp;
    }


}
