package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue<String> queue= new LinkedList<String>();
        queue.offer("shoreful");
        queue.offer("Sharifa");
        queue.offer("marajul");
        queue.offer("hafsa");
        queue.offer("AAR");
        queue.offer("AAS");

        System.out.println(queue);


    }
}
