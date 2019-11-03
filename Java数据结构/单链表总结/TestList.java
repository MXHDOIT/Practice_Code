public class TestList {
    public static void main(String[] args) {
        MySingalLIst list = new MySingalLIst();

        //头插法
        list.insertHead(3);
        list.insertHead(4);
        //尾插法
        list.insertTail(1);
        list.insertTail(2);
        //索引打印
        list.insertIndex(0,1);
        list.insertIndex(4,9);



        //打印
        list.display();
        System.out.println("=================");
        //查询key在单链表中吗
        System.out.println(list.searchKey(7));
        System.out.println("=================");
        //删除key
        System.out.println(list.delKey(4));
        list.display();
        System.out.println("=================");
        //清空链表
//        list.clear();
//        list.display();
//        System.out.println("=================");
        //删除所有值为key的节点
        list.delAllKey(1);
        list.display();
        //翻转单链表
//        list.insertTail(2);
        list.head = list.reverse();
        list.display();
        //查询中间
        Node mid = list.findMid();
        System.out.println(mid.data);

        //查询到数第k个
        Node node = list.findLastK(4);
        System.out.println(node.data);
    }
}
