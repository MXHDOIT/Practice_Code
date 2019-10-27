class Node{
    int data;
    public Node next;

    public Node(int data){
        this.data = data;
    }
}

public class MySignalList {
    public Node head;

    public MySignalList(){
        this.head = null;
    }

    //头插法
     public void addFirst(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        }else{
            node.next = this.head;
            head = node;
        }
     }

     //尾插法
    public void addTail(int data){
        Node node = new Node(data);
        if(head == null) {
            head = node;
        }else{
            Node tail = this.head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = node;
        }
    }

    private Node search(int index){
        Node cur = head;
        while(index-1 > 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){
        if(index < 0| index > size()){
            System.out.println("index不合法");
            return false;
        }
        if(index ==0){
            this.addFirst(data);
            return true;
        }

        Node cur = search(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
        return true;

    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = head;
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }

        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){

        if(head == null){
            return;
        }else{
            if(head.data == key) {
                head = head.next;
                return;
            }
        }
        Node cur = head.next;
        Node prev = cur;

        while(cur != null){
            if(cur.data == key){
                prev.next = cur.next;
                return;
            }
            prev = cur;
            cur = cur.next;
        }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        if(head == null){
            return;
        }else{
            while(head.data == key) {   //如果第一个数是要查找的
                head = head.next;
            }
        }

        Node cur = head.next;
        Node prev = head;

        while(cur != null){
            if(cur.data == key){
                prev.next = cur.next;
            }else {
                prev = cur;
            }
            cur = cur.next;
        }
    }
    //得到单链表的长度
    public int size(){
        Node cur = head;
        int count = 0;
        while(cur != null){
            count++;
            cur = cur.next;
        }

        return count;
    }

    public void display(){
        Node cur = head;

        while(cur != null){
            System.out.println(cur.data+" ");
            cur = cur.next;
        }
    }

    public void clear(){
        this.head = null;
    }
}
