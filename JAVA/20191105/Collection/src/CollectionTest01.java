import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        ((ArrayList<String>) list).add("a");
        ((ArrayList<String>) list).add("a");
        ((ArrayList<String>) list).add("b");
        ((ArrayList<String>) list).add("b");
        ((ArrayList<String>) list).add("c");

        System.out.println(find(list,"a"));
    }

    public static int find(Collection<String> list,String str){
        int count = 0;
        for(String x:list){
            if(x.equals(str)){
                count++;
            }
        }
        return count;
    }
}
