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
			System.out.println("���дһ������");
			int input = in.nextInt();
			if(input == a) {
				System.out.println("��ϲ����");
				break;
			}else if(input > a) {
				System.out.println("���µ��е��");
			}else {
				System.out.println("���µ��е�С");
			}
		}
	}

}
