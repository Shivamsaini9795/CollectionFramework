import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public abstract class Comparators<S> {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(8);
        list.sort(new MyComparator());
        System.out.println(list);

        List<String> words = Arrays.asList("Bananas" , "Apples" , "Mango");
        words.sort(new StringLengthComparator());
        System.out.println(words);
    }

    public abstract int  compare(String s1, String s2);
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int  compare(String s1 , String s2)
    {
            return s1.length()-s2.length();
    }

}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;
    }
}
