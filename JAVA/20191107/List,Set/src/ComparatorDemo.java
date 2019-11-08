import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<Student> slist = new ArrayList<>();
        slist.add(new Student("rose",18));
        slist.add(new Student("jack",16));
        slist.add(new Student("abc",16));
        slist.add(new Student("ace",17));
        slist.add(new Student("mark",16));

//        Collections.sort(slist);
        Collections.sort(slist, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o2.getAge() - o1.getAge();

                if(result == 0){
                    result = o1.getName().charAt(0)-o2.getName().charAt(0);

                }
                return result;
            }
        });
        for(Student student:slist){
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }
}