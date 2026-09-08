import java.util.ListIterator;
import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 1; i <= 50; i++) {
            l.add(i);
        }

        for (int num : l) {
            System.out.printf("%d -> ", num);
        }

        System.out.println("null");

        reverseList(l);

        for (int num : l) {
            System.out.printf("%d -> ", num);
        }

        System.out.println("null");
    }

    public static void reverseList(LinkedList<Integer> list) {
        ListIterator<Integer> ascendingIt = list.listIterator();
        ListIterator<Integer> descendingIt = list.listIterator(list.size());

        int mid = list.size() / 2;

        for (int i = 0; i < mid; i++) {
            int leftValue = ascendingIt.next();
            int rightValue = descendingIt.previous();
            ascendingIt.set(rightValue);
            descendingIt.set(leftValue);
        }
    }
}
