package day0101;
//��ȡһ���������������������е�ż��λ������λ�� �ֱ�������������С� 13. ���һ��������ÿһλ. 14. ��ɲ�������Ϸ

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 87;
		
		odd(num);
		System.out.println();
		odd(num >>> 1);
	}
	
	public static void odd(int num) {
		if(num == 0)
			return ;
		odd(num >>> 2);
		System.out.print(num&1);
	}
	
	

}
