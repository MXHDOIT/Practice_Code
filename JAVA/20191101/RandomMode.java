import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney,final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0; i < totalCount-1; i++) {
            int num = r.nextInt(leftMoney/leftCount*2)+1;
            list.add(num);
            leftMoney -= num;
            leftCount--;
        }

        list.add(leftCount);

        return list;
    }
}
