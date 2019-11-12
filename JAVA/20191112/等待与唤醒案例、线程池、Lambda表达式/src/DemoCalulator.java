public class DemoCalulator {
    public static void main(String[] args) {
        //匿名内部类
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a+b;
            }
        });

        //lambda
//        invokeCalc(90,10,(int a,int b)->{
//            return a+b;
//        });
        invokeCalc(90,10,(a,b)-> a+b
        );
    }

    public static void invokeCalc(int a,int b,Calculator c){
        int sum = c.calc(a,b);
        System.out.println(sum);
    }
}
