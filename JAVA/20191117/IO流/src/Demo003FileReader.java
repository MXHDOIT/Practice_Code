import java.io.FileReader;
import java.io.IOException;

public class Demo003FileReader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("a.txt");
        int len = 0;
        while((len = fr.read())!= -1){
            System.out.print((char)len);
        }

        fr.close();
    }
}
