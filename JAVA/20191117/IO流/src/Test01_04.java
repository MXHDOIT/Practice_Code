import java.io.FileInputStream;
import java.io.IOException;

public class Test01_04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("aa.txt");

        byte[] b = new byte[1024];

        int len = -1;
        while((len = fis.read(b))!=-1){
            System.out.println(new String(b,0,len));
        }

        fis.close();
    }
}
