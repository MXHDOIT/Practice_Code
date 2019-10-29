import java.util.Arrays;
import java.lang.*;
public class Demo01String {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);

        char[] arr = str1.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        byte[]  b = str1.getBytes();
        System.out.println(b[0]);

        String sta = str1.replace('a','w');
        System.out.println(sta);
    }
}
