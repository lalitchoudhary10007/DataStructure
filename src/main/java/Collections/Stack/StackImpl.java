package Collections.Stack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.LinkedList;

public class StackImpl<T> implements Iterable<T> {

    private LinkedList<T> linkedList = new LinkedList<>();

    public StackImpl() {
    }

    public StackImpl(T item) {
        push(item);
    }

    public int size() {
        return linkedList.size();
    }

    public void push(T item) {
        linkedList.addLast(item);
    }

    public T pop() {
        if (linkedList.isEmpty()) throw new EmptyStackException();
        return linkedList.removeLast();
    }

    public T peek() {
        if (linkedList.isEmpty()) throw new EmptyStackException();
        return linkedList.peekLast();
    }

    @Override
    public Iterator<T> iterator() {
        return linkedList.iterator();
    }

    @Override
    public String toString() {
        return "StackImpl=" + linkedList;
    }
}
