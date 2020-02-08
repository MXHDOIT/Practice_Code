public class ArrBinaryTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        ArrBinaryTree arrBinaryTree = new ArrBinaryTree(arr);
//        arrBinaryTree.preOrder(0);
//        arrBinaryTree.preOrder();
//        arrBinaryTree.infixOrder(0);
        arrBinaryTree.postOrder(0);
    }
}

//编写ArrayBinaryTree
class ArrBinaryTree{
    private int[] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    /**
     * 重载前序
     */
    public void preOrder(){
        this.preOrder(0);
    }
    /**
     * 完成顺序存储二叉树的前序遍历
     * @param index
     */
    public void preOrder(int index){
        if(arr == null || arr.length == 0){
            System.out.println("数组为空");
        }
        System.out.println(arr[index]);
        //左递归
        if(2*index+1 < arr.length){
            preOrder(2*index+1);
        }

        //右递归
        if(2*index+2 < arr.length){
            preOrder(2*index+2);
        }
    }

    /**
     *
     * @param index
     */
    public void infixOrder(int index){
        if(arr == null|| arr.length==0){
            System.out.println("数组空");
        }
        if(index >= arr.length){
            return ;
        }
        //左递归
        if(2*index+1<arr.length){
            infixOrder(index*2+1);
        }

        //遍历当前节点
        System.out.println(arr[index]);
        //右递归
        if(2*index+2 < arr.length){
            infixOrder(2*index+2);
        }
    }


    //后序遍历
    public void postOrder(int index){
        if(arr == null|| arr.length==0){
            System.out.println("数组空");
        }
        if(index >= arr.length){
            return ;
        }
        //左递归
        if(2*index+1<arr.length){
            postOrder(index*2+1);
        }
        //右递归
        if(2*index+2 < arr.length){
            postOrder(2*index+2);
        }
        //遍历当前节点
        System.out.println(arr[index]);

    }
}
