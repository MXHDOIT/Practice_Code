import java.util.ArrayList;

class Student{
    private String name;
    private  int age;

    public Student(){

    }

    public Student(String name,int age){
        this.age= age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Test02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student>  list = new ArrayList<>();

        Student s1 = new Student("MAXINHANG",18);
        Student s2 = new Student("likuan",20);
        Student s3 = new Student("fancheng",20);
        Student s4 = new Student("jinpeng",20);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

//        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"=="+list.get(i).getAge());
        }
    }
}
