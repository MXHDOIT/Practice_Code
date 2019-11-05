import java.util.ArrayList;

public class CollectionTest02 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list = listTest(arr);

        System.out.println(list);
     }

    public static ArrayList<Integer> listTest(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int x:arr){
            list.add(x);
        }
        return list;
    }
}
