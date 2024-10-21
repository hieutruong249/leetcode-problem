package Algorithms.daily.problem1593.src;

import java.util.HashSet;

class Solution {

    public int maxUniqueSplit(String s) {
        return backtrack(s, 0, new HashSet<>());
    }

    private int backtrack(String s, int start, HashSet<String> seen) {
        // Trường hợp cơ bản: nếu đã đến cuối chuỗi
        if (start == s.length()) {
            return seen.size(); // Trả về số lượng mảng con duy nhất
        }

        int maxCount = 0; // Để theo dõi số lượng mảng con duy nhất tối đa

        // Thử mọi vị trí kết thúc cho mảng con
        for (int end = start + 1; end <= s.length(); end++) {
            String substring = s.substring(start, end);
            // Nếu mảng con chưa thấy
            if (!seen.contains(substring)) {
                // Thêm mảng con vào tập hợp đã thấy
                seen.add(substring);
                // Đệ quy để tìm thêm các mảng con duy nhất
                maxCount = Math.max(maxCount, backtrack(s, end, seen));
                // Loại bỏ mảng con để quay lại
                seen.remove(substring);
            }
        }

        return maxCount;
    }
}
