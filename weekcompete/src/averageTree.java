import java.util.*;

public class averageTree {
    private static int count = 0;
    public static void main(String[] args) {

        int res = averageTree();
    }
    public int averageOfSubtree(TreeNode root) {
        if(root.val == dfs(root,0,0)){
            count++;
        }
        if(root.left != null){
            averageOfSubtree(root.left);
        }
        if(root.right != null){
            averageOfSubtree(root.right);
        }
        return count;
    }
    public int dfs(TreeNode node,int sum,int nodeNum){
        sum += node.val;
        nodeNum++;
        if(node.left != null){
            dfs(node.left,sum,nodeNum);
        }
        if(node.right != null){
            dfs(node.right,sum,nodeNum);
        }
        return sum/nodeNum;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
        this.val = val;
        this.left = left;
        this.right = right;
    }
}