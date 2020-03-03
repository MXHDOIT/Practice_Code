package lanqiao;

import java.util.*;
public class Main_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        if(isPossible(str)) {
        	System.out.println(getResult(str));
        }
        else {
        	System.out.println("Impossible");
        }
        in.close();
	}
	
	//检验能否构成回文串
		public static boolean isPossible(String str) {
			boolean ans = true;
			int[] cnt = new int[26];
			
			//用数组存储数组元素下标对应的序号字母出现的次数
			for(int i = 0;i < str.length();i++) {
				cnt[str.charAt(i)-'a']++;
			}
			
			int count = 0;//统计单数词的次数
			for(int i=0;i < 26;i++) {
				if(cnt[i]%2 == 1) {
					count++;
				}
			}
			
			//如果只出现奇数次的字母多于1个，则不能构成回文串
			if(count >= 2) {
				ans = false;
			}
			
			return ans;
		}
		
		
		//如果能构成回文数，返回交换的次数
		public static int getResult(String str) {
			if(str.length() == 1||str.length() == 2) {
				return 0;
			}
			
			int tmp = str.lastIndexOf(str.charAt(0)); //获取首字符对应的字符在此字符串中最后一次出现处的索引
			 //tmp为0说明此字符为只出现一次的字母，返回将tmp位置的字符移动到字符串最中间的次数（str.length()/2），递归调用getResult（）方法
	        if(tmp == 0) {
	        	return str.length()/2+getResult(str.substring(1,str.length()));
	        }else {
	        	StringBuilder sb = new StringBuilder(str);
	        	sb.delete(0,0+1);
	        	sb.delete(tmp,tmp+1);
	        	return str.length()-tmp-1+getResult(sb.toString());
	        }  
		}
}
