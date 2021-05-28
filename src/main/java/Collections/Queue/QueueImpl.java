package Collections.Queue;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueImpl<T> implements Iterable<T> {

    private LinkedList<T> list = new LinkedList<>();

    public QueueImpl() {}

    public QueueImpl(T item){
        list.addLast(item);
    }

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void offer(T elem) {
        list.addLast(elem);
    }

    public T peek() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
        return list.peekFirst();
    }

    public T poll() {
        if (isEmpty()) throw new RuntimeException("Queue Empty");
        return list.removeFirst();
    }

    @Override
    public Iterator<T> iterator() {
        return list.iterator();
    }

    @Override
    public String toString() {
        return "Queue= " + list ;
    }
}
