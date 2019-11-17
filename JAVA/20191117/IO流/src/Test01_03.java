import java.io.FileInputStream;
import java.io.IOException;

public class Test01_03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("aa.txt");


        int len = 0;
        while((len = fis.read())!=-1){
            System.out.println(len);
        }
        fis.close();
    }
}
