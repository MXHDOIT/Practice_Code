import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        ((ArrayList<String>) list).add("s");
        ((ArrayList<String>) list).add("da");

        Iterator<String>  ite = list.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }

    }
}
