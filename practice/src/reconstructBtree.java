import java.util.*;

public class reconstructBtree {
    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
        TreeNode root = buildTree(preorder,inorder);
        System.out.println(root);
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int lengIn = inorder.length;
        if(preorder.length == 0){
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        int index = 0;
        for(int i = 0; i < lengIn; i++){
            if(preorder[0] == inorder[i]){
                index = i;
                break;
            }
        }
        if(index != 0){
            int[] leftPre = new int[index];
            int[] leftIn = new int[index];
            for(int i = 0; i < index; i++){
                leftPre[i] = preorder[i+1];
                leftIn[i] = inorder[i];
            }
            root.left = buildTree(leftPre,leftIn);
        }
        if(index != lengIn-1){
            int[] rightPre = new int[lengIn-index-1];
            int[] rightIn = new int[lengIn-index-1];
            for(int i = 0; i < lengIn-index-1; i++){
                rightPre[i] = preorder[i+index+1];
                rightIn[i] = inorder[i+index+1];
            }
            root.right = buildTree(rightPre,rightIn);
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
         this.left = left;
        this.right = right;
     }
}
