import java.util.ArrayList;
//集合
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("马新航");
        list.add("danrui");
        list.add("马");
        list.add("航");

        System.out.println(list);

        System.out.println(list.get(2));   //根据索引获取值

        String who = list.remove(1); //根据索引删除
        System.out.println("谁被删 "+who);
        System.out.println(list);

        System.out.println(list.size()); //获取长度


        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
