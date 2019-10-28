import java.util.ArrayList;

public class Test03ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("dasd");
        list.add("dasdasf");
        list.add("hui");

        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print('{');
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i != list.size()-1) {
                System.out.print('@');
            }
        }
        System.out.println('}');
    }
}
