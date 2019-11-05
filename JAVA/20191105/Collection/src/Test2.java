import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        Collection<String>  str = new ArrayList<>();
        ((ArrayList<String>) str).add("dads");
        ((ArrayList<String>) str).add("hello");
        Iterator<String> ite = str.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }

        for(String x:str){
            System.out.println(x);
        }


        Collection coll = new ArrayList();
        ((ArrayList) coll).add(454);
        ((ArrayList) coll).add("45");

        Iterator iter = coll.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
