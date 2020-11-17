/**
 * <pre>
 *    类描述:  回文数   判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 难度: Easy
 *
 * 示例 1:
 * <code>
 *  输入: 121
 *  输出: true
 *  示例 2:
 *
 *  输入: -121
 *  输出: false
 *  解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * </code>
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * </pre>
 * <p>
 * Copyright: Copyright (c) 2020年11月17日 15:15
 * <p>
 * Company: Luoke101.com
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int num = -121;
        System.out.println(palindrome.isPalindrome(num));
    }

    public boolean isPalindrome(int x) {
        char[] array = String.valueOf(x).toCharArray();
        for (int i = 0; i < array.length; i++) {
            int max = array.length - 1;
            if (i > (max / 2)) {
                return true;
            }
            char head = array[i];
            char tail = array[max - i];
            if (head != tail) {
                return false;
            }
        }
        return true;
    }
}
