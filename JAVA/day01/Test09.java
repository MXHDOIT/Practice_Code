package day0101;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 9;
		printMul(n);
	}
	public static void printMul(int n) {
		for(int i = 1;i <= n;i++) {
			for(int j = 1;j<=i;j++) {
				System.out.printf("%d * %d = %-3d", i,j,i*j);
			}
				System.out.println();
		}
	}
}
