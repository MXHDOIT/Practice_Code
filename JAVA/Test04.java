package day0101;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		int ret = 1;
		int sum = 0;
		while(i <= 5)
		{
			ret *= i++;
			sum += ret;
			
		}
		
		System.out.println(sum);
	}

}
