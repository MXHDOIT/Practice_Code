package day0101;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 101;
		int c = 12;
		int max = 0;
		
		if(a > b) {
			if(a > c) {
				max = a;
			}else {
				max = c;
			}
		}else {
			if(b > c) {
				max = b;
			}else {
				max = c;
			}
		}
		
		System.out.println(max);
	}

}
