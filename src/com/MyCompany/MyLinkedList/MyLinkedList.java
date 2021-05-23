import java.lang.reflect.Array;
import java.util.*;

public class MyLinkedList <E> implements ILinkedList<E> {
    private int size;
    private Node<E> first;
    private Node<E> last;

    public MyLinkedList() {
        size = 0;
    }



    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(E element, Node<E> prev, Node<E> next) {
            this.item = element;
            this.prev = prev;
            this.next = next;
        }
    }
    Node<E> node(int index) {
        if(index < size) {
            Node<E> current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } else throw new IndexOutOfBoundsException();
    }

    @Override
    public void add(E element) {
        Node<E> l = last;
        Node<E> newNode = new Node<E>(element, l, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;

    }

    @Override
    public void add(int index, E element) {
        Node<E> newNode = new Node<E>(element, node(index).prev, node(index));
        node(index).prev = newNode;
        node(index - 1).next = newNode;
        size++;
    }

    @Override
    public void clear() {
Node<E> deleteCount = first;
while (deleteCount != null) {
    Node<E> next = deleteCount.next;
    deleteCount.next = null;
    deleteCount.item = null;
    deleteCount.prev = null;
    deleteCount = next;
}
        first = last = null;
        size = 0;
    }

    @Override
    public E get(int index) {
        return node(index).item;
    }

    @Override
    public int indexOf(E element) {
        int index = 0;
        for (int i = 0; i < size; i++) {
            if(element == node(index).item) {
                return index;
            }
            index++;
        }
        throw new NoSuchElementException();
    }

    @Override
    public E remove(int index) {
        Node<E> delElem = node(index);
        E element = delElem.item;
        Node<E> prev = delElem.prev;
        Node<E> next = delElem.next;
        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            delElem.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            delElem.next = null;
        }

        delElem.item = null;
        size--;
        return element;
    }

    @Override
    public E set(int index, E element) {
        Node<E> changeElement = node(index);
        E oldValue = changeElement.item;
        changeElement.item = element;
        return oldValue;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray() {
        E[] newArray ;
        E tmp = this.get(0);
        if (tmp == null) return (E[]) Array.newInstance(Object.class, 0);
        int index = 0;
        newArray = (E[]) Array.newInstance(tmp.getClass(), size);

        for (Node<E> x = first; x != null; x = x.next) {
            newArray[index] = x.item;
            index++;
        }

        return newArray;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator<>();
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    public class MyLinkedListIterator<E> implements Iterator<E> {


        private Node<E> lastReturned;
        private Node<E> next;
        private int nextIndex;


        MyLinkedListIterator() {
            if (size == 0) next = null;
            else {
                next = (Node<E>) node(nextIndex);
                nextIndex++;
            }
        }

        @Override
        public boolean hasNext() {
            return nextIndex <= size;
        }

        @Override
        public E next() {
            if (!hasNext()) throw new NoSuchElementException();
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }
    }
}
