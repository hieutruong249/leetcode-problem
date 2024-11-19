package Algorithms.daily.problem2461.src;


import Algorithms.daily.problem2461.src.solution.Solution;
import Algorithms.daily.problem2461.src.solution.Solution1;

import java.util.List;

class Main {

    private final static Solution SOLUTION = new Solution1();
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
        return SOLUTION.maximumSubarraySum(tc.nums, tc.k);
    }

    private static List<TestCase> initTestCase() {
        return List.of(buildTC1(), buildTC2());
    }

    /**
     Input: nums = [1,5,4,2,9,9,9], k = 3
     Output: 15
     Explanation: The subarrays of nums with length 3 are:
     - [1,5,4] which meets the requirements and has a sum of 10.
     - [5,4,2] which meets the requirements and has a sum of 11.
     - [4,2,9] which meets the requirements and has a sum of 15.
     - [2,9,9] which does not meet the requirements because the element 9 is repeated.
     - [9,9,9] which does not meet the requirements because the element 9 is repeated.
     We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions
     */
    private static TestCase buildTC1() {
        int[] nums = {1,5,4,2,9,9,9};
        int key = 3;
        int upper = 6;
        long expect = 6;
        return new TestCase(nums,key,expect);
    }

    /**
     Input: nums = [4,4,4], k = 3
     Output: 0
     Explanation: The subarrays of nums with length 3 are:
     - [4,4,4] which does not meet the requirements because the element 4 is repeated.
     We return 0 because no subarrays meet the conditions.

     */
    private static TestCase buildTC2() {
        int[] nums = {4,4,4};
        int key = 3;
        long expect = 0;
        return new TestCase(nums,key,expect);
    }



}
