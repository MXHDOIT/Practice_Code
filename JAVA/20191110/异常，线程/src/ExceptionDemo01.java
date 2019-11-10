import java.util.Objects;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        int[] arr = null;
        method(arr,7);
    }
    public static void method(int[] arr,int index){
//        if(arr == null){
//            throw new NullPointerException("空心的");
//        }
//
//        if(index < 0|| index > arr.length){
//            throw new ArrayIndexOutOfBoundsException("Dasd");
//        }
        Objects.requireNonNull(arr,"dasd");
    }
}
