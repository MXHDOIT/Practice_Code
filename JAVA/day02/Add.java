public class Add {
    public static void main(String[] args){
        System.out.println(f(10));
    }
    public static int f(int n){
        if(n > 1)
        {
            return f(n-1)+n;
        }
        return 1;
    }
}
