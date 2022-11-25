import java.util.ArrayDeque;

public class LearnArrayDequeue {


    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(12);
        adq.offer(25);
        System.out.println(adq);
        System.out.println(adq.peek());

        adq.offerFirst(10);
        System.out.println(adq);

        adq.offerLast(30);
        System.out.println(adq);

        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst());
        System.out.println(adq.pollLast());

    }
}
