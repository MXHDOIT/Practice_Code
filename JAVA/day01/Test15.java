package day0101;

public class Test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		int count = figure(num);
		
		System.out.println(count);
	}
	
	public static int figure(int num) {
		int count = 0;
		while(num != 0) {
			count++;
			num = num&(num-1);
		}
		
		return count;
	}

}
