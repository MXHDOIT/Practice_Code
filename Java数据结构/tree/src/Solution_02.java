
class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
 }

public class Solution_02 {
    // preorder: 前序遍历结果
    // inorder: 中序遍历结果
    // [left, right): 标记树中节点在inorder中的范围
    static int index = -1;
    private static TreeNode reBuilidTree(int[] preorder, int[] inorder, int left, int right){
        if(index > preorder.length-1 || left >= right){
            return null;
        }

        // 前序中找根节点
        // 创建根节点
        TreeNode root = new TreeNode(preorder[++index]);

        // 在中序遍历结果中找根的位置
        // 确认根节点的左右子树的区间
        int inrootIdx = left;
        while(inrootIdx < right)
        {
            if(inorder[inrootIdx] == preorder[index])
                break;

            inrootIdx++;
        }


        // 递归创建根节点的左子树
        // [left, inrootidx)
        root.left = reBuilidTree(preorder, inorder, left, inrootIdx);

        // 递归创建根节点的右子树
        root.right = reBuilidTree(preorder, inorder, inrootIdx+1, right);
        return root;
    }

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return reBuilidTree(preorder, inorder, 0, inorder.length);
    }

    public static void main(String[] args) {
        int[] pre = {3,9,20,15,7};
        int[] inf = {9,3,15,20,7};

        buildTree(pre,inf);
    }
}
