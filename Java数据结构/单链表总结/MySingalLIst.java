public class MySingalLIst {
    public Node head;

    public MySingalLIst(){
        this.head = null;
    }

    //头插法
    public void insertHead(int data){
        Node node = new Node(data);

        if (this.head == null) {
            this.head = node;
        }else {
            node.next = this.head;
            this.head = node;
        }
    }
    //尾插法
    public void insertTail(int data){
        Node node = new Node(data);

        if(this.head == null){
            this.head = node;
        }else{
            Node cur = head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //查询索引结点
    public Node search(int index){
        Node cur = head;
        while(index-- >0){
            cur = cur.next;
        }
        return cur;
    }
    //任意位置插入，第一个数据结点为0号下标
    public void insertIndex(int index,int data){
        if(index  < 0 || index > this.size()){
            System.out.println("索引错误");
            return;
        }

        Node node = new Node(data);
        if(index == 0){
            this.insertHead(data);
        }else{
            Node mid = search(index-1);
            node.next = mid.next;
            mid.next = node;
        }
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean searchKey(int key){
        if(this.head == null){
            return false;
        }

        Node cur = head;
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur =cur.next;
        }

        return false;
    }
    //删除第一次出现关键字为key的节点
    public boolean delKey(int key){
        if(this.head == null)
            return false;
        Node cur = head;
        if(head.data == key){
            this.head = this.head.next;
            return true;
        }
        Node prev = cur;
        cur = cur.next;
        while(cur != null){
            if(cur.data == key){
                prev.next = cur.next;
                return true;
            }
            prev = cur;
            cur = cur.next;
        }

        return false;
    }
    //删除所有值为key的节点
    public void delAllKey(int key){
        if(this.head == null)
               return ;
        Node cur = head;
        while(head.data == key){
            this.head = this.head.next;
        }

        Node prev = cur;
        cur = cur.next;
        while (cur != null){
            if(cur.data == key){
                prev.next = cur.next;
            }else{
                prev = cur;
            }
            cur = cur.next;
        }
    }
    //得到单链表的长度
    public int size(){
        int count = 0;
        Node cur = head;

        while(cur != null){
            count++;
            cur = cur.next;
        }

        return count;
    }
    //打印单链表
    public void display(){
        if(this.head == null){
            return ;
        }
        Node cur = head;

        while(cur != null){
            System.out.print(cur.data+ " ");
            cur = cur.next;
        }
        System.out.println();
    }
    //清空单链表
    public void clear(){
        this.head = null;
    }
    //翻转单链表
    public Node reverse(){
        if(this.head == null){
            return null;
        }

        Node cur =head;
        Node prve = null;
        Node neaList = null;
        while(cur != null){
            Node curNext = cur.next;
            if(curNext == null){
                neaList = cur;

            }
            cur.next = prve;
            prve = cur;
            cur = curNext;
        }
        return neaList;

    }
    //查询中间结点
    public Node findMid(){
        if(this.head == null){
            return null;
        }

        Node slow = head;
        Node fast = head;
        while(fast.next!= null){
            slow = slow.next;
            fast = fast.next;
            if(fast.next != null){
                fast = fast.next;
            }
        }

        return slow;
    }
    //删除重复的节点(不保留)

    //找倒数第k个节点
    public Node findLastK(int k){
        if(this.head == null || k < 0){
            return null;
        }

        Node fast = head;
        while(k-1 >0 ){
            fast = fast.next;
            if(fast == null){
                return null;
            }
            k--;
        }

        Node slow = head;
        while(fast.next != null){
            slow =slow.next;
            fast =fast.next;
        }
        return slow;
    }
    //链表的回文结构*****
    //创建环-
    //是否有环
    //是否有环，有的话位置在那
    //如果有环，求环长度
    //以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
}
