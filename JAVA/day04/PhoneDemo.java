class Phone{
    String brand;
    int price;
    String color;


    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }
}

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();

        p.brand = "华为";
        p.color="blue";
        p.price = 2000;

        System.out.println("我买了一个"+p.color+"的"+p.brand+"手机,价值"+p.price);
        p.call("jinpeng");
        p.playGame();
    }
}
