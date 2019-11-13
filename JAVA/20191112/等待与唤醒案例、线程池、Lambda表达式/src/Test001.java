public class Test001 {
    public int start =1;
    public int end = 99;
    public static void main(){
        method();
    }

    public static void method(){
        Runnable a = ()->{
            for(int i = 0;i < 100;i++){
                System.out.println(i);
            }
        };

        Thread r = new Thread(a);
        r.start();
    }
}
