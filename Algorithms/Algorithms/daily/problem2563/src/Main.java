package Algorithms.Algorithms.daily.problem2563.src;


import Algorithms.Algorithms.daily.problem2563.src.solution.Solution;
import Algorithms.Algorithms.daily.problem2563.src.solution.Solution2;

import java.util.List;

class Main {

    private final static Solution SOLUTION = new Solution2();
    private final static List<TestCase> TEST_CASES = initTestCase();

    public static void main(String[] args) {
        process();
    }

    private static void process() {
        for (int i = 0; i < TEST_CASES.size(); i++) {
            TestCase tc = TEST_CASES.get(i);
            long output = runTestCase(tc);
            System.out.printf("TC%s - expect: %s, output: %s \n", i+1, tc.expect, output);
        }
    }

    private static long runTestCase(TestCase tc) {
        return SOLUTION.countFairPairs(tc.nums, tc.lower, tc.upper);
    }

    private static List<TestCase> initTestCase() {
        return List.of(buildTC1(), buildTC2());
    }

    /**
     Input: nums = [0,1,7,4,4,5], lower = 3, upper = 6
     Output: 6
     Explanation: There are 6 fair pairs: (0,3), (0,4), (0,5), (1,3), (1,4), and (1,5).
     */
    private static TestCase buildTC1() {
        int[] nums = {0,1,7,4,4,5};
        int lower = 3;
        int upper = 6;
        long expect = 6;
        return new TestCase(nums,lower,upper,expect);
    }

    /**
     Input: nums = [1,7,9,2,5], lower = 11, upper = 11
     Output: 1
     Explanation: There is a single fair pair: (2,3).
     */
    private static TestCase buildTC2() {
        int[] nums = {0,1,7,4,4,5};
        int lower = 11;
        int upper = 11;
        long expect = 6;
        return new TestCase(nums,lower,upper,expect);
    }



}
