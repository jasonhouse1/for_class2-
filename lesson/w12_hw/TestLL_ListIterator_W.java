import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

class TestLL_ListIterator_W {

    static Wrap_f[] A1 = {
        new Wrap_f(5.0f),
        new Wrap_f(5.1f),
        new Wrap_f(5.2f),
        new Wrap_f(5.3f),
        new Wrap_f(5.4f)
    };

    static void test_2way() {
        System.out.println("\n --- test_2way() --- ");

        LinkedList<Wrap_f> L1 = new LinkedList<Wrap_f>(List.of(A1));

        ListIterator<Wrap_f> i1 = L1.listIterator(0);
        while (i1.hasNext()) {
            Wrap_f elm = i1.next();
            System.out.print(" (" + elm + ") ");
        }
        System.out.println();

        ListIterator<Wrap_f> i2 = L1.listIterator(L1.size());
        while (i2.hasPrevious()) {
            Wrap_f elm = i2.previous();
            System.out.print(" (" + elm + ") ");
        }
        System.out.println();
    }

    static void test_set() {
        System.out.println("\n --- test_set() --- ");

        LinkedList<Wrap_f> L1 = new LinkedList<Wrap_f>(List.of(A1));
        System.out.println("L1: " + L1);

        ListIterator<Wrap_f> i1 = L1.listIterator();
        while (i1.hasNext()) {
            Wrap_f elm = i1.next();
            i1.set(new Wrap_f(elm.v + 1.0f));
        }
        System.out.println("L1: " + L1);

        while (i1.hasPrevious()) {
            Wrap_f elm = i1.previous();
            i1.set(new Wrap_f(elm.v + 1.0f));
        }
        System.out.println("L1: " + L1);
    }

    static void test_add() {
        System.out.println("\n --- test_add() --- ");

        LinkedList<Wrap_f> L1 = new LinkedList<Wrap_f>(List.of(A1));
        System.out.println(L1);

        ListIterator<Wrap_f> i1 = L1.listIterator();

        i1.next();
        i1.add(new Wrap_f(90.0f));

        System.out.println("after i1.add(new Wrap_f(90.0f)), L1: " + L1);
        System.out.println("i1.previous(): " + i1.previous());
        System.out.println("i1.next(): " + i1.next());
    }

    static void test_remove() {
        System.out.println("\n --- test_remove() --- ");

        LinkedList<Wrap_f> L1 = new LinkedList<Wrap_f>(List.of(A1));
        ListIterator<Wrap_f> i1 = L1.listIterator();

        System.out.println(L1);

        System.out.println("next(): " + i1.next());
        System.out.println("next(): " + i1.next());

        i1.remove();
        System.out.println(L1);

        System.out.println("next(): " + i1.next());

        i1.remove();
        System.out.println(L1);

        System.out.println("previous(): " + i1.previous());

        i1.remove();
        System.out.println(L1);
    }

    static void test_crash() {
        System.out.println("\n --- test_crash ---");

        LinkedList<Wrap_f> L = new LinkedList<Wrap_f>(
            List.of(
                new Wrap_f(7.1f),
                new Wrap_f(7.2f),
                new Wrap_f(7.3f)
            )
        );

        System.out.println("L: " + L);

        ListIterator<Wrap_f> itr1;
        ListIterator<Wrap_f> itr2;

        itr1 = L.listIterator();
        System.out.println("itr1: " + itr1);

        L.add(new Wrap_f(99.0f));
        System.out.println("after L.add(new Wrap_f(99.0f)), L: " + L);

        itr1.hasNext();

        try {
            itr1.next();
        }
        catch (java.util.ConcurrentModificationException xpt) {
            System.out.println("catch: ConcurrentModificationException on itr1.next()");
        }

        System.out.println("---");

        itr1 = L.listIterator();
        System.out.println("itr1: " + itr1);

        itr2 = L.listIterator();
        System.out.println("itr2: " + itr2);

        System.out.println("itr1 across: " + itr1.next());
        System.out.println("itr2 across: " + itr2.next());

        itr2.remove();
        System.out.println("after itr2.remove(), L: " + L);

        try {
            itr1.next();
        }
        catch (java.util.ConcurrentModificationException xpt) {
            System.out.println("catch: ConcurrentModificationException on itr1.next()");
        }

        System.out.println("itr2 across: " + itr2.next());

        itr2.add(new Wrap_f(30.0f));
        System.out.println("after itr2.add(new Wrap_f(30.0f)), L: " + L);

        try {
            itr2.set(new Wrap_f(70.0f));
        }
        catch (java.lang.IllegalStateException xpt) {
            System.out.println("catch IllegalStateException");
        }

        System.out.println("itr2 across: " + itr2.next());

        itr2.set(new Wrap_f(70.0f));
        System.out.println("after itr2.set(new Wrap_f(70.0f)), L: " + L);
    }

    public static void main(String[] dummy) {
        test_2way();
        test_set();
        test_add();
        test_remove();
        test_crash();

        System.out.println(" all OK ");
    }
}
