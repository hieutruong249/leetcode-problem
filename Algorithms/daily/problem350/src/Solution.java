package Algorithms.daily.problem350.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        int maxSize = Math.min(nums1.length, nums2.length);
        int[] result = new int[maxSize];
        int size = 0;

        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : nums2) {
            if (map.getOrDefault(i, 0) > 0) {
                result[size++] = i;
                map.put(i, map.get(i) - 1);
            }
        }

        return Arrays.copyOf(result, size);
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] output = intersect(nums1, nums2);

        System.out.println("output: ");
        for (int i : output) {
            System.out.println(i);
        }
    }
}
