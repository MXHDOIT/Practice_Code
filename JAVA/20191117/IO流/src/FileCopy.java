import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");
        int len = 0;
//        while((len = fis.read())!= -1){
//            fos.write(len);
//        }

        //使用数组缓冲
        byte[] bytes = new byte[1024];

        while((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();
    }
}
