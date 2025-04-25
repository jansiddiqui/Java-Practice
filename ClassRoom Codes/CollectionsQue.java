import java.util.Queue;

public class CollectionsQue {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println("Queue: " + queue);
        System.out.println("Size of queue: " + queue.size());
    }
}
