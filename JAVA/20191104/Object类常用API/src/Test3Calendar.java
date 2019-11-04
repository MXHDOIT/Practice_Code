import java.util.Calendar;

public class Test3Calendar {
    public static void main(String[] args) {
        Calendar  c =  Calendar.getInstance();

        c.set(Calendar.YEAR,2018);
        c.set(Calendar.MONTH,1);
        c.set(Calendar.DATE,14);

//        c.set(2018,1,14);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DATE);


        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(year+"年"+month+"月"+day+"日是星期"+week);
    }

    public static char getWeek(int a){
        char[] c={' ','日','一','二','三','四','五','六'};
        return c[a];
    }
}
