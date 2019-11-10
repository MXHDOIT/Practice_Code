import java.util.Scanner;

public class Demo01RegisterException {
    /*
    * 1.使用数组保存已经注册过的用户名
    * 2.Scanner输入
    * 3.定义方法，对用户名进行判断
    *   遍历存储已经注册过用户名，获取名字
    *   使用获取到的用户名与输入的比较
    *       true：
    *           用户已经存在，抛出异常，
    *        false：
    *           继续遍历
    *       如果结束没有找到，提示用户“注册成功”
    * */
    static String[]  usernames = {"001","002","003"};
    public static void main(String[] args) throws RegisterException {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username = in.next();

        checkUsername(username);

    }
    public static void checkUsername(String username) throws RegisterException {
//        for(String name:usernames){
//            if(name.equals(username)){
//                throw new RegisterException("亲，该用户名已经被注册");
//            }
//        }
//
//        System.out.println("gongxi");
        throw new RegisterException("新");
    }
}
