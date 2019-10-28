import java.util.ArrayList;
import java.util.Random;
//产生6个随机数字放在集合内
public class Test01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        int count = 6;

        while(count-- >0){
            list.add(r.nextInt(33)+1);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
