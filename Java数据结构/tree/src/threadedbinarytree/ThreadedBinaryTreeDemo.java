package threadedbinarytree;

public class ThreadedBinaryTreeDemo {
    public static void main(String[] args) {
        //测试
        HeroNode root = new HeroNode(1, "tom");
        HeroNode node2 = new HeroNode(3, "jack");
        HeroNode node3 = new HeroNode(6, "smith");
        HeroNode node4 = new HeroNode(8, "mary");
        HeroNode node5 = new HeroNode(10, "king");
        HeroNode node6 = new HeroNode(14, "dim");

        //创建二叉树
        root.setLeftNode(node2);
        root.setRightNode(node3);
        node2.setLeftNode(node4);
        node2.setRightNode(node5);
        node3.setLeftNode(node6);

        ThreadedBinaryTree threadedBinaryTree = new ThreadedBinaryTree();
        threadedBinaryTree.setRoot(root);
        threadedBinaryTree.threadedNodes();

        HeroNode leftNode = node5.getLeftNode();
        HeroNode rightNode = node5.getRightNode();
        System.out.println(leftNode);
        System.out.println(rightNode);

        System.out.println("线索化中序遍历");
        threadedBinaryTree.threadList();
    }
}

//创建HeroNode
class HeroNode{
    private int no;
    private String name;
    private HeroNode leftNode; //默认null
    private HeroNode rightNode;
    //说明
    //1.如果leftType == 0表示指向的是左子树，如果是1则表示指向前驱节点
    //2.如果rightType == 0表示指向是右子树，如果1表示指向后继节点
    private int leftTye;
    private int rightType;

    public int getLeftTye() {
        return leftTye;
    }

