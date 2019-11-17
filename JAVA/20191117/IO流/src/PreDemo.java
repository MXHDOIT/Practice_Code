import java.util.Properties;
import java.util.Set;

public class PreDemo {
    public static void main(String[] args) {
        //定义
        Properties properties = new Properties();

        //添加
        properties.setProperty("kk","12");
        properties.setProperty("bb","45");
        properties.setProperty("cc","89");

        System.out.println(properties);

        Set<String> strings = properties.stringPropertyNames();
        for(String x:strings){
            System.out.println(x+"--"+properties.getProperty(x));
        }

    }
}
