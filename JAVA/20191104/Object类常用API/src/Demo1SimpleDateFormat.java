import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat text = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        System.out.println(text.format(date));
        Date date1 = text.parse("2019-11-04 18:52:45");
        System.out.println(date1
        );
    }
}




