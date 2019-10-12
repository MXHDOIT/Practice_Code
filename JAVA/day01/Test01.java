package day0101;
//给定两个 int 变量, 交换变量的值
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b = 20;
//		int t = a;
//		a = b;
//		b = t;
		
		
//		a = a+b;
//		b = a-b;
//		a = a-b;
		
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("a = "+a+" ;"+"b = "+b);
	}

}
