package day0101;
//获取一、个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列。 13. 输出一个整数的每一位. 14. 完成猜数字游戏

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
