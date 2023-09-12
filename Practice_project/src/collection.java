import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class Collection {
    public static void main(String[] args) {
        // ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");

        System.out.println("ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("\nLinkedList:");
        for (int number : linkedList) {
            System.out.println(number);
        }

        // HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");

        System.out.println("\nHashSet:");
        for (String color : hashSet) {
            System.out.println(color);
        }

        // HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        System.out.println("\nHashMap:");
        Iterator<Integer> keys = hashMap.keySet().iterator();
        while (keys.hasNext()) {
            Integer key = keys.next();
            System.out.println(key + ": " + hashMap.get(key));
        }
    }
}
