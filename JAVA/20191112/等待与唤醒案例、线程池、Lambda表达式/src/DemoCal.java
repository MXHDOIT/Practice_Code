public class DemoCal {
    public static void main(String[] args) {

        //匿名内部类
        com(10, 20, new Cal() {
            @Override
            public int add(int a, int b) {
                return a+b;
            }
        });

        //lambda
        com(80,9,(int a,int b)->{
            return a+b;
        });

        //简化
        com(89,1,(a,b)->a+b);
    }
    public static void com(int a,int b,Cal c){
        System.out.println(c.add(a,b));
    }
}
