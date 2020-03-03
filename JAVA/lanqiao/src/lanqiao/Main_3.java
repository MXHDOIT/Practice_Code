package lanqiao;

import java.util.Scanner;
public class Main_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int h= n / (60*60);
		n %= (60*60);
		int m = n / 60;
		n %= 60;
		int s = n;
		System.out.print(h+":"+m+":"+n);
	}

}
