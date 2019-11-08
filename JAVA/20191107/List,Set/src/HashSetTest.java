import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<Person> pSet = new HashSet<>();

        pSet.add(new Person("GOU",18));
        pSet.add(new Person("西施", 21));
        pSet.add(new Person("杨玉环", 20));
        pSet.add(new Person("貂蝉", 19));
        pSet.add(new Person("杨玉环", 20));
        pSet.add(new Person("貂蝉", 19));

        for(Person p:pSet){
            System.out.println(p);
        }
    }
}
