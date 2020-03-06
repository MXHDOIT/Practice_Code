package lanqiao;

import java.util.*;
public class Main_8 {
	static String[] nums = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
	
	//�ָ�һ�����ִӺ���ǰ��Ϊ���ɸ�4λ��
	static String[] split(String s) {
		int t = (int)Math.ceil(s.length()*1.0/4); //�ֳɶ��ٶ�
		String[] res = new String[t];  //ÿһ�ε����ִ�
		for(int i = t-1;i > 0;i--) {
			res[i] = s.substring(s.length()-4,s.length());
			s = s.substring(0,s.length()-4);
		}
		res[0] = s;
		return res;
	}
	
	//��һ����λ��������
	static String read(String s) {
		String fristZero="";
		//�����ͷ����Ļ�����ֻ����һ��
		while(s.startsWith("0")) {
			s=s.substring(1,s.length());
			fristZero = "ling ";
		}
		String res = "";
		if(s.length() == 1) {
			res = fristZero+nums[s.charAt(0)-48];
		}else if (s.length()==2)
			res = fristZero + nums[s.charAt(0)-48]+" shi "+nums[s.charAt(1)-48];
		else if (s.length()==3)
			res = fristZero + nums[s.charAt(0)-48]+" bai "+nums[s.charAt(1)-48]+" shi "+nums[s.charAt(2)-48];
		else if (s.length()==4)
			res = fristZero + nums[s.charAt(0)-48]+" qian "+nums[s.charAt(1)-48]+" bai "+nums[s.charAt(2)-48]+" shi "+nums[s.charAt(3)-48];
		return deal(res);
	}
	
	//deal(),��������Ƿ��Ķ������磺��0741������ɡ���ǧ�߰���ʮһ������7041������ɡ���ǧ�����ʮһ�� �� ��7401������ɡ���ǧ�İ���ʮһ�� �� ��7410������ɡ���ǧ�İ�һʮ�㡱�ȣ� �Լ�˫�����⡣
	static String deal(String s) {
		s=s.replace("ling wan", "wan");
		s=s.replace("ling bai", "ling");
		s=s.replace("ling shi", "ling");
		s=s.replace("ling ling", "ling");
		if(s.endsWith(" ling")) //ĩβ���㲻��
			s=s.substring(0,s.length()-5);
		if(s.startsWith("yi shi")) //��ͷ��10��������һʮ����������ʮ��
			s = s.replace("yi shi", "shi");
		if(s.endsWith("  wan ")) //�������1��0000��0000�����ɡ�yi yi  wan ��;
		    s = s.replace("  wan ", "");
		return s;
	}
	
	static String finalRead(String[] s) {//��һ�����ֶ�����
		if(s.length == 1) {
			return read(s[0]);
		}else if(s.length == 2) {
			return read(s[0])+" wan "+read(s[1]);
		}else if(s.length==3) {
			return read(s[0])+" yi "+read(s[1])+" wan "+read(s[2]);
		}else {
			return "error!";
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String res = finalRead(split(s));
		System.out.println(deal(res));
	}

}
