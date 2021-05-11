import java.util.LinkedList;
import java.util.List;

public class MyLinkedListAndLinkedList {
    public static void main(String[] args) {
        ILinkedList<Integer> myList = new MyLinkedList<>();

        List<Integer> javaList = new LinkedList<>();

        for (int i = 0; i <= 100000; i++) {
            myList.add(i);
            javaList.add(i);
        }

        Integer num;
        long start = System.nanoTime();
        num = myList.get(50000);
        long estimated = System.nanoTime() - start;
        System.out.println("Время доступа к элементу в MyLinkedList: " + estimated);

        Integer num2;
        start = System.nanoTime();
        num2 = javaList.get(50000);
        estimated = System.nanoTime() - start;
        System.out.println("Время доступа к элементу в LinkedList: " + estimated);


        start = System.nanoTime();
        myList.indexOf(num);
        estimated = System.nanoTime() - start;
        System.out.println("Время линейного поиска элемента в MyLinkedList: " + estimated);

        start = System.nanoTime();
        javaList.indexOf(num2);
        estimated = System.nanoTime() - start;
        System.out.println("Время линейного поиска элемента в LinkedList: " + estimated);


        start = System.nanoTime();
        myList.add(314159);
        estimated = System.nanoTime() - start;
        System.out.println("Время добавления элемента в MyLinkedList: " + estimated);

        start = System.nanoTime();
        javaList.add(314159);
        estimated = System.nanoTime() - start;
        System.out.println("Время добавления элемента в LinkedList: " + estimated);


        start = System.nanoTime();
        myList.remove(100000);
        estimated = System.nanoTime() - start;
        System.out.println("Время удаления элемента в MyLinkedList: " + estimated);

        start = System.nanoTime();
        ((LinkedList<Integer>) javaList).removeLast();
        estimated = System.nanoTime() - start;
        System.out.println("Время удаления элемента в LinkedList: " + estimated);
    }
}
