import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestSevver {
    public static void main(String[] args) {
        FileOutputStream fos = new FileOutputStream("c://b.jpg");

        ServerSocket server = new ServerSocket(8888);
        Socket accept = server.accept();

        InputStream is = accept.getInputStream();
        File file = new Fil
        if()


    }
}
