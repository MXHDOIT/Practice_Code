public class RunnableTmp1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"处于线程池");
    }
}
