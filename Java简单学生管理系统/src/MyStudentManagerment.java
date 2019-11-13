import java.util.Scanner;

import java.util.ArrayList;

public class MyStudentManagerment {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生信息
        ArrayList<Student> slist = new ArrayList<>();

        //循环回到主页面
        while(true){
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("***********  1 添加学生  **********");
            System.out.println("***********  2 删除学生  **********");
            System.out.println("***********  3 修改学生  **********");
            System.out.println("***********  4 查看学生  **********");
            System.out.println("***********  5 退出系统  **********");
            System.out.println("-----------------------------------");
            System.out.print("请输入你的选择:");

            Scanner in = new Scanner(System.in);
            int num = in.nextInt();

            switch (num){
                case 1:
                    addStudent(slist);
                    break;
                case 2:
                    removeStudent(slist);
                    break;
                case 3:
                    updateStudent(slist);
                    break;
                case 4:
                       findStudent(slist);
                    break;
                case 5:
                    System.out.println("感谢使用学生管理系统");
                    return ;
            }
        }
    }


    //用于判断学号是否存在
    public static boolean isUsed(ArrayList<Student> slist,String sid){

        for (int i = 0; i < slist.size(); i++) {
            Student s = slist.get(i);
            if(s.getId().equals(sid)){
                return true;
            }
        }

        return false;
    }


    //添加学生1
    public static void addStudent(ArrayList<Student> slist){
        Scanner in = new Scanner(System.in);

        String sid;

        while (true){
            System.out.println("请输入学生学号：");

            sid = in.nextLine();
            if(isUsed(slist,sid)){
                System.out.println("你输入学生已存在，请重新输入");
            }else{
                break;
            }
        }

        System.out.println("请输入学生姓名：");
        String name = in.nextLine();
        System.out.println("请输入学生居住地：");
        String address = in.nextLine();
        System.out.println("请输入学生年龄：");
        int age = in.nextInt();
        Student s = new Student();
        s.setId(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        slist.add(s);
        System.out.println("添加学生成功");
    }

    //删除学生
    public static void removeStudent(ArrayList<Student> slist){
        Scanner in = new Scanner(System.in);

        System.out.println("请输入你要删除的学号：");
        String sid = in.nextLine();

        for(int i = 0;i < slist.size();i++){
            Student num = slist.get(i);
            if(sid.equals(num.getId())){
                slist.remove(i);
                System.out.println("删除成功");
                return ;
            }
        }

        System.out.println("没有找到这个人");
    }


    //修改学生
    public static void updateStudent(ArrayList<Student> slist){
        Scanner in = new Scanner(System.in);

        System.out.println("请输入你要更改的学号：");
        String sid = in.nextLine();

        for(int i = 0;i < slist.size();i++){
            Student num = slist.get(i);
            if(sid.equals(num.getId())){
                System.out.println("输入新的姓名");
                num.setName(in.nextLine());
                System.out.println("输入新的地址");
                num.setAddress(in.nextLine());
                System.out.println("输入新的年龄");
                num.setAge(in.nextInt());
                System.out.println("更改成功");
                return ;
            }
        }

        System.out.println("没有找到这个人");
    }

    //查看学生
    public static void findStudent(ArrayList<Student> slist){
        if(slist.size() == 0){
            System.out.println("没有学生信息");
            return ;
        }

        for (int i = 0; i < slist.size(); i++) {
            Student s = slist.get(i);
            System.out.println(s.getId()+"="+s.getName()+"="+s.getAge()+"="+s.getAddress());
        }
    }
}
