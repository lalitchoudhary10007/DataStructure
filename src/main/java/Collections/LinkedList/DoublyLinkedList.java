package Collections.LinkedList;

import java.util.Iterator;

public class DoublyLinkedList<T> implements Iterable<T> {
    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;


    public int size() {
        return size;
    }

    public void clear() {
        Node<T> trav = head;
        while (trav != null) {
            Node<T> next = trav.next;
            trav.next = trav.prev = null;
            trav.data = null;
            trav = next;
        }
        head = tail = null;
        size = 0;
    }


    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(T element) {
        if (isEmpty()) {
            head = tail = new Node<>(element, null, null);
        } else {
            head.prev = new Node<>(element, null, head);
            head = head.prev;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) throw new RuntimeException("List is Empty");
        head = head.next;
        size--;
        if (isEmpty()) tail = null;
        else head.prev = null;
    }

    public void removeLast() {
        if (isEmpty()) throw new RuntimeException("List is Empty");
        tail = tail.prev;
        size--;
        if (isEmpty()) head = null;
        else tail.next = null;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index not found");
        }
        Node<T> trav;
        int i;
        if (index < size / 2) {
            for (i = 0, trav = head; i != index; i++) {
                trav = trav.next;
            }
        } else {
            for (i = size - 1, trav = tail; i != index; i--) {
                trav = trav.prev;
            }
        }
        remove(trav);
    }

    private void remove(Node<T> node) {
        // If the node to remove is somewhere either at the
        // head or the tail handle those independently
        if (node.prev == null) removeFirst();
        if (node.next == null) removeLast();
        // Make the pointers of adjacent nodes skip over 'node'
        node.next.prev = node.prev;
        node.prev.next = node.next;
        // Memory cleanup
        node.data = null;
        node = node.prev = node.next = null;
        --size;
    }

    public int indexOf(Object obj) {
        int index = 0;
        Node<T> trav = head;
        if (obj == null) {
            for (index = 0; trav != null; trav = trav.next, index++) {
                if (trav.data == null) {
                    return index;
                }
            }
        } else {
            for (index = 0; trav != null; trav = trav.next, index++) {
                if (trav.data.equals(obj)) {
                    return index;
                }
            }
        }
        return -1;
    }

    public void addLast(T element) {
        if (isEmpty()) {
            head = tail = new Node<>(element, null, null);
        } else {
            tail.next = new Node<>(element, tail, null);
            tail = tail.next;
        }
        size++;
    }

    public T peekFirst() {
        if (isEmpty()) throw new RuntimeException("List is empty");
        return head.data;
    }

    public T peekLast() {
        if (isEmpty()) throw new RuntimeException("List is empty");
        return tail.data;
    }

    private static class Node<T> {
        private T data;
        private Node<T> prev, next;

        public Node(T data, Node<T> prev, Node<T> next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", prev=" + prev +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> trev = head;
            @Override
            public boolean hasNext() {
                return trev != null;
            }

            @Override
            public T next() {
                T data = trev.data;
                trev = trev.next;
                return data;
            }
        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> trav = head;
        while (trav != null) {
            sb.append(trav.data).append(",");
            trav = trav.next;
        }
        sb.append("]");
        return sb.toString();
    }
}
