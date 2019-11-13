
//包子捕线程与吃货线程关系--》通信(互斥)
//

public class BaoZiPu extends Thread{
    private BaoZi baozi;


    public BaoZiPu(String name, BaoZi baozi) {
        super(name);
        this.baozi = baozi;
    }

    @Override
    public void run() {
        int count =0;
        while (true){
            synchronized (baozi){
                //有包子进入wait状态
                if(baozi.flag == true){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                    //生产包子两种
                    if(count%2 == 0){
                        baozi.pi = "薄皮";
                        baozi.xian = "三鲜";
                    }else{
                        baozi.pi="冰皮";
                        baozi.xian = "牛肉";
                    }

                    count++;
                    System.out.println("包子铺在生产"+baozi.pi+""+baozi.xian);

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    baozi.flag = true;
					  //包子生产完毕，唤醒消费者线程吃包子
                    baozi.notify();
                    System.out.println("好了");

            }
        }

    }
}
