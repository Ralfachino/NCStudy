package performance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class ListPerformance<E> {

    static int testSize = 100000;


    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        System.out.println("Скорость ArrayList");
        testListPerformance(arrayList);
        System.out.println();

        System.out.println("Скорость LinkedList");
        testListPerformance(linkedList);

    }




    private static void testListPerformance(List list){
        ListPerformance<String> test = new ListPerformance<>();
        test.initializeStringRandomList(list,testSize);

        System.out.println("Время добавления: " + test.timeOfAdd(list, "34"));
        System.out.println("Время вставки: " + test.timeOfInsert(list, 3, "25"));
        System.out.println("Время удаления: " + test.timeOfRemove(list));
    }


    private long timeOfAdd(List<E> collection, E element) {
        long start = System.nanoTime();
        collection.add(element);
        long estimated = System.nanoTime() - start;
        return estimated;
    }


    private long timeOfRemove(List<E> collection) {
        long start = System.nanoTime();
        collection.remove(collection.size()-1);
        long estimated = System.nanoTime() - start;
        return estimated;
    }

    private long timeOfInsert(List<E> collection, int index, E element) {
        long start = System.nanoTime();
        collection.add(index, element);
        long estimated = System.nanoTime() - start;
        return estimated;
    }

    private void initializeStringRandomList(List<E> collection, int size) {
        for (int i = 0; i < size; i++) {
            E element = (E) new String("" + (int) Math.random() * size);
            collection.add(element);
        }
    }



}
