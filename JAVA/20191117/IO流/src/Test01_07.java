import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test01_07 {
    public static void main(String[] args) throws IOException {
        FileWriter bw = new FileWriter("info.txt");

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("请输入内容：");
            String str = sc.nextLine();

            if("886".equals(str)){
                break;
            }
            bw.write(str);

            bw.write(System.lineSeparator());
        }
        bw.close();
    }
}
