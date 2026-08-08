import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(8);
        list.remove(2);
        list.add(1,17);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.size());





        /*
        System.out.println("Print to the total number off the ArrayList");
        for (int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        for (int  x:list)
        {
            System.out.println(x);
        }

        System.out.println(list.contains(15));
        System.out.println(list.contains(20));

         */

    }

}
