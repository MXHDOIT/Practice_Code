 package day0101;
import java.lang.Math;
import java.util.Scanner;
public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int) (Math.random()*100);
		Scanner in = new Scanner(System.in);
		while(true)
		{
			System.out.println("请猜写一个数：");
			int input = in.nextInt();
			if(input == a) {
				System.out.println("恭喜您！");
				break;
			}else if(input > a) {
				System.out.println("您猜的有点大");
			}else {
				System.out.println("您猜的有点小");
			}
		}
	}

}
