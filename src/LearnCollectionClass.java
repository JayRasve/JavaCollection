import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClass {

    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();

      /*  List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(9);
        list.add(15);
        list.add(84);
        list.add(51);
        list.add(76);

        System.out.println(" min element is "+ Collections.min(list));
        System.out.println(" max element is "+ Collections.max(list));
        System.out.println(" frequency of  element is "+ Collections.frequency(list,84));

       // Collections.sort(list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list); */

        student.add(new Student("Ajay",3));
        student.add(new Student("Vijay",1));
        student.add(new Student("Jay",2));
        student.add(new Student("Rohit",5));

        Student s1 = new Student("Rohit",5);
        Student s2 = new Student("Ajay",3);

        System.out.println(student);

       /* Collections.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        }); */

        Collections.sort(student, (o1, o2) -> o1.name.compareTo(o2.name));

        System.out.println(student);

       // System.out.println(s1.compareTo(s2));
    }
}
