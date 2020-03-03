package lanqiao;

import java.util.*;
public class Main_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str1 = in.next();
		
		String str2 = in.next();
		int index =0;
		if(str1.length() != str2.length()) {
			index = 1;
		}else if(str1.equals(str2)) {
			index = 2;
		}else if(str1.equalsIgnoreCase(str2)) {
			index = 3;
		}else {
			index = 4;
		}
		
		
		System.out.print(index);
	}

}
