package binarysorttree;

public class BinarySortTreeDemo {
    public static void main(String[] args) {
        int[] arr = {7,3,10,12,5,1,9,2};
        BinarySortTree binarySortTree = new BinarySortTree();
        for(int i = 0;i < arr.length;i++){
            binarySortTree.add(new Node(arr[i]));
        }

////        binarySortTree.infixOrder();
//        binarySortTree.deleteNode(5);
//        binarySortTree.deleteNode(2);
        binarySortTree.deleteNode(7);
        binarySortTree.infixOrder();
    }
}


//创建二叉树
class BinarySortTree{
    private Node root;
    //添加节点
    public void add(Node node){
        if(root == null){
            root = node;
        }else{
            root.add(node);
        }
    }
    //中序遍历
    public void infixOrder(){
        if(root != null){
            root.infixOrder();
        }else{
            System.out.println("二叉排序树为空，不能遍历");
        }
    }

    //查找要删除的节点
    public Node search(int value){
        if(root== null){
            return null;
        }else {
            return root.search(value);
        }
    }
    //查找要删除节点的父节点
    public Node searchParent(int value){
        if(root== null){
            return null;
        }else {
            return root.searchParent(value);
        }
    }

    //删除最小数
     public int delRightMin(Node node){
        Node cur = node.right;

        while(cur.left != null){
            cur = cur.left;
        }

        deleteNode(cur.value);
        return cur.value;
     }

    //删除节点
    public void deleteNode(int value){
        if(root == null){
            return ;
        }else{
            //查找要删除的节点
            Node curNode = search(value);
            //判断是否找到
            if(curNode == null){
                return ;
            }
            //判断根节点
            if(root.right == null && root.left == null){
                root = null;
                return ;
            }
            //获取父节点
            Node parentNode = searchParent(value);
            //删除
            if(curNode.left == null && curNode.right == null){
                if(parentNode.left!=null&&parentNode.left.value == value){
                    parentNode.left = null;
                    return ;
                }else if(parentNode.right!=null&&parentNode.right.value == value){
                    parentNode.right = null;
                    return ;
                }
            }else if(curNode.right != null&& curNode.left != null){
                curNode.value = delRightMin(curNode);
            }else{
                if(parentNode == null){
                    if(curNode.left != null){
                        root = curNode.left;
                    }else if(curNode.right != null){
                        root = curNode.right;
                    }
                }
                if(parentNode.left == curNode){
                    if(curNode.left != null){
                        parentNode.left = curNode.left;
                    }else if(curNode.right != null){
                        parentNode.left = curNode.right;
                    }
                }else if(parentNode.right == curNode){
                    if(curNode.left != null){
                        parentNode.right = curNode.left;
                    }else if(curNode.right != null){
                        parentNode.right = curNode.right;
                    }
                }
            }
        }
    }
}
//创建节点
class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }

    //添加节点
    //递归形式，满足二叉排序树
    public void add(Node node){
        if(node == null){
            return ;
        }

        //判断传入的值，和当前节点的关系
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
    }

    //中序遍历
    public void infixOrder(){
        if(this.left!=null){
            this.left.infixOrder();
        }
        System.out.println(this);
        if(this.right!=null){
            this.right.infixOrder();
        }
    }

    //查找要删除的节点
    public Node search(int value){
        if(value == this.value){ //找到的就是节点
            return this;
        }else if(value < this.value){
            if(this.left == null){
                return null;
            }
            return this.left.search(value);
        }else{
            if(this.right == null){
                return null;
            }
            return this.right.search(value);
        }


    }

    //查找要删除节点的父节点
    public Node searchParent(int value){
        if((this.left != null && this.left.value == value)||(this.right != null&&this.right.value == value)){
            return this;
        }else{
            //如果查找的值小于当前节点的值，并且当前节点的左子结点不为空
            if(value < this.value && this.left != null){
                return this.left.searchParent(value);
            }else if(value >= this.value && this.right != null){
                return this.right.searchParent(value);
            }else{
                return null;
            }
        }
    }
    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
