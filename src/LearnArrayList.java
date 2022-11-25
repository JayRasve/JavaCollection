import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

        List<String> studentName = new ArrayList<>();

        studentName.add("Rakesh");
        studentName.add("Ramesh");

        System.out.println(studentName);

        studentName.add(1,"Ajay");

        System.out.println(studentName);
        System.out.println(studentName.get(1));

        ArrayList<String> newName = new ArrayList<>();
        newName.add("Amol");
        newName.add("Pavan");
        System.out.println(newName);
        studentName.addAll(newName);
        System.out.println(studentName);

        studentName.remove(0);
        System.out.println(studentName);
        studentName.remove(String.valueOf("Pavan"));
        System.out.println(studentName);

        studentName.set(2,"Pavan");
        System.out.println(studentName);


        System.out.println(studentName.contains("Pavan"));

        for(int i = 0; i< studentName.size(); i++)
        {
            System.out.println("The student name is " + studentName.get(i));
        }
        for (String element:studentName){
            System.out.println("foreach student is " +element);
        }
        Iterator<String> it = studentName.iterator();
        while(it.hasNext()){

            System.out.println("iterator " +it.next());
        }





    }
}
