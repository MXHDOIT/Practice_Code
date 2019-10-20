class Student {
    String name;
    int age;
    String address;

    public void stydy() {
        System.out.println("我要学习");
    }
    public void eat() {
        System.out.println("我要吃饭");
    }
    public void sleep() {
        System.out.println("我要睡觉");
    }
}

public class StudentDemo1 {
    public static void main(String[] args){
        Student s1 = new Student();

        s1.eat();
        s1.stydy();
        s1.sleep();
    }
}
