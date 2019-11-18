import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TestClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("01.jpg");

        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();
        byte[] b =new byte[1024];
        int len = 0;
        while((len = fis.read(b)) != -1){
            os.write(b,0,len);
            os.flush();
        }

        System.out.println("文件发送完毕");
        InputStream is = socket.getInputStream();

        while ((len = is.read(b))!= -1){
            System.out.println(new String(b,0,len));
        }
        is.close();
        fis.close();
    }
}
