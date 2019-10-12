package day0101;

public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0;i <= 999;i++) {
			if(flower(i)) {
				System.out.println(i);
			}
		}
	}
	
	public static int figure(int num) {
		int count = 0;
		while(num > 0)
		{
			count++;
			num /= 10;
		}
		
		return count;
	} 
	
	public static boolean flower(int num) {
		int sum = 0;
		int temp = num;
		while(num>0) {
			sum += Math.pow((num%10), figure(num));
			num /= 10;
		}
		
		if(sum == temp)
			return true;
		return false;
	}
}
