import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import java.text.SimpleDateFormat;

public class Test02DateFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat text = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat text2 = new SimpleDateFormat("yyyy年MM月dd日");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        Date date = text.parse(str);
        String str2 = text2.format(date);
        System.out.println(str2);
    }
}
