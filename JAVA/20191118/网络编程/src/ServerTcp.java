import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTcp {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);

        Socket ap = ss.accept();
        InputStream is = ap.getInputStream();
        
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);

        System.out.println(new String(bytes,0,len));

        OutputStream os = ap.getOutputStream();
        os.write("19".getBytes());

        is.close();
        ap.close();
        ss.close();



    }
}
