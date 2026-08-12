import java.util.*;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap< Integer,String> sortedMap = new TreeMap<>((a,b)-> b - a);
        sortedMap.put(96,"Shivam");
        sortedMap.put(76,"Raj");
        sortedMap.put(68,"Aman");
//        sortedMap.put(80,"Roshan");
//        System.out.println(sortedMap);
//
//        System.out.println(sortedMap.firstKey());
//        System.out.println(sortedMap.lastKey());
//        System.out.println(sortedMap.headMap(80));
//        System.out.println(sortedMap.tailMap(80));

        NavigableMap<Integer, String> navigableMap =  new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(5, "Five");
        navigableMap.put(3, "Three");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.ceilingKey(3));
        System.out.println(navigableMap.higherEntry(1));
        System.out.println(navigableMap.descendingMap());


    }



}
