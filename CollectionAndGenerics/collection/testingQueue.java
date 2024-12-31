package CollectionAndGenerics.collection;

import java.util.LinkedList;
import java.util.Queue;

public class testingQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.offer(2);

   Utility.print(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());

    }
}
