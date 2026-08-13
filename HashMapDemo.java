import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Shivam");
        map.put(2,"Roshan");
        map.put(3,"Raj");
        map.put(4,"Aman");
        map.put(5,"Ankur");
        System.out.println(map);
        System.out.println(map.get(3));
        String s = map.get(50);
        System.out.println(s);

        boolean b = map.containsKey(5);
        System.out.println(b);

        boolean b1 = map.containsValue("Shivam");
        System.out.println(b1);

        Set<Integer> keys = map.keySet();
        for(int i:keys)
        {
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry: entries)
        {
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
