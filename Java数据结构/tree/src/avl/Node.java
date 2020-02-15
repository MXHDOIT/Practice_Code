package avl;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    //左子树的高度
    public int leftHeight(){
        if(this.left == null){
            return 0;
        }
        return this.left.height();
    }

    //右子树的高度
    public int rightHeight(){
        if(this.right == null){
            return 0;
        }
        return this.right.height();
    }

    //以此节点为根节点树的高度
    public int height(){
        return Math.max(this.left==null?0:this.left.height(),this.right==null?0:this.right.height())+1;
    }

    //添加节点
    public void add(Node node){
        if(node == null){
            return ;
        }

        if(this.value > node.value){
            if(this.left == null){
                this.left = node;
            }else{
                this.left.add(node);
            }
        }else{
            if(this.right == null){
                this.right = node;
            }else{
                this.right.add(node);
            }
        }

        //当添加完一个节点的时侯，右子树高于左子树大于1，左旋转
        if(rightHeight()-leftHeight()>1){
            //如果它的右子树的左子树大于右子树的右子树，右旋转
            if(right!=null && right.leftHeight() > right.rightHeight()){
                right.rightRotate();
            }
            leftRotate();
            return ;
        }
        //当添加完一个节点的时侯，左子树高于右子树大于1，右旋转
        if(leftHeight()-rightHeight()>1){
            //如果它的左子树的右子树大于左子树的左子树，左旋转
            if(left!=null&&left.rightHeight()>left.leftHeight()){
                left.leftRotate();
            }
            rightRotate();
        }
    }

    //右旋转
    public void rightRotate(){
        //1.创建一个新的节点值等于根节点
        Node node = new Node(value);
        //2.将源节点的右节点做为新节点的右节点
        node.right = right;
        //3.将源节点左节点的右节点做为新节点的左节点
        node.left = left.right;
        //4.将左节点的值赋予源节点
        value = left.value;
        //5.源节点的左节点
        left = left.left;
        //又节点
        right = node;
    }

    //左旋转
    public void leftRotate(){
        Node node = new Node(value);
        node.left = left;
        node.right = right.left;
        value = right.value;
        right = right.right;
        left = node;
    }

    //中序遍历
    public void infixOrder(){
        if(this.left != null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.infixOrder();
        }
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
