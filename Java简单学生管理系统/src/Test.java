import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        int age = in.nextInt();
        String id = in.nextLine();
        System.out.println("打赢");
        System.out.println(name+"=="+id+"=="+age);
    }
}
