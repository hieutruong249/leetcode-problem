package Algorithms.daily.problem670.code;

public class Solution {
    public static int maxSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;

        // Mảng lưu chữ số lớn nhất bên phải của mỗi chữ số
        int[] maxIndexRight = new int[n];
        maxIndexRight[n - 1] = n - 1;

        // Duyệt từ phải sang trái để tìm chỉ số của chữ số lớn nhất bên phải
        for (int i = n - 2; i >= 0; i--) {
            if (digits[i] > digits[maxIndexRight[i + 1]]) {
                maxIndexRight[i] = i;
            } else {
                maxIndexRight[i] = maxIndexRight[i + 1];
            }
        }

        // Duyệt từ trái sang phải để tìm chữ số cần hoán đổi
        for (int i = 0; i < n; i++) {
            if (digits[i] < digits[maxIndexRight[i]]) {
                // Hoán đổi chữ số
                char temp = digits[i];
                digits[i] = digits[maxIndexRight[i]];
                digits[maxIndexRight[i]] = temp;
                break;
            }
        }

        // Chuyển mảng ký tự thành số nguyên
        return Integer.parseInt(new String(digits));
    }

    public static void main(String[] args) {
        int num = 9932671;
        int maxNum = maxSwap(num);
        System.out.println("Số lớn nhất có thể đạt được: " + maxNum);
    }
}