public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread("新的线程");

        mt.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程！"+i);
        }
    }
}
