package lanqiao;

import java.util.Scanner;
public class Main_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		Long n = in.nextLong();
		Long total = n*(n+1)/2;
		System.out.print(total);
	}

}
