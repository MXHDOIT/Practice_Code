public class DemoCook {
    public static void main(String[] args) {

        //匿名内部类
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("哥哥");
            }
        });

        //lambda表达式
        invokeCook(()->{
            System.out.println("didi");
        });
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
