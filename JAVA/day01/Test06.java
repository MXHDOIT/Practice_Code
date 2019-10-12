//根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
public class Test06{
	public static void main(String[] argc){
		int age = 57;
		if(age<18) {
			System.out.println("Young");
		}else if(age < 28) {
			System.out.println("adult");
		}else {
			System.out.println("old");
		}
	}
}