class Num{
    int a;
    int b;

    public void swap(){
        int temp = a;
        a = b;
        b = temp;
    }
}

public class Test {
    public static void main(String[] args) {
        Num n= new Num();
        n.a = 20;
        n.b = 10;

        n.swap();
        System.out.println(n.a +" "+n.b);
    }
}
