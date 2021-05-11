package performance;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class MapPerformance<K, V> {

    static int size = 100000;

    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Map<String, String> treeMap = new TreeMap<>();

        System.out.println("Скорость HashMap");
        testMapPerformance(hashMap);
        System.out.println();

        System.out.println("Скорость LinkedHashMap");
        testMapPerformance(linkedHashMap);
        System.out.println();

        System.out.println("Скорость TreeMap");
        testMapPerformance(treeMap);

    }

    private static void testMapPerformance(Map map){
        MapPerformance<String,String> test = new MapPerformance<>();
        test.initializeStringRandomMap(map,size);
        System.out.println("Время добавления: " + test.timeOfAdd(map,"476","3202"));
        System.out.println("Время проверки на наличие ключа: " + test.timeOfCheck(map, "333"));
        System.out.println("Время удаления: " + test.timeOfRemove(map,"476"));

    }

    private void initializeStringRandomMap(Map<K, V> collection, int size) {
        for (int i = 0; i < size; i++) {
            K key = (K) new String("" + (int) Math.random() * size);
            V value = (V) new String("" + (int) Math.random() * size);
            collection.put(key,value);
        }
    }

    private long timeOfRemove(Map<K, V> collection, K key) {
        long start = System.nanoTime();
        collection.remove(key);
        long estimated = System.nanoTime() - start;
        return estimated;
    }

    private long timeOfCheck(Map<K, V> collection, K key) {
        long start = System.nanoTime();
        collection.containsKey(key);
        long estimated = System.nanoTime() - start;
        return estimated;
    }

    private long timeOfAdd(Map<K, V> collection, K key, V value) {
        long start = System.nanoTime();
        collection.put(key,value);
        long estimated = System.nanoTime() - start;
        return estimated;
    }

}