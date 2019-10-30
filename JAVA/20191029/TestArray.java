import java.util.Arrays;
public class TestArray {
    public static void main(String[] args) {
        String str = "dasdasdasddgji";
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        for (int i = arr.length-1; i > 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
