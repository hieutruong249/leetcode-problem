package Algorithms.daily.problem1593.src;

class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.maxUniqueSplit("ababccc")); // Output: 5
        System.out.println(solution.maxUniqueSplit("aba"));     // Output: 2
        System.out.println(solution.maxUniqueSplit("aa"));      // Output: 1
    }
}
