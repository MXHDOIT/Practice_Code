import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService ser = Executors.newFixedThreadPool(2);

        MyRunnable r = new MyRunnable();
        ser.submit(r);
        ser.submit(r);
        ser.submit(r);
    }
}
