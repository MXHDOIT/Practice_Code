public class TestCalutor {
    public static void main(String[] args) {
        add(10,20,(a,b)->a+b);
    }

    private static void add(int a,int b,Calutor c){
        System.out.println(c.cal(a,b));
    }
}
