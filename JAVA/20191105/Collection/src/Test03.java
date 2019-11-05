import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ClassFan<String> cla = new ClassFan<>();
        cla.toStr("das");

        ClassFan<Integer> cla1 = new ClassFan<>();
        cla1.toStr(12);

        ArrayList<Integer>  ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        print(ar);
        ArrayList<String>  br = new ArrayList<>();
        br.add("das");
        br.add("32");
        print(br);
    }

    public static void print(ArrayList<?> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}
