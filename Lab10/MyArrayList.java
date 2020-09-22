import java.util.Random;

public class MyArrayList<E> {
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[])new Object[INITIAL_CAPACITY];
    private int size = 0;

    public boolean add(E e) {
        add(size, e);
        return true;
    }

    public void add (int index, E e) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity();
        for (int i = size-1; i >= index; i--) {
            data[i+1] = data[i]; 
        }
        data[index] = e;
        size++;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            E[] newData = (E[])new Object[size*2 + 1];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }
    
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    public int indexOf(Object e) {
        for (int i=0; i<size; i++) {
            if (e.equals(data[i])) {
                return i;
            }
        }
        return -1;
    }

    public E remove(int index) {
        checkIndex(index);
        E e = data[index];
        
        for (int i = index; i < size-1; i++) {
            data[i] = data[i + 1];
        }

        data[size-1] = null;

        size--;

        return e;
    }

    public boolean remove(E value) {
        int indexToRemove = indexOf(value);
        if (indexToRemove != -1) {
            remove(indexToRemove);
            return true;    
        }
        return false;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(data[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        return result.toString() + "]";
    }

    public boolean isEmpty() {
        return size==0;
    }

    public void clear() {
        E[] newData = (E[])new Object[INITIAL_CAPACITY];
        data = newData;
        size = 0;
    }

    public boolean contains(Object e) {
        int index = indexOf(e);
        if (index != -1) {
            return true;
        }
        return false;
    }

    public E set(int index, E e) {
        checkIndex(index);
        data[index] = e;
        return e;
    }
}