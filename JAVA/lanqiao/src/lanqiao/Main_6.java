package lanqiao;

import java.util.*;
public class Main_6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = in.nextInt(); //初始化数组大小
		final int M = in.nextInt();//初始化次幂
		int[][] array = new int[N][N];
		
		//初始化数组
		for(int i = 0;i < N;i++) {
			for(int j = 0;j < N;j++) {
				array[i][j] = in.nextInt();
			}
		}
		
		
		
		int[][] res = new int[N][N];
		for(int i = 0;i < res.length;i++) {
			res[i][i] =1; 
		}
		if(M != 0) {
			res= mulArr(array,array,M-1);
		}
		
		for(int i = 0;i < res.length;i++) {
			for(int j = 0;j < res.length;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static int[][] mulArr(int[][] arr1,int[][] arr2,int count){
		if(count == 0) {
			return arr1;
		}
		
		int[][] res = new int[arr1.length][arr1.length];
		for(int i = 0;i < arr1.length;i++) {
			for(int j = 0;j < arr1.length;j++) {
				for(int k = 0;k < arr1.length;k++) {
					res[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		
		return mulArr(res,arr2,count-1);
	}
}
