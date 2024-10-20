package Algorithms.daily.problem27.src;

class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};
        int output = solution.removeElement(arr, 2);

        System.out.println("output: " + output);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
