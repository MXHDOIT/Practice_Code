import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("aa.txt",true);
        String content = "i love java \r\ndas";
        fos.write(99);
        fos.write(98);
        fos.write(content.getBytes());
        fos.close();
    }
}
