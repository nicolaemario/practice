import java.util.Iterator;
import java.util.LinkedList;

public class PalindromeLinkedList {
    public static void main() {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(50);
        ll.add(50);
        ll.add(30);
        ll.add(20);
        ll.add(10);

        System.out.println(isPalindromeList(ll));

    }

    public static boolean isPalindromeList(LinkedList<Integer> list) {
        Iterator<Integer> itAscending = list.iterator();
        Iterator<Integer> itDescending = list.descendingIterator();

        int middle = list.size() / 2;

        for(int i = 0; i < middle; i++) {
            int ascendingNum = itAscending.next();
            int descendingNum = itDescending.next();

            if (ascendingNum != descendingNum) {
                return false;
            }
        }

        return true;
    }
}