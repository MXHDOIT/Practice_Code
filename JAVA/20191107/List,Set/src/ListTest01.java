import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("zahngsan");
        list.add("dada");

        for(int i = 1;i < list.size();i++){
            String thisName = list.get(i);

            if(thisName.equals("dada")){
                list.set(i,"666");
            }
        }

        System.out.println(list);
    }
}
