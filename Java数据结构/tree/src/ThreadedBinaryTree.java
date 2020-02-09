
public class ThreadedBinaryTree {
    private Node preNode;  //记录前一个节点

    static class Node{
        int data; //数据域
        Node left; //左指针域
        Node right;//右指针域
        boolean isLeftThread = false;//左指针类型 false；指向子节点 true
        boolean isRightThread= false;//右指针类型 false；指向子节点 true

        Node(int data){
            this.data = data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    '}';
        }
    }

    /**
     * 通过一个数组构造一个二叉树
     * @param arr
     * @param index
     * @return
     */
    static Node createBinaryTree(int[] arr,int index){
        Node node = null;
        if(index < arr.length){
            node = new Node(arr[index]);
            node.left = createBinaryTree(arr,2*index+1);
            node.right = createBinaryTree(arr,2*index+2);
        }
        return node;
    }

    /**
     * 中序线索化二叉树
     * @param node
     */
    void inThreadOrder(Node node){
        if(node == null){
            return ;
        }

        //1.处理左子树
        inThreadOrder(node.left);
        //2.处理当前节点
            //2.1左指针为空，将左指针指向前驱节点
            if(node.left == null){
                node.left = preNode;
                node.isLeftThread = true;
            }
            //2.2前一个节点的后继节点指向当前节点
            if(preNode != null && preNode.right == null){
                preNode.right = node;
                preNode.isRightThread = true;
            }
            //2.3
            preNode = node;
        //3.处理右子树
        inThreadOrder(node.right);
    }

    /**
     * 中序遍历线索二叉树
     * @param node
     */
    void inThreadList(Node node){
        //定义一个变量，存储当前节点
        Node cur = node;
        while(cur != null){
            //循环的找到leftType == 1的节点，第一个找到的就是8节点
            while(!cur.isLeftThread){
                cur= cur.left;
            }

            //打印这个节点
            System.out.println(cur);
            //如果当前节点的右指针指向的是后继节点，就一直输出
            while(cur.isRightThread){
                cur = cur.right;
                System.out.println(cur);
            }

            //替换这个遍历的节点
           cur =cur.right;
        }
    }

    /**
     * 前序线索化二叉树
     * @param node
     */
    void preThreadOrder(Node node){
        if(node == null){
            return;
        }

        //1.线索当前节点
        if(node.left == null){
            node.left= preNode;
            node.isLeftThread = true;
        }

        if(preNode != null&& preNode.right == null){
            preNode.right = node;
            preNode.isRightThread = true;
        }

        preNode = node;
        //2.处理左子树
        if(!node.isLeftThread){
            preThreadOrder(node.left);
        }
        //3.处理右子树
        if(!node.isRightThread) {
            preThreadOrder(node.right);
        }
    }

    /**
     * 前序遍历线索二叉树
     * @param node
     */
    void preThreadList(Node node){
        while (node != null){
            while (!node.isLeftThread){
                System.out.println(node);
                node = node.left;
            }
            System.out.println(node);
            node = node.right;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,6,8,10,14};
        Node root = createBinaryTree(arr, 0);

        ThreadedBinaryTree tree = new ThreadedBinaryTree();
//        tree.inThreadOrder(root);
//        tree.inThreadList(root);
        tree.preThreadOrder(root);
        tree.preThreadList(root);
    }
}
