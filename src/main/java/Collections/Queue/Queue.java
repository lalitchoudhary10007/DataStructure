package Collections.Queue;

public class Queue {

    public static void main(String[] args) {

        QueueImpl<Integer> queue = new QueueImpl(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
    }

}
