import java.io.FileOutputStream;
import java.io.IOException;

public class Test01_01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("aa.txt");

        fos.write(97);

        byte[] b = new byte[]{1,2,5,9};
        fos.write(b);
        fos.close();
    }
}
