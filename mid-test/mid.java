import java.util.LinkedList;
import java.util.ListIterator;

class P1T {
    public static void main(String[] args) {
        LinkedList<Integer> LL1 = new LinkedList<Integer>();

        for (int i = 10; i <= 18; i++) {
            LL1.add(i);
        }
        System.out.println(LL1);

        ListIterator<Integer> itr = LL1.listIterator();
        while (itr.hasNext()) {
            int x = itr.next();
            if (x % 2 == 0) {
                itr.remove();
            }
        }
        System.out.println(LL1);

        while (itr.hasPrevious()) {
            int x = itr.previous();
            if (x > 14) {
                itr.set(x - 10);
            } else {
                itr.set(x + 10);
            }
        }
        System.out.println(LL1);

        while (itr.hasNext()) {
            int x = itr.next();
            itr.add(x * 10);
        }
        System.out.println(LL1);
    }
}
