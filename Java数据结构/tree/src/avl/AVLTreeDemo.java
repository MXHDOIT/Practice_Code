package avl;

public class AVLTreeDemo {
    public static void main(String[] args) {
        int[] arr = {10,11,7,6,8,9};
        AVLTree tree = new AVLTree();
        for (int i = 0; i < arr.length; i++) {
            Node node = new Node(arr[i]);
            tree.add(node);
        }

        System.out.println("中序遍历");
        tree.infixOrder();

        System.out.println("在平衡处理");
        System.out.println("树高："+tree.root.height());
        System.out.println("左树高："+tree.root.leftHeight());
        System.out.println("右树高："+tree.root.rightHeight());
    }
}