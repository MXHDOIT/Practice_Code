public class CircleSingleLinkedList {
    public Person head;

    public CircleSingleLinkedList() {

    }

    /**
     * 添加孩子节点，侯建一个环形的链表
     * @param nums
     */
    public void addBoy(int nums){
        if(nums < 0){
            System.out.println("输入人数有误！");
            return;
        }

        Person cur = head;
        for(int i = 1;i <= nums;i++){
            Person node =  new Person(i);
            if(i == 1){
                head = node;
                node.next = head;
            }else{
                cur.next = node;
                node.next = head;
            }
            cur = node;
        }
    }

    /**
     * 遍历当前的环形链表
     */
    public void showBoy(){
        if(head == null){
            System.out.println("当前圈圈没有人");
            return ;
        }

        Person cur = head;
        while (true){
            System.out.println("小孩的编号"+cur.id);
            if(cur.next == head){
                break;
            }
            cur = cur.next;
        }
    }

    //根据用户输入，计算出小孩出圈的顺序

    /**
     *
     * @param startNum 表示从第几个小孩开始数数
     * @param countNum  表示数几下
     * @param nums  表示最初有多少小孩在圈中
     */
    public void countBoy(int startNum,int countNum,int nums){
        if(head == null || startNum < 1 || startNum > nums){
            System.out.println("参数输入有误，请重新输入！");
            return;
        }


        Person cur  = head;
        while(startNum -1 >0){
            cur = cur.next;
            startNum--;
        }

        Person prev = cur;
        while(true){
            if(prev.next == cur){
                break;
            }
            prev = prev.next;
        }

        while(true){
            if(prev == cur){
                break;
            }

            int count = countNum;
            while(count-1 > 0){
                prev = prev.next;
                cur = cur.next;
                count--;
            }

            System.out.println(cur.id);
            cur = cur.next;
            prev.next = cur;
        }

        System.out.println(cur.id);
    }


}
