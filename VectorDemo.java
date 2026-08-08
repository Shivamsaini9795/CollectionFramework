import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(5,1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        vector.add(1);
        System.out.println("Vector Capacity is "+vector.capacity());

        Vector<Integer> vector1 = new Vector<>(Arrays.asList(2,3,4));
        System.out.println(vector1);
    }
}
