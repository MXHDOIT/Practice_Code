import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HuffmanTree {
    public static void main(String[] args) {
        int[] arr = {13,7,8,3,29,6,1};

        preOrder(createHuffmanTree(arr));
    }

    public static void preOrder(Node root){
        if(root!=null){
            root.preOrderList();
        }else{
            System.out.println("是空树，不能遍历");
        }
    }

    //创建赫夫曼树的方法
    public static Node createHuffmanTree(int[] arr){
        List<Node> nodes = new ArrayList<Node>();
        //构建节点
        for(int value : arr){
            nodes.add(new Node(value));
        }
        while(nodes.size() != 1) {
            //排序:从小到大
            Collections.sort(nodes);

//            System.out.println(nodes);

            //获取最小的两个数
            Node leftNode = nodes.get(0);
            Node rightNode = nodes.get(1);
            //合成新的节点
            Node parentNode = new Node(leftNode.value + rightNode.value);
            //添加左右子树
            parentNode.left = leftNode;
            parentNode.right = rightNode;
            //删除旧节点，添加新节点
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            nodes.add(parentNode);
        }
        return nodes.get(0);
    }
}

/**
 * 创建节点类
 * 为了让Node对象实现Collections集合排序；
 * 让Node实现Comparable接口
 */
class Node implements Comparable<Node>{
    int value; //节点权值
    Node left; //左子节点
    Node right; //右子节点

    public Node(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

    //前序遍历
    public void preOrderList(){
        System.out.println(this);
        if(this.left!=null){
            this.left.preOrderList();
        }

        if(this.right != null){
            this.right.preOrderList();
        }
    }

    @Override
    public int compareTo(Node o) {
        return this.value-o.value; //从小到大排序
    }
}
