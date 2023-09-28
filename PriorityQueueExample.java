import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.offer("Киев");
        queue1.offer("Харьков");
        queue1.offer("Львов");
        queue1.offer("Кременчуг");
        queue1.offer("Полтава");
        System.out.print("Priority queue с Comparable: ");
        while (queue1.size() > 0) {
            System.out.print(queue1.remove() + " ");
        }
        System.out.println();

        PriorityQueue<String> queue2 = new PriorityQueue<>(5, Collections.reverseOrder());
        queue2.offer("Киев");
        queue2.offer("Харьков");
        queue2.offer("Львов");
        queue2.offer("Кременчуг");
        queue2.offer("Полтава");
        queue2.offer("Ямбург");
        System.out.print("Priority queue с Comparator: ");
        while (queue2.size() > 0) {
            System.out.print(queue2.remove() + " ");
        }

        Queue<Integer> queue3 = new PriorityQueue<>();
        queue3.offer(10);
        queue3.offer(20);
        queue3.offer(3);
        queue3.offer(15);
        queue3.offer(6);
        System.out.print("Priority queue с Comparable: ");
        while (queue3.size() > 0) {
            System.out.print(queue3.remove() + " ");
        }
        System.out.println();

        
    }
}