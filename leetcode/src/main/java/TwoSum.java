import java.util.HashSet;

/**
 * <pre>
 * 题目:
 *    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 *    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 难度: Easy
 *
 * 例如:
 * <code>
 *       给定 nums = [2, 7, 11, 15], target = 9
 *
 *      因为 nums[0] + nums[1] = 2 + 7 = 9 所以返回 [0, 1]
 * </code>
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * </pre>
 *
 * <p>
 * Copyright: Copyright (c) 2020年07月03日 10:41
 * <p>
 * Company: AMPM Fit
 * <p>
 *
 * @author Shunqin.Chen
 * @version 1.0.0
 */
public class TwoSum {

    public static final int[] nums = {2, 7, 11, 15};

    public static final int target = 9;

    public static void main(String[] args) {
        int[] indexes = twoSum(nums, target);
        System.out.println(indexes);
    }

    public static int[] twoSum(int[] nums, int target) {
        HashSet<Integer> resultSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= 0; j--) {
                if (nums[i] + nums[j] != target) {
                    continue;
                }
                resultSet.add(i);
                resultSet.add(j);
            }
        }

        return resultSet.stream().mapToInt(Integer::valueOf).toArray();
    }
}
