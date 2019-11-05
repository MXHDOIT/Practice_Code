import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest04 {
    public static void main(String[] args) {
        Collection<Integer>  list = new ArrayList<>();
        ((ArrayList<Integer>) list).add(1);
        ((ArrayList<Integer>) list).add(2);

        System.out.println(list.contains(4));
        System.out.println(list.isEmpty());
    }
}
