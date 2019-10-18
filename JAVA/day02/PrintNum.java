public class PrintNum {
    public static void main(String[] args){

        print(1234);
    }

    public static void print(int num){
//        if(num < 10)
//        {
//            System.out.print(num);
//        }else {
//            print(num/10);
//            System.out.print(num%10);
//        }

        if(num > 9) {
            print(num/10);
        }
        System.out.println(num%10);
    }
}
