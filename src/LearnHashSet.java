import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnHashSet {

    public static void main(String[] args) {

         /* Set<Integer> set = new HashSet<>();
        Set<Integer> set = new LinkedHashSet<>();

        Set<Integer> set = new TreeSet<>();

        set.add(44);
        set.add(12);
        set.add(52);
        set.add(32);
        set.add(26);

        System.out.println(set);

        set.add(44);
        System.out.println(set);

        set.remove(44);
        System.out.println(set);

        System.out.println(set.contains(55));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);   */

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Ajay",3));
        studentSet.add(new Student("Vijay",1));
        studentSet.add(new Student("Jay",2));

        studentSet.add(new Student("Rohit",3));

        Student s1 = new Student("Rohit",3);
        Student s2 = new Student("Ajay",3);
        System.out.println(s1.equals(s2));
        System.out.println(studentSet);
    }
}
