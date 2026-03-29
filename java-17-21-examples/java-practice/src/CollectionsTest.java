import java.util.List;
import java.util.ListIterator;

public class CollectionsTest {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
        System.out.println(list);
        System.out.println("First " + list.getFirst());
        System.out.println("Last " + list.getLast());
        ListIterator<Integer> iterator = list.listIterator();
        System.out.println("Next " + iterator.next());
        System.out.println("After the first next()...");
        System.out.println("Next index " + iterator.nextIndex());
        System.out.println("Previous " + iterator.previous());
        System.out.println("After the first previous()...");
        System.out.println("Previous index " + iterator.previousIndex());

        System.out.println(List.of().listIterator().next());
    }
}
