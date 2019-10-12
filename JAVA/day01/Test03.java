package day0101;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7;
		int sum = 0;
		int i = 0;
		while(a != 0) {
			sum = sum +(a%2)*(int)Math.pow(10,i++);
			a /= 2;
		}
		
		System.out.println(sum);
	}

}
