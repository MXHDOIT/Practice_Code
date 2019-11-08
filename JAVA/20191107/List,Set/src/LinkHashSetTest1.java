import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSetTest1 {
    public static void main(String[] args) {
        LinkedHashSet<String>  list = new LinkedHashSet<>();
        list.add("dassd");
        list.add("ooo");

        Iterator<String>  lte = list.iterator();
        while(lte.hasNext()){
            System.out.println(lte.next());
        }

        for(String x:list){
            System.out.println(x);
        }
    }
}
