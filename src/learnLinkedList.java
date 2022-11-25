import java.util.LinkedList;
import java.util.Queue;

public class learnLinkedList {


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(10);  //add() exception
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue);

        System.out.println(queue.poll()); // remove() exception
        System.out.println(queue.peek()); // element() exception
        System.out.println(queue);
    }
}
