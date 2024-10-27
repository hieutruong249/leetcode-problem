package Algorithms.daily.problem1233.src;

import Algorithms.daily.problem1233.src.solution.Solution2;
import Algorithms.daily.problem1233.src.solution.Solution;
import Algorithms.daily.problem1233.src.solution.Solution1;

import java.util.List;

class Main {

    public static void main(String[] args) {
        Solution solution = getSolution();

        TestCase tc1 = buildTC5();
        List<String> output1 = solution.removeSubfolders(tc1.folder);
        System.out.println("TC1 output: " + output1);

        TestCase tc2 = buildTC2();
        List<String> output2 = solution.removeSubfolders(tc2.folder);
        System.out.println("TC2 output: " + output2);

        TestCase tc3 = buildTC3();
        List<String> output3 = solution.removeSubfolders(tc3.folder);
        System.out.println("TC3 output: " + output3);
    }

    private static Solution getSolution() {
        return new Solution2();
    }

    /**
     Input: folder = ["/a","/a/b","/c/d","/c/d/e","/c/f"]
     Output: ["/a","/c/d","/c/f"]
     */
    private static TestCase buildTC1() {
        return new TestCase(new String[]{"/a","/c/d","/c/f"}, new String[]{"/a","/a/b","/c/d","/c/d/e","/c/f"});
    }

    /**
     Input: folder = ["/a","/a/b/c","/a/b/d"]
     Output: ["/a"]
     */
    private static TestCase buildTC2() {
        return new TestCase(new String[]{"/a"}, new String[]{"/a","/a/b/c","/a/b/d"});
    }

    /**
     Input: folder = ["/a/b/c","/a/b/ca","/a/b/d"]
     Output: ["/a/b/c","/a/b/ca","/a/b/d"]
     */
    private static TestCase buildTC3() {
        return new TestCase(new String[]{"/a/b/c","/a/b/ca","/a/b/d"}, new String[]{"/a/b/c","/a/b/ca","/a/b/d"});
    }

    /**
     Input: folder = ["/abc/de","/abc/dee","/abc/def","/abc/def/gh","/abc/def/ghi","/abc/def/ghij","/abc/def/ghijk","/abc/dez"]
     Output: ["/abc/de","/abc/dee","/abc/def","/abc/dez"]
     */
    private static TestCase buildTC4() {
        return new TestCase(new String[]{"/abc/de","/abc/dee","/abc/def","/abc/dez"}, new String[]{"/abc/de","/abc/dee","/abc/def","/abc/def/gh","/abc/def/ghi","/abc/def/ghij","/abc/def/ghijk","/abc/dez"});
    }

    /**
     Input: folder = ["/ah/al/am", "/ah/al"]
     Output: ["/ah/al"]
     */
    private static TestCase buildTC5() {
        return new TestCase(new String[]{"/ah/al"}, new String[]{"/ah/al/am", "/ah/al"});
    }
}
