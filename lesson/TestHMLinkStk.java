import w7_hw.HM;
import w7_hw.HMLinkStk;

public class TestHMLinkStk {

    static void test1() {
        System.out.println(" --- test1 --- ");

        HMLinkStk S = new HMLinkStk();

        S.push(new HM(1, 10));
        S.push(new HM(2, 20));
        S.push(new HM(3, 30));

        System.out.println(S);
        System.out.println(S.toRevString());

        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S.pop());

        System.out.println(S);
    }

    static void test2() {
        System.out.println(" --- test2 --- ");

        HMLinkStk S = new HMLinkStk();

        try {
            System.out.println(S.pop());
        }
        catch (Exception e) {
            System.out.println("stack underflow");
        }
    }

    static void test3() {
        System.out.println(" --- test3 --- ");

        HMLinkStk S = new HMLinkStk();

        S.push(new HM(1, 0));
        S.push(new HM(2, 0));
        S.push(new HM(3, 0));
        S.push(new HM(4, 0));

        System.out.println(S);

        while (!S.isEmpty()) {
            System.out.println(S.pop());
        }

        System.out.println(S);
    }

    static void test4() {
        System.out.println(" --- test4 --- ");

        HMLinkStk S = new HMLinkStk();

        for (int i = 0; i < 30; ++i) {
            S.push(new HM(1, i));
        }

        System.out.println(S);
        System.out.println(S.toRevString());

        S.clear();

        System.out.println(S);
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }
}

