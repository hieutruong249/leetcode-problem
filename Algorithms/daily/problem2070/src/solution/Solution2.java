package Algorithms.daily.problem2070.src.solution;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Solution2 implements Solution {

    @Override
    public int[] maximumBeauty(int[][] items, int[] queries) {
        // Sort items by price (ascending), and if prices are equal, by beauty (descending)
        Arrays.sort(items, (a, b) -> a[0] - b[0]);

        // Preprocess: accumulate maximum beauty for each price threshold
        TreeMap<Integer, Integer> maxBeautyAtPrice = new TreeMap<>();
        int maxBeauty = 0;
        for (int[] item : items) {
            maxBeauty = Math.max(maxBeauty, item[1]);
            maxBeautyAtPrice.put(item[0], maxBeauty);
        }

        // For each query, find the highest price <= query using floorEntry, and get the max beauty
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            Map.Entry<Integer, Integer> entry = maxBeautyAtPrice.floorEntry(queries[i]);
            result[i] = (entry != null) ? entry.getValue() : 0;
        }

        return result;
    }
}
