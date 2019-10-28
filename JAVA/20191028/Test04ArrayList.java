
//用一个大集合存20个数字，然后筛选其中的偶数，放到小集合中，用自定义方法实现筛选

import java.util.ArrayList;
import java.util.Random;

public class Test04ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();

        int count = 20;

        while(count-- > 0){
            list.add(r.nextInt());
        }

        System.out.println(list);

        list = choose(list);

        System.out.println(list);
    }

    public static ArrayList<Integer> choose(ArrayList<Integer> e){
       ArrayList<Integer>  newList = new ArrayList<>();

        for (int i = 0; i < e.size(); i++) {
            if(e.get(i)%2 == 0){
                newList.add(e.get(i));
            }
        }

        return newList;
    }
}
