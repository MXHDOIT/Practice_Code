public class ChiHuo extends Thread {
    private BaoZi baozi;

    public ChiHuo(String name, BaoZi baozi) {
        super(name);
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while(true){
            synchronized (baozi){
                if(baozi.flag == false){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货正在吃"+baozi.pi+""+baozi.xian);
                baozi.flag = false;
                baozi.notify();
            }
        }
    }
}
