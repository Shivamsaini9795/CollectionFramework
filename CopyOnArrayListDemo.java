import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Initial number list "+list);
        for (Integer number :list)
        {
            System.out.println(number);
            //try to modify list while reading
            if (number.equals(3))
            {
                list.add(33);
                System.out.println("Added number while reading");
            }

        }
        System.out.println("Updated number list "+list);

    }
}
