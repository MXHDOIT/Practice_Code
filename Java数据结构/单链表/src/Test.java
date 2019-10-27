public class Test {
    public static void main(String[] args) {
    MySignalList list = new MySignalList();

    list.addFirst(0);
    list.addFirst(1);
    list.addFirst(2);
    list.addTail(3);
    list.addTail(3);
    list.addFirst(2);

    list.display();
    System.out.println("===========");
    list.removeAllKey(2);
    list.remove(1);
    list.removeAllKey(3);
    list.display();
    }
}
