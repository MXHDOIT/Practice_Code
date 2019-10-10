package day0101;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		if(isPrime(num))
		{
			System.out.println(num + " isPrime");
		}else {
			System.out.println(num+" not Prime");
		}
		
		
		for(int i = 0;i<=100;i++) {
			if(isPrime(i))
			{
				System.out.println(i + " isPrime");
			}
		}
	}
	public static boolean isPrime(int num)
	{
		for(int i = 2;i<Math.sqrt(num);i++)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	
}
