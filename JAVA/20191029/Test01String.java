public class Test01String {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

        System.out.println(fromArray(arr));
    }
    public static String fromArray(int[] arr){
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str += "word"+ arr[i];
            if(i != arr.length-1){
                str += "#";
            }else{
                str += "]";
            }
        }

        return str;
    }
}
