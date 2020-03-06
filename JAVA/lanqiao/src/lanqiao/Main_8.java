package lanqiao;

import java.util.*;
public class Main_8 {
	static String[] nums = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
	
	//分割一串数字从后往前分为若干个4位数
	static String[] split(String s) {
		int t = (int)Math.ceil(s.length()*1.0/4); //分成多少段
		String[] res = new String[t];  //每一段的数字串
		for(int i = t-1;i > 0;i--) {
			res[i] = s.substring(s.length()-4,s.length());
			s = s.substring(0,s.length()-4);
		}
		res[0] = s;
		return res;
	}
	
	//将一个四位数读出来
	static String read(String s) {
		String fristZero="";
		//如果开头是零的话我们只保留一个
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
	
	//deal(),用来处理非法的读法，如：“0741”会读成“零千七百四十一”；“7041”会读成“七千零百四十一” ； “7401”会读成“七千四百零十一” ； “7410”会读成“七千四百一十零”等； 以及双零问题。
	static String deal(String s) {
		s=s.replace("ling wan", "wan");
		s=s.replace("ling bai", "ling");
		s=s.replace("ling shi", "ling");
		s=s.replace("ling ling", "ling");
		if(s.endsWith(" ling")) //末尾的零不读
			s=s.substring(0,s.length()-5);
		if(s.startsWith("yi shi")) //开头的10不读做“一十”而读作“十”
			s = s.replace("yi shi", "shi");
		if(s.endsWith("  wan ")) //避免出现1，0000，0000被读成“yi yi  wan ”;
		    s = s.replace("  wan ", "");
		return s;
	}
	
	static String finalRead(String[] s) {//把一串数字读出来
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
