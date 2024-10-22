package Algorithms.daily.problem1.src;

import Algorithms.daily.problem1.src.solution.Solution;
import Algorithms.daily.problem1.src.solution.Solution1;
import Algorithms.daily.problem1.src.solution.Solution2;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        Solution solution = getSolution();

        TestCase tc1 = buildTC1();
        int[] output1 = solution.twoSum(tc1.nums, tc1.target);
        System.out.println("TC1 output: " + Arrays.toString(output1));

        TestCase tc2 = buildTC2();
        int[] output2 = solution.twoSum(tc2.nums, tc2.target);
        System.out.println("TC2 output: " + Arrays.toString(output2));

        TestCase tc3 = buildTC3();
        int[] output3 = solution.twoSum(tc3.nums, tc3.target);
        System.out.println("TC3 output: " + Arrays.toString(output3));
    }

    private static Solution getSolution() {
        return new Solution2();
    }

    /**
     Input: nums = [2,7,11,15], target = 9
     Output: [0,1]
     */
    private static TestCase buildTC1() {
        return new TestCase(new int[]{0,1}, 9, new int[]{2,7,11,15});
    }

    /**
     Input: nums = [3,2,4], target = 6
     Output: [1,2]
     */
    private static TestCase buildTC2() {
        return new TestCase(new int[]{1,2}, 6, new int[]{3,2,4});
    }

    /**
     Input: nums = [1,3,3], target = 6
     Output: [1,2]
     */
    private static TestCase buildTC3() {
        return new TestCase(new int[]{0,1}, 6, new int[]{1,3,3});
    }
}
