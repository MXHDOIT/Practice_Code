public class Test {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
//传入包子对象，作为锁对象
        ChiHuo ch = new ChiHuo("吃货",bz);
        BaoZiPu bzp = new BaoZiPu("包子铺",bz);

        ch.start();
        bzp.start();
    }
}
