import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01Date {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat text = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = text.format(now);
        System.out.println(s);

    }

}
