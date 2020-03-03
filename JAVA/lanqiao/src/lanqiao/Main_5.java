package lanqiao;

import java.util.*;
public class Main_5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		for(int i = num1;i <= num2;i++) {
			numSplit(i);
		}
		
	}
	
	public static void numSplit(int n) {
		if(isSplit(n)) {
			System.out.println(n+"="+n);
			return ;
		}
		
		System.out.print(n+"=");
		for(int i= 2;i <= n/2;) {
			if(n%i == 0) {
				System.out.print(i);
				n /= i;
				System.out.print("*");
				if(isSplit(n)) {
					System.out.println(n);
					break;
				}
			}else {
			i++;
		}
		}	
	}
	
	public static boolean isSplit(int n) {
		for(int i = 2;i <= n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		
		return true;
	}
}
