/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.Arrays;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length == 0){
            return null;
        }
        
        int rootVal = pre[0];
        if(pre.length == 1){
            return new TreeNode(rootVal);
        }
        
        int index = 0;
        for(int i = 0;i < in.length;i++){
            if(in[i] == rootVal){
                index = i;
                break;
            }
        }
        
        TreeNode root = new TreeNode(rootVal);
        root.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,index+1),Arrays.copyOfRange(in,0,index));
        root.right = reConstructBinaryTree(Arrays.copyOfRange(pre,index+1,pre.length),Arrays.copyOfRange(in,index+1,in.length));
      
        return root;
    }
}