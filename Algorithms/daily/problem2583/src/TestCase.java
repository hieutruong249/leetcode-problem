package Algorithms.daily.problem2583.src;


public class TestCase {
    long expect;
    int k;
    TreeNode treeNode;

    public TestCase(long expect, int k, TreeNode treeNode) {
        this.expect = expect;
        this.k = k;
        this.treeNode = treeNode;
    }

    public long getExpect() {
        return expect;
    }

    public void setExpect(long expect) {
        this.expect = expect;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public TreeNode getTreeNode() {
        return treeNode;
    }

    public void setTreeNode(TreeNode treeNode) {
        this.treeNode = treeNode;
    }
}
