import java.util.ArrayList;

public class TestSuv {
    public static void main(String[] args) {
        Suv suv1 = new Suv("suv",5079, 750000);
        Suv suv2 = new Suv("suv",4813, 760000);
        Suv suv3 = new Suv("suv",4270, 127800);
        Suv suv4 = new Suv("suv",4545, 188800);

        ArrayList<Suv>  list = new ArrayList<>();

        list.add(suv1);
        list.add(suv2);
        list.add(suv3);
        list.add(suv4);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).showAuto();
            System.out.println(list.get(i).bigSuv());
        }
    }
}
