import java.util.ArrayList;

public class CollectionTest03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(56);

        Object[] obj = list.toArray();
        for(Object x:obj){
            System.out.println(x);
        }
     }
}
