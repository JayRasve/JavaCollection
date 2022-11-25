import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

    public static void main(String[] args) {
      //  Map<String, Integer> numbers = new HashMap<>();
        Map<String, Integer> numbers = new TreeMap<>();


        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);

        // to avoid override value
        if(!numbers.containsKey("Two")){
            numbers.put("Two",5);
        }
        numbers.putIfAbsent("Two",5);
        System.out.println(numbers);

        for(Map.Entry<String, Integer> e: numbers.entrySet()){
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println(numbers.containsValue(2));
        System.out.println(numbers.isEmpty());
        numbers.remove("Three");
        System.out.println(numbers);
    }
}
