public class Jump {
    public static void main(String[] args){
        System.out.println(f(10));
    }
    public static  int f(int n){
        if(n <= 2)
            return n;
        return f(n-1)+f(n-2);
    }
}
