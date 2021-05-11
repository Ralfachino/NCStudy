package performance;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

class SetPerformance<E> {
    static int testSize = 100000;


    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        System.out.println("Скорость HashSet");
        testSetPerformance(hashSet);
        System.out.println();

        System.out.println("Скорость LinkedHashSet");
        testSetPerformance(linkedHashSet);
        System.out.println();

        System.out.println("Скорость TreeSet");
        testSetPerformance(treeSet);
    }

    private static void testSetPerformance(Set set){
        SetPerformance<String> test = new SetPerformance<>();
        test.initializeStringRandomSet(set,testSize);

        System.out.println("Время добавления: " + test.timeOfAdd(set, "5467"));
        System.out.println("Время проверки на наличие: " + test.timeOfCheck(set, "333"));
        System.out.println("Время удаления: " + test.timeOfRemove(set));
    }



    private void initializeStringRandomSet(Set<E> collection, int size) {
        for (int i = 0; i < size; i++) {
            E element = (E) new String("" + (int) Math.random() * size);
            collection.add(element);
        }
    }

    private long timeOfRemove(Set<E> collection) {
        long start = System.nanoTime();
        collection.remove("265");
        long estimated = System.nanoTime() - start;
        return estimated;
    }

    private long timeOfCheck(Set<E> collection, Object o) {
        long start = System.nanoTime();
        collection.contains(o);
        long estimated = System.nanoTime() - start;
        return estimated;
    }

    private long timeOfAdd(Set<E> collection, E element) {
        long start = System.nanoTime();
        collection.add(element);
        long estimated = System.nanoTime() - start;
        return estimated;
    }




}
