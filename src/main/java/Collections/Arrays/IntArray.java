package Collections.Arrays;

import java.util.Arrays;
import java.util.Iterator;

public class IntArray implements Iterable<Integer> {

    private static final int DEFAULT_CAP = 16;

    public int[] arr;
    public int len = 0;
    private int capacity;

    //create an array with default capacity
    public IntArray() {
        this(DEFAULT_CAP);
    }

    //create an array with capacity
    public IntArray(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        this.capacity = capacity;
        arr = new int[capacity];
    }

    //Return the size of array
    public int size() {
        return len;
    }

    //Return array is empty or not
    public boolean isEmpty() {
        return len == 0;
    }

    //Return value of index
    public int get(int index) {
        if (index >= len) throw new NullPointerException("Illegal Index: " + index);
        return arr[index];
    }

    //set a value on index
    public void set(int index, int element) {
        arr[index] = element;
    }

    //add a element to this array
    public void add(int element) {
        if (len + 1 >= capacity) {
            capacity *= 2;
            arr = Arrays.copyOf(arr, capacity);
        }
        arr[len++] = element;
        System.out.println("Array Capacity:- " + capacity);
    }

    //Remove element by index
    public void removeAt(int index) {
        System.arraycopy(arr, index + 1, arr, index, len - index - 1);
        --len;
        --capacity;
    }

    //Remove element from index
    public boolean remove(int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    //reverse the contents of this array
    public String reverse() {
        for (int i = 0; i < len / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[len - i - 1];
            arr[len - i - 1] = tmp;
        }
        return this.toString();
    }

    @Override
    public String toString() {
        if (len == 0)
            return "[]";
        else {
            StringBuilder sb = new StringBuilder(len).append("[");
            for (int i = 0; i < len; i++) {
                sb.append(arr[i]).append(", ");
            }
            return sb.append("]").toString();
        }
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < len;
            }

            @Override
            public Integer next() {
                return arr[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
