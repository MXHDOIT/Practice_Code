import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("aa.txt");
        FileOutputStream fos = new FileOutputStream("bb.txt");
        int len = -1;

        while((len = fis.read()) != -1){
            fos.write(len);
        }

        fis.close();;
        fos.close();
    }
}
