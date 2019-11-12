import java.util.Arrays;
import java.util.Comparator;

public class DemoPerson {
    public static void main(String[] args) {
        Person[] arr={
                new Person("LL",90),
                new Person("dd",19)
        };

//        Arrays.sort(arr, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
//
        Arrays.sort(arr,(Person o1,Person o2)->{
            return o1.getAge()-o2.getAge();
        });

        for(Person x:arr){
            System.out.println(x);
        }
    }
}
