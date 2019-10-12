package day0101;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for(int i = 1;i <=100;i++)	{
			sum += 1.0/i*Math.pow(-1,i-1);
		}
		System.out.println(sum);
	}
	
}
