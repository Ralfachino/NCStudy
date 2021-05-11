
public class Main {
    public static void main(String[] args) {
        ILinkedList<String> myList = new MyLinkedList<>();

        myList.add("Hello");
        myList.add("Gleb");
        myList.add("How");
        myList.add("Are");
        myList.add("You");
        myList.add("Today");
        System.out.println(myList);

        myList.remove(5);
        myList.remove(0);
        System.out.println(myList);

        myList.add(1, "Hello");
        System.out.println(myList);

        System.out.println(myList.get(3));

        System.out.println(myList.indexOf("Hello"));

        System.out.println(myList.remove(3));

        myList.clear();
        System.out.println(myList);



    }
}
