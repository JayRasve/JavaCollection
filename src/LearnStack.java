import java.util.Stack;

public class LearnStack {

    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();

        animal.push("Horse");
        animal.push("Cat");
        animal.push("Dog");
        animal.push("Cow");

        System.out.println(animal);
        System.out.println(animal.peek());
        System.out.println(animal.pop() + " animal popped");
        System.out.println(animal);

    }
}
