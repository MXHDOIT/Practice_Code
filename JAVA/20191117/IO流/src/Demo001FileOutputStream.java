import java.io.FileOutputStream;
import java.io.IOException;

public class Demo001FileOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos= new FileOutputStream("C:\\Users\\apple\\Desktop\\Java\\黑马练习\\IO流\\a.txt");
        fos.write(49);
        fos.write(48);
        fos.write(48);

        byte[] b = {-65,-66,-67,68};
        fos.write(b);

        String s = "你好";
        fos.write(s.getBytes());
        fos.close();
    }
}
