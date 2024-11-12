package Algorithms.daily.problem2070.src;


import Algorithms.daily.problem2070.src.solution.Solution;
import Algorithms.daily.problem2070.src.solution.Solution2;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        Solution solution = getSolution();

        TestCase tc1 = buildTC1();
        int[] output1 = solution.maximumBeauty(tc1.items, tc1.queries);
        System.out.println("TC1 output: " + Arrays.toString(output1));

        TestCase tc2 = buildTC2();
        int[] output2 = solution.maximumBeauty(tc2.items, tc2.queries);
        System.out.println("TC2 output: " + Arrays.toString(output2));

        TestCase tc3 = buildTC3();
        int[] output3 = solution.maximumBeauty(tc3.items, tc3.queries);
        System.out.println("TC3 output: " + Arrays.toString(output3));
    }

    private static Solution getSolution() {
        return new Solution2();
    }

    /**
     Input: items = [[1,2],[1,2],[1,3],[1,4]], queries = [1]
     Output: [4]
     */
    private static TestCase buildTC1() {
        int[][] items = {{1,2},{1,2},{1,3},{1,4}};
        int[] queries = {1};
        int[] expect = {4};
        return new TestCase(items, queries, expect);
    }

    /**
     Input: items = [[1,2],[3,2],[2,4],[5,6],[3,5]], queries = [1,2,3,4,5,6]
     Output: [2,4,5,5,6,6]
     */
    private static TestCase buildTC2() {
        int[][] items = {{1,2},{3,2},{2,4},{5,6},{3,5}};
        int[] queries = {1,2,3,4,5,6};
        int[] expect = {2,4,5,5,6,6};
        return new TestCase(items, queries, expect);
    }

    /**
     Input: items = [[1,2],[1,2],[1,3],[1,4]], queries = [1]
     Output: [4]
     */
    private static TestCase buildTC3() {
        int[][] items = {{10,1000}};
        int[] queries = {5};
        int[] expect = {0};
        return new TestCase(items, queries, expect);
    }
}
