import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements into the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println("Queue elements: " + queue);

        // Dequeue and display elements from the queue
        int dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);
        System.out.println("Queue elements after dequeue: " + queue);

        // Enqueue more elements
        queue.add(8);
        queue.add(9);

        System.out.println("Queue elements after enqueue: " + queue);
    }
}
