package day0101;
import java.util.Scanner;
public class Test14 {

	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int text = 9896757; 
		boolean flag = true;
		in = new Scanner(System.in);
		menu();
		int input = in.nextInt();
	
		switch(input) {
			case 1:
				while(n-- > 0) {
					int password = in.nextInt();
					if(password == text) {
						System.out.println("������ȷ��");
						break;
					}else {
						System.out.println("����������������룺");
					}
				}
				break;
			case 0:flag = false;
				System.out.println("�˳���Ϸ");
				break;
			default:System.out.println("����������������룺");
				break;
		}
		
		
		
	}
	public static void menu()
	{
		System.out.println("**********************");
		System.out.println("**********************");
		System.out.println("******1.play game*****");
		System.out.println("********0.exit********");
		System.out.println("**********************");
	}

}
