import java.util.LinkedList;
import java.util.Queue;

public class Solution_03 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);

        int i = widthOfBinaryTree(root);
        System.out.println(i);
    }

    public static int widthOfBinaryTree(TreeNode root) {
        if(null == root){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        LinkedList<Integer> indexList = new LinkedList<>();
        queue.add(root);
        indexList.add(1);
        int size = 1;
        int maxW = 1;
        while(!queue.isEmpty()){

            int len = queue.size();
            for(int i = 0;i < len;i++){
                TreeNode node = ((LinkedList<TreeNode>) queue).pollFirst();
                int index = indexList.removeFirst();
                if(node.left != null){
                    queue.add(node.left);
                    indexList.add(2*index);
                }
                if(node.right != null){
                    queue.add(node.right);
                    indexList.add(2*index+1);
                }
            }

            if (indexList.size() >= 2) {
                maxW = Math.max(maxW, indexList.getLast() - indexList.getFirst() + 1);
            }
        }
        return maxW;
    }
}
