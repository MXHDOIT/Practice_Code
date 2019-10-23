import java.awt.*;

class Person{
    String name;
    int age;
    public Person(){

    }
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "age = "+this.age+";name = "+this.name;
    }
}

public class Best {
    public static void main(String[] args) {
        Person p = new Person("maxinhang",18);
        System.out.println(p);
    }
}
