package Algorithms.daily.problem2583.src;

class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();

        TestCase tc1 = buildTC1();
        long output1 = solution.kthLargestLevelSum(tc1.treeNode, tc1.k);
        System.out.println("TC1 output: " + output1);

        TestCase tc2 = buildTC2();
        long output2 = solution.kthLargestLevelSum(tc2.treeNode, tc2.k);
        System.out.println("TC2 output: " + output2);
    }

    /**
     Input: root = [5,8,9,2,1,3,7,4,6], k = 2
     Output: 13
     */
    private static TestCase buildTC1() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2, new TreeNode(4), new TreeNode(6));

        TreeNode node8 = new TreeNode(8, node2, node1);
        TreeNode node9 = new TreeNode(9, new TreeNode(3), new TreeNode(7));

        TreeNode root = new TreeNode(5, node8, node9);
        return new TestCase(13, 2, root);
    }

    /**
     Input: root = [1,2,null,3], k = 1
     Output: 3
     */
    private static TestCase buildTC2() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);
        return new TestCase(3, 1, root);
    }
}
