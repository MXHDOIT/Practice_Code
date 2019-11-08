import java.util.LinkedList;

public class LinkedListDemo01 {
    public static void main(String[] args) {
        LinkedList<String>  slist = new LinkedList<>();
        slist.add("first");
        slist.addFirst("fiat");
        slist.push("www.");
        slist.addLast("。com");

        String first = slist.getFirst();
        String last = slist.getLast();

        for(String x:slist){
            System.out.println(x);
        }

        System.out.println(first +"  =   "+last);
    }
}
