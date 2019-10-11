package day0101;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1;i<=100;i++) {
			sum += digit(i);
		}
		
		System.out.println(sum);
	}
	public static int digit(int n) {
		int count = 0;
		while(n > 0) {
			int temp = n%10;
			if(temp == 9) {
				count++;
			}
			n /= 10;
		}
		return count;
	}
}
