import java.util.*;

public class reconstructBtree {
    public static void main(String[] args) {
        int[] preorder = {1,1,2};
        int[] inorder = {1,2,1};
        List<TreeNode> ans = buildTree(preorder, inorder, 0, preorder.length-1, 0, inorder.length-1);
        System.out.println("------------------");
    }

    public static List<TreeNode> buildTree(int[] preorder, int[] inorder, int pl, int pr, int il, int ir) {
        if(pl > pr){
            List<TreeNode> tmp=new ArrayList<>();
            tmp.add(null);
            return tmp;
        }
        List<TreeNode> res = new ArrayList<>();
        for(int i = il; i <= ir; i++){
            if(preorder[pl] == inorder[i]){
                List<TreeNode> leftChilds = buildTree(preorder, inorder, pl+1, pl+i-il, il, i-1);
                List<TreeNode> rightChilds = buildTree(preorder, inorder, pl+i-il+1, pr, i+1, ir);
                for(TreeNode leftChild : leftChilds){
                    for(TreeNode rightChild : rightChilds){
                        TreeNode node = new TreeNode(preorder[pl]);
                        node.left = leftChild;
                        node.right = rightChild;
                        res.add(node);
                    }
                }
            }
        }

        return res;
    }

}

class TreeNode {
    int val;
    TreeNode left=null;
    TreeNode right=null;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
         this.left = left;
        this.right = right;
     }
}