    public void setLeftTye(int leftTye) {
        this.leftTye = leftTye;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    public HeroNode(int no, String name) {
        super();
        this.no = no;
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(HeroNode leftNode) {
        this.leftNode = leftNode;
    }

    public HeroNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(HeroNode rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }

    //递归删除节点
    public void delNode(int no){
        //如果当前节点的左子节点不为空，并且左子节点就是要删除的点，就将this.left=null;并且就返回（结束递归删除）
        if(this.leftNode != null && this.leftNode.no == no){
            this.leftNode = null;
            return ;
        }
        //如果当前节点的右子节点不为空，并且右子节点就是要删除的点，就将this.right=null;并且就返回（结束递归删除）
        if(this.rightNode != null && this.rightNode.no == no){
            this.leftNode = null;
            return;
        }

        //左递归删除
        if(this.leftNode != null){
            this.leftNode.delNode(no);
        }
        //右递归删除
        if(this.rightNode != null){
            this.rightNode.delNode(no);
        }
    }


    //编写前序遍历的方法
    public void preOrder(){
        System.out.println(this); //先输出父节点
        //递归左子树
        if(this.leftNode != null){
            this.leftNode.preOrder();
        }
        //递归右子树
        if(this.rightNode != null){
            this.rightNode.preOrder();
        }
    }
    //中序
    public void infixOrder() {
        //递归向左子树
        if(this.leftNode != null){
            this.leftNode.infixOrder();
        }
        //输出当前节点
        System.out.println(this);
        //递归右子树
        if(this.rightNode!=null){
            this.rightNode.infixOrder();
        }
    }
    //后序
    public  void postOrder(){
        //递归遍历左子树
        if(this.leftNode != null){
            this.leftNode.postOrder();
        }
        //递归遍历右子树
        if(this.rightNode != null){
            this.rightNode.postOrder();
        }
        //输出当前节点
        System.out.println(this);
    }

    /**
     * 前序遍历查找
     * @param no 查找编号为no
     * @return 如果找到就返回改Node,如果没找到返回null
     */
    public HeroNode preOrderSearch(int no){
        //比较当前节点是不是
        if(this.no == no){
            return this;
        }
        //判断当前节点的左子节点是否为空，如果不为空，则递归查找
        HeroNode resNode = null;
        if(this.leftNode != null){
            resNode = this.leftNode.preOrderSearch(no);
        }
        if(resNode != null){
            return resNode;
        }

        //判断当前节点的右子节点是否为空，如果不为空，则递归查找
        if(this.rightNode != null){
            resNode =this.rightNode.preOrderSearch(no);
        }

        return resNode;
    }

    /**
     * 中序遍历查找
     * @param no 查找编号为no
     * @return 如果找到就返回改Node,如果没找到返回null
     */
    public HeroNode infixOrderSearch(int no){
        HeroNode resNode = null;
        if(this.leftNode != null){
            resNode = this.leftNode.infixOrderSearch(no);
        }
        if(resNode != null){
            return resNode;
        }

        if(this.no == no){
            return this;
        }

        if(this.rightNode != null){
            resNode = this.rightNode.infixOrderSearch(no);
        }
        return resNode;
    }

    /**
     * 后序遍历查找
     * @param no 查找编号为no
     * @return 如果找到就返回改Node,如果没找到返回null
     */
    public HeroNode postOrderSearch(int no){
        HeroNode resNode = null;
        if(this.leftNode != null){
            resNode = this.leftNode.postOrderSearch(no);
        }
        if(resNode != null){
            return resNode;
        }
        if(this.rightNode != null){
            resNode = this.rightNode.postOrderSearch(no);
        }
        if(resNode != null){
            return resNode;
        }
        if(this.no == no){
            return this;
        }else{
            return null;
        }
    }
}

//定义一个TreeBinaryTree 实现了线索化功能的二叉树
class  ThreadedBinaryTree{
    private HeroNode root;

    //为了实现线索化，需要创建当前节点的前驱节点
    private HeroNode pre = null;
    public void setRoot(HeroNode root) {
        this.root = root;
    }

    //遍历线索化二叉树的方法
    public void threadList(){
        //定义一个变量，存储当前节点
        HeroNode node = root;
        while(node != null){
            //循环的找到leftType == 1的节点，第一个找到的就是8节点
            while(node.getLeftTye() == 0){
                node= node.getLeftNode();
            }

            //打印这个节点
            System.out.println(node);
            //如果当前节点的右指针指向的是后继节点，就一直输出
            while(node.getRightType() == 1){
                node = node.getRightNode();
                System.out.println(node);
            }

            //替换这个遍历的节点
            node = node.getRightNode();
        }
    }

    //重载
    public void threadedNodes(){
        this.threadedNodes(root);
    }
    /**
     * @param node 就是要线索化的节点
     */
    //编写对二叉树进行中序线索化的方法
    public void threadedNodes(HeroNode node){
        if(node == null){
            return ;
        }

        //1.线索化左子树
        threadedNodes(node.getLeftNode());
        //2.线索化当前节点
            //2.1处理当前节点的前驱节点
            if(node.getLeftNode() == null){
                //让当前节点的左指针指向前驱节点
                node.setLeftNode(pre);
                //修改当前节点的左指针的类型
                node.setLeftTye(1);
            }
            //2.2处理后继节点[处理前驱节点的后继问题]
            if(pre != null && pre.getRightNode() == null){
                //让前驱节点的右指针指向当前节点
                pre.setRightNode(node);
                //修改前驱节点的右指针类型
                pre.setRightType(1);
            }
            //2.3向后走
            pre= node;
        //3.线索化右子树
        threadedNodes(node.getRightNode());
    }

    //编写对二叉树进行前序线索化的方法
    public void preThreadedNodes(HeroNode node){
        if(node == null){
            return ;
        }

        //1.线索化当前节点

        //2.线索化左子树
        preThreadedNodes(node.getLeftNode());
        //3.线索化右子树
        preThreadedNodes(node.getRightNode());
    }

    //删除节点
    public void delNode(int no){
        if(root != null){
            //如果root节点就是要删除的节点
            if(root.getNo() == no){
                root = null;
            }else{
                root.delNode(no);
            }
        }else{
            System.out.println("空树，不能删除");
        }
    }
    //前序遍历
    public void preOrder(){
        if(this.root != null){
            this.root.preOrder();
        }else{
            System.out.println("二叉树为空，无法遍历");
        }
    }

    //中序遍历
    public void infixOrder(){
        if(this.root != null){
            this.root.infixOrder();
        }else{
            System.out.println("二叉树为空，无法遍历");
        }
    }

    //后序遍历
    public void postOrder(){
        if(this.root != null){
            this.root.postOrder();
        }else{
            System.out.println("二叉树为空，无法遍历");
        }
    }

    //前序遍历查找
    public HeroNode preOrderSearch(int no){
        if(this.root == null){
            System.out.println("二叉树为空，无法查找");
            return null;
        }
        return this.root.preOrderSearch(no);
    }

    //中序遍历查找
    public HeroNode infixOrderSearch(int no){
        if(this.root == null){
            System.out.println("二叉树为空，无法查找");
            return null;
        }
        return this.root.infixOrderSearch(no);
    }

    //后序遍历查找
    public HeroNode postOrderSearch(int no){
        if(this.root == null){
            System.out.println("二叉树为空，无法查找");
            return null;
        }
        return this.root.postOrderSearch(no);
    }
}