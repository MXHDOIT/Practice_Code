package day0101;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 987;
		print(num);
	}
	
	public static void print(int num)
	{
		if(num>9)
		{
			print(num/10);
		}
		System.out.printf("%d ",num%10);
	}

}
