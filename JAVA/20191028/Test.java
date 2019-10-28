import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        int cou = r.nextInt(10)+1;
        System.out.println(cou);
    }
}
