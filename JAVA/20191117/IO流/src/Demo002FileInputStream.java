import java.io.FileInputStream;
import java.io.IOException;

public class Demo002FileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
      int len = 0;
    byte[] b = new byte[1024];
    while((len = fis.read(b) )!= -1){
        System.out.println(new String(b,0,len));
    }
        fis.close();
    }
}
