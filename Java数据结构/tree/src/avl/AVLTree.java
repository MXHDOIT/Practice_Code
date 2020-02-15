package avl;

public class AVLTree {
    public Node root;

    //添加元素
    public void add(Node node){
        if(root == null){
            root = node;
            return;
        }
        root.add(node);
    }

    //中序遍历
    public void infixOrder(){
        if(root == null){
            System.out.println("空树");
            return ;
        }
        root.infixOrder();
    }

}
