import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int _val){
        this.val = _val;
        this.left = null;
        this.right = null;
    }
}

public class path_Btree {
    public static void main(String[] args) {
        int[] tree_father = {1, 1, 2, 0, 0, 4, 5};
        int[] path = {1, 1};
        int[] tree_son = {5, 3, 0};
        TreeNode root_father = new TreeNode(0);
        reconstruct(root_father,tree_father);
        dfs(root_father,tree_father);
        TreeNode root_son = new TreeNode(0);
        reconstruct(root_son,tree_son);
        dfs(root_son,tree_son);
        TreeNode locate = root_father;
        int i = 1;
        while(i < path.length - 1){
            if(locate.left.val == path[i]){
                locate = locate.left;
            }else if(locate.right.val == path[i]){
                locate = locate.right;
            }
            i++;
        }
        if(locate.left.val == path[i]){
            locate.left = root_son;
        }else if(locate.right.val == path[i]){
            locate.right = root_son;
        }
        System.out.println(out(root_father));


    }
    public static void reconstruct(TreeNode root, int[] treeArray){
        int len = treeArray.length;
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(2*node.val+1 < len && treeArray[2* node.val+1] != 0){
                    TreeNode left = new TreeNode(2*node.val+1);
                    node.left = left;
                    queue.offer(left);
                }
                if(2*node.val+2 < len && treeArray[2*node.val+2] != 0){
                    TreeNode right = new TreeNode(2*node.val+2);
                    node.right = right;
                    queue.offer(right);
                }
            }
        }
    }
    public static void  dfs(TreeNode root,int[] treeArray){
        root.val = treeArray[root.val];
        if(root.left != null){
            dfs(root.left,treeArray);
        }
        if(root.right != null){
            dfs(root.right,treeArray);
        }
    }
    public static List<Integer> out(TreeNode root){
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    queue.offer(node.left);
                    list.add(node.left.val);
                }
                if(node.right != null){
                    queue.offer(node.right);
                    list.add(node.right.val);
                }
            }
        }
        return list;
    }
}
