import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTcp {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",8888);

        OutputStream os = s.getOutputStream();
        os.write("我爱你中国".getBytes());

        InputStream is = s.getInputStream();

        byte[] bytes = new byte[1024];
        int len = is.read(bytes);

        System.out.println(new String(bytes,0,len));
        os.close();
        s.close();

    }
}
