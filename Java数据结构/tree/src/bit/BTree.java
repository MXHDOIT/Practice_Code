package bit;

public class BTree {
    TNode root = null;

    public BTree() {
        root = new TNode(1);
        TNode node2 = new TNode(2);
        TNode node3 = new TNode(3);
        TNode node4 = new TNode(4);
        TNode node5 = new TNode(5);
        TNode node6 = new TNode(6);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node4.left = node6;
    }

    //前序遍历
    public void preOrder(){
        System.out.println("前序遍历：");
        preOrder(root);
        System.out.println();
    }
    private void preOrder(TNode root){
        if(root != null){
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    //中序遍历
    public void infixOrder(){
        System.out.println("中序遍历：");
        infixOrder(root);
        System.out.println();
    }
    private void infixOrder(TNode root){
        if(root != null){
            infixOrder(root.left);
            System.out.print(root.val+" ");
            infixOrder(root.right);
        }
    }

    //后序遍历
    public void postOrder(){
        System.out.println("后序遍历：");
        postOrder(root);
        System.out.println();
    }
    private void postOrder(TNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");
        }
    }

    //返回总共多少节点
    public int getNodeCount(){
        return getNodeCount(root);
    }
    private int getNodeCount(TNode root){
        if(root != null){
            return 1+getNodeCount(root.left)+getNodeCount(root.right);
        }
        return 0;
    }

    //返回多少个叶子节点
    public int getLeafCount(){
        return getLeafCount(root);
    }
    private int getLeafCount(TNode root){
        if (root == null){
            return 0;
        }
        if(root.right == null && root.left == null){
            return 1;
        }
        return getLeafCount(root.left)+getLeafCount(root.right);
    }

    //返回树高
    public int getTreeHeight(){
        return getTreeHeight(root);
    }
    private int getTreeHeight(TNode root){
        if(root == null){
            return 0;
        }

        return 1+Math.max(getTreeHeight(root.right),getTreeHeight(root.left));
    }

    //求第k层的节点数
    public int getKCount(int k){
        return getKCount(root,k);
    }
    private int getKCount(TNode root,int k){
        if(root == null || k < 1){
            return 0;
        }
        if(k == 1){
            return 1;
        }

        return getKCount(root.left,k-1)+getKCount(root.right,k-1);
    }

    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
    public TNode find(int val){
        return find(root,val);
    }
    private TNode find(TNode root,int val){
        if(root != null){
            if(root.val == val){
                return root;
            }
            TNode node = find(root.left,val);
            if(node != null){
                return node;
            }
            return find(root.right,val);
        }
        return null;
    }

    public static void main(String[] args) {
        BTree bTree = new BTree();
//        bTree.preOrder();
//        bTree.infixOrder();
//        bTree.postOrder();
//        System.out.println("一共"+bTree.getNodeCount()+"个节点");
//        System.out.println("一共"+bTree.getLeafCount()+"个叶子节点");
//        System.out.println("树高："+bTree.getTreeHeight());
        System.out.println(bTree.getKCount(3));
        System.out.println(bTree.find(1));
    }
}

//二叉树节点
class TNode{
    public int val;
    public TNode left;
    public TNode right;

    public TNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "TNode{" +
                "val=" + val +
                '}';
    }
}