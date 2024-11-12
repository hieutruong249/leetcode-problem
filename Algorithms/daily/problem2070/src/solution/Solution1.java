package Algorithms.daily.problem2070.src.solution;

import java.util.*;

public class Solution1 implements Solution {

    @Override
    public int[] maximumBeauty(int[][] items, int[] queries) {
        List<Integer> output = new ArrayList<>();
        for (int q : queries) {
            int maxBeauty = 0;
            for (int[] item : items) {
                int price = item[0];
                int beauty = item[1];
                if (price <= q) {
                    if (beauty > maxBeauty) {
                        maxBeauty = beauty;
                    }
                }
            }
            output.add(maxBeauty);
        }

        return output.stream().mapToInt(Integer::intValue).toArray();
    }
}
