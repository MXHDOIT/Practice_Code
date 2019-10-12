package day0101;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 78;
		int num2 = 4;
		
		int teg = divisor(num1,num2);
		
		System.out.println(teg);
	}
	public static int divisor(int num1,int num2) {
		while(num1%num2 != 0)
		{
			int temp = num1%num2;
			num1 = num2;
			num2 = temp;
		}
		
		return num2;
	}
}
