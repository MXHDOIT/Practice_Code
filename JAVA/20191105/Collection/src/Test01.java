import java.util.ArrayList;
import java.util.Collection;

public class Test01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        coll.add("hello");
        coll.add("world");
        ((ArrayList<String>) coll).add("i");
        ((ArrayList<String>) coll).add("believe");

        System.out.println(coll);
        System.out.println("================");
        coll.remove("world");
        System.out.println(coll);
        System.out.println("================");
        int num = coll.size();
        System.out.println(num);
//        coll.clear();
//        System.out.println(coll);
        Object[]  str = coll.toArray();
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }


        System.out.println(coll.contains("s"));
        System.out.println(coll.isEmpty());
    }
}
