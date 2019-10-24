
class Worker{
    private int id;
    private String name;
    private int age;

    public Worker(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void show() {
        System.out.println("id = "+id+" name = "+name+" age = "+age);
    }
}

public class WorkerTest {
    public static void main(String[] args) {
        Worker w = new Worker(1,"mahang",18);
        w.show();
    }
}
