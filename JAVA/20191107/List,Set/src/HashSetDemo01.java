import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        Iterator lit = set.iterator();

        while(lit.hasNext()){
            System.out.println(lit.next());
        }

        for(int x:set){
            System.out.println(x);
        }
    }
}
