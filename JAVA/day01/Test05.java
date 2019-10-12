package day0101;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		char  arr[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] brr = new char[10];
		int i = 0;
		while(num != 0)	{
			brr[i++] = arr[num%16];
			num /= 16;
		}
		
		for(int k = i-1;k >= 0;k--) {
			System.out.print(brr[k]);
		}
		
	}

}
