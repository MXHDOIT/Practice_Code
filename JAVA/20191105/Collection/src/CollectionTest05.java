import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest05 {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        ((ArrayList<Integer>) list).add(1);
        ((ArrayList<Integer>) list).add(2);
        ((ArrayList<Integer>) list).add(4);

        System.out.println(listTest(list,2));
    }

    public static int listTest(ArrayList<Integer> list,Integer s){
        int count = -1;
        for(Integer x:list){
            count++;
            if(x.equals(s)){
                break;
            }
        }
        return count;
    }
}
