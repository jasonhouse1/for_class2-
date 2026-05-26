import java.util.ArrayList;
import java.util.List;

public class TestArrayList_Rational {

    static void test1() {
        System.out.println(" --- test1: empty ArrayList and add --- ");

        ArrayList<Rational> AL = new ArrayList<Rational>();

        System.out.println(AL);

        AL.add(new Rational(1, 2));
        AL.add(new Rational(2, 3));
        AL.add(new Rational(3, 4));

        System.out.println(AL);
    }

    static void test2() {
        System.out.println(" --- test2: ArrayList from List.of --- ");

        Rational p1 = new Rational(1, 2);
        Rational p2 = new Rational(2, 3);
        Rational p3 = new Rational(3, 4);

        ArrayList<Rational> AL = new ArrayList<Rational>(List.of(p1, p2, p3));

        System.out.println(AL);
    }

    static void test3() {
        System.out.println(" --- test3: copy pointers of Rational objects --- ");

        Rational p1 = new Rational(1, 2);
        Rational p2 = new Rational(2, 3);
        Rational p3 = new Rational(3, 4);

        ArrayList<Rational> AL1 = new ArrayList<Rational>();
        AL1.add(p1);
        AL1.add(p2);
        AL1.add(p3);

        ArrayList<Rational> AL2 = new ArrayList<Rational>(AL1);

        System.out.println(AL1);
        System.out.println(AL2);

        p2.setBy(new Rational(100, 1));

        System.out.println(AL1);
        System.out.println(AL2);

        AL1.get(0).addBy(new Rational(1, 2));

        System.out.println(AL1);
        System.out.println(AL2);

        AL2.set(2, new Rational(500, 1));

        System.out.println(AL1);
        System.out.println(AL2);
    }

    static void test4() {
        System.out.println(" --- test4: independent Rational objects --- ");

        Rational p1 = new Rational(1, 2);
        Rational p2 = new Rational(2, 3);
        Rational p3 = new Rational(3, 4);

        ArrayList<Rational> AL1 = new ArrayList<Rational>();
        AL1.add(p1);
        AL1.add(p2);
        AL1.add(p3);

        ArrayList<Rational> AL2 = new ArrayList<Rational>();
        for (int i = 0; i < AL1.size(); ++i) {
            AL2.add(new Rational(AL1.get(i)));
        }

        System.out.println(AL1);
        System.out.println(AL2);

        AL1.get(1).setBy(new Rational(100, 1));

        System.out.println(AL1);
        System.out.println(AL2);
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
}
