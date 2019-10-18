public class Fibola {
    public static void main(String[] args){
        System.out.println(f(5));
    }

    public static int f(int n) {
        if(n ==1|| n== 2)
            return 1;
        return f(n-1)+f(n-2);
    }

   public static int fbola2(int n){
        int f1 = 1;
        int f2 = 1;
        if(n == 1||n == 2){
            return 1;
        }
        int f3 = 0;
        for(int i = 3;i <= n;i++){
            f3 = f1+f2;
            f1 = f2;
            f2 = f3;
        }

        return f3;

    }
}
