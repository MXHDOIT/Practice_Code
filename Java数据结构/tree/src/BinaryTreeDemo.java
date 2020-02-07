public class BinaryTreeDemo {
    public static void main(String[] args) {
        //创建二叉树
        BinaryTree binaryTree = new BinaryTree();
        //创建节点
        HeroNode root= new HeroNode(1,"宋江");
        HeroNode node2= new HeroNode(2,"吴用");
        HeroNode node3= new HeroNode(3,"卢俊义");
        HeroNode node4= new HeroNode(4,"林冲");
        HeroNode node5= new HeroNode(5,"狗");
        //初始化二叉树
        root.setLeftNode(node2);
        root.setRightNode(node3);
        node3.setRightNode(node4);
        node3.setLeftNode(node5);
        binaryTree.setRoot(root);

        //前序遍历
//        System.out.println("前序遍历");
//        binaryTree.preOrder();
//        //中序遍历
//        System.out.println("中序遍历");
//        binaryTree.infixOrder();
//        //后序遍历
//        System.out.println("后序遍历");
//        binaryTree.postOrder();
//
//
//        //前序查找
//        System.out.print("前序查找：");
//        HeroNode resNode = binaryTree.preOrderSearch(5);
//        if(resNode != null){
//            System.out.printf("找到了，信息为no = %d name = %s\n",resNode.getNo(),resNode.getName());
//        }else{
//            System.out.println("没找到");
//        }
//        //中序查找
//        System.out.print("中序查找：");
//        resNode = binaryTree.infixOrderSearch(5);
//        if(resNode != null){
//            System.out.printf("找到了，信息为no = %d name = %s\n",resNode.getNo(),resNode.getName());
//        }else{
//            System.out.println("没找到");
//        }
//        //后序查找
//        System.out.print("后序查找：");
//        resNode = binaryTree.postOrderSearch(9);
//        if(resNode != null){
//            System.out.printf("找到了，信息为no = %d name = %s\n",resNode.getNo(),resNode.getName());
//        }else{
//            System.out.println("没找到");
//        }
//

        //删除节点
        System.out.println("删除前：");
        binaryTree.preOrder();
        binaryTree.delNode(3);
        System.out.println("删除后");
        binaryTree.preOrder();
    }
}

//定义一个BinaryTree
class  BinaryTree{
    private HeroNode root;

    public void setRoot(HeroNode root) {
        this.root = root;
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

//先创建HeroNode节点
class HeroNode{
    private int no;
    private String name;
    private HeroNode leftNode; //默认null
    private HeroNode rightNode;

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