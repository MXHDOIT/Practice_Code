public class ArrayMulTwo {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] brr = mul(arr);


        for(int x:brr){
            System.out.println(x);
        }

        System.out.println(toString(arr));
    }

    public static int[] mul(int[] arr){
        int[] brr = new int[arr.length];

        for(int i = 0;i<brr.length;i++){
            brr[i] = 2*arr[i];
        }

        return brr;
    }

    public static String toString(int[] arr){
        String ret = "[";
        for(int i = 0;i<arr.length;i++){
            if(i == arr.length-1){
                ret += arr[i];
            }else{
                ret += arr[i] + ",";
            }
        }
        ret += "]";
        return ret;
    }
}
