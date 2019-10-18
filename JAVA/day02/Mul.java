public class Mul {
    public  static void main(String[] args){
        int n = 4;
        System.out.println(f(n));
    }

    public static int f(int n){
        if(n == 1){
            return 1;
        }else {
            return f(n-1)*n;
        }
    }
}
