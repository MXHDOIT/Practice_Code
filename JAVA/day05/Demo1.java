public class Demo1 {
    public static int sum(int a,int b) {
        return a+b;
    }


    public static int sum(int a,int b,int c) {
        return a+b+c;
    }

    public static int sum(int... a) {
        int ret = 0;
        for(int x:a){
            ret += x;
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,2));
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2));
        System.out.println(sum(a));
        System.out.println(sum(new int[]{1,2,3}));
    }
}
