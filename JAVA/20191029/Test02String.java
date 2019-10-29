import java.util.Scanner;

public class Test02String {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = in.nextLine();
        char[] arr = str.toCharArray();
        int upCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= 'z' && arr[i] >= 'a') {
                smallCount++;
            }else if(arr[i] <= 'Z'&&arr[i] >= 'A'){
                upCount++;
            }else{
                numCount++;
            }
        }

        System.out.println("大写 "+upCount+" 小写 "+smallCount+" 数字 "+numCount);
    }
}
