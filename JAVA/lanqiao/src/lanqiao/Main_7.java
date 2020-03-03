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
	
	//�����ܷ񹹳ɻ��Ĵ�
		public static boolean isPossible(String str) {
			boolean ans = true;
			int[] cnt = new int[26];
			
			//������洢����Ԫ���±��Ӧ�������ĸ���ֵĴ���
			for(int i = 0;i < str.length();i++) {
				cnt[str.charAt(i)-'a']++;
			}
			
			int count = 0;//ͳ�Ƶ����ʵĴ���
			for(int i=0;i < 26;i++) {
				if(cnt[i]%2 == 1) {
					count++;
				}
			}
			
			//���ֻ���������ε���ĸ����1�������ܹ��ɻ��Ĵ�
			if(count >= 2) {
				ans = false;
			}
			
			return ans;
		}
		
		
		//����ܹ��ɻ����������ؽ����Ĵ���
		public static int getResult(String str) {
			if(str.length() == 1||str.length() == 2) {
				return 0;
			}
			
			int tmp = str.lastIndexOf(str.charAt(0)); //��ȡ���ַ���Ӧ���ַ��ڴ��ַ��������һ�γ��ִ�������
			 //tmpΪ0˵�����ַ�Ϊֻ����һ�ε���ĸ�����ؽ�tmpλ�õ��ַ��ƶ����ַ������м�Ĵ�����str.length()/2�����ݹ����getResult��������
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
