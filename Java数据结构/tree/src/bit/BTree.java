package bit;


public class BTree {
    TNode root = null;

    public BTree() {
        root = new TNode(1);
        TNode node2 = new TNode(2);
        TNode node3 = new TNode(3);
        TNode node4 = new TNode(4);
        TNode node5 = new TNode(5);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
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


    public static void main(String[] args) {
        BTree bTree = new BTree();
        bTree.preOrder();
        bTree.infixOrder();
        bTree.postOrder();
    }
}

class TNode{
    public int val;
    public TNode left;
    public TNode right;

    public TNode(int val) {
        this.val = val;
    }
}