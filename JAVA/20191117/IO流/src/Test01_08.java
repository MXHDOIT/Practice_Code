import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test01_08 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();

        pro.load(new FileInputStream("aa.txt"));

        Set<String> keys = pro.stringPropertyNames();
        for(String key:keys){
            if("lisi".equals(key)){
                pro.setProperty(key,"100");
            }
        }
        pro.store(new FileOutputStream("score.txt"),"haha");
    }
}
