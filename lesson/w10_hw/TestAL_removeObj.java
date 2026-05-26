import java.util.ArrayList;

public class TestAL_removeObj {

    static void removeAllObj(ArrayList<String> L, String obj) {
        while (L.remove(obj)) {
        }
    }

    static void test1() {
        System.out.println(" --- test1: remove(Object obj) --- ");

        ArrayList<String> L = new ArrayList<String>();

        L.add("cat");
        L.add("dog");
        L.add("cat");
        L.add("bird");
        L.add("cat");
        L.add("fish");

        System.out.println(L);

        System.out.println(L.remove("cat"));

        System.out.println(L);
    }

    static void test2() {
        System.out.println(" --- test2: remove every equal object --- ");

        ArrayList<String> L = new ArrayList<String>();

        L.add("cat");
        L.add("dog");
        L.add("cat");
        L.add("bird");
        L.add("cat");
        L.add("fish");

        System.out.println(L);

        removeAllObj(L, "cat");

        System.out.println(L);
    }

    static void test3() {
        System.out.println(" --- test3: remove object not in list --- ");

        ArrayList<String> L = new ArrayList<String>();

        L.add("cat");
        L.add("dog");
        L.add("bird");

        System.out.println(L);

        removeAllObj(L, "mouse");

        System.out.println(L);
    }

    static void test4() {
        System.out.println(" --- test4: remove all elements --- ");

        ArrayList<String> L = new ArrayList<String>();

        L.add("cat");
        L.add("cat");
        L.add("cat");

        System.out.println(L);

        removeAllObj(L, "cat");

        System.out.println(L);
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
}
