package day0101;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1000;i <2000;i++) {
			if(isLeap(i))
			{
				System.out.println(i);
			}
		}
	}
	public static boolean isLeap(int num) {
		if((num%4 == 0&&num%100 != 0)||num%400 == 0)
		{
			return true;
		}
		return false;
	}
}
