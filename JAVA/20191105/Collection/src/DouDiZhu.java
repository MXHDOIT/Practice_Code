import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//斗地主案例
//    1.准备牌
//    2.洗牌
//    3.发牌
//    4.看牌
public class DouDiZhu {
    public static void main(String[] args) {
        //准备牌
        //定义一个存储54张牌的ArrayList集合，泛型用String
        ArrayList<String> poker = new ArrayList<>();

        //定义两个数组，一个数组存储牌的花色，一个存储牌的序号
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};

        //先把大王和小王存储到poker集合中
        poker.add("大王");
        poker.add("小王");
        //循环嵌套遍历两个数组，组装52张牌
        for(String x:colors){
            for (String y:numbers){
                poker.add(x+y);
//                System.out.println(x+y);
            }
        }

//        2.洗牌
//                使用集合的工具类Collections的方法
//                static void shuffle(List<?> list) 使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);
//        System.out.println(poker);

//        3.发牌
//                定义4个集合，存储玩家的牌和底牌

        ArrayList<String> play01 = new ArrayList<>();
        ArrayList<String> play02 = new ArrayList<>();
        ArrayList<String> play03 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
           String p = poker.get(i);

            if(i>=51){
               dipai.add(p);
            }else if(i%3 == 0){
                play01.add(p);
            }else if(i%3 ==1){
                play02.add(p);
            }else{
                play03.add(p);
            }
        }

        System.out.println(play01);
        System.out.println(play02);
        System.out.println(play03);
        System.out.println(dipai);
    }
}
