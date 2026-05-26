import java.util.Stack;
import java.util.EmptyStackException;

class TestJStack_Long {

    static void test1() {
        System.out.println(" --- test1: push, pop, empty, toString --- ");

        Stack<Long> S = new Stack<Long>();

        System.out.println(S.empty());
        System.out.println(S);

        S.push(100L);
        S.push(200L);
        S.push(300L);
        S.push(400L);

        System.out.println(S.empty());
        System.out.println(S);

        System.out.println(S.pop());
        System.out.println(S.pop());
        System.out.println(S);

        S.push(500L);
        System.out.println(S);
    }

    static void test2() {
        System.out.println(" --- test2: peek --- ");

        Stack<Long> S = new Stack<Long>();

        S.push(10L);
        S.push(20L);
        S.push(30L);

        System.out.println(S);

        System.out.println(S.peek());
        System.out.println(S);

        S.pop();

        System.out.println(S.peek());
        System.out.println(S);
    }

    static void test3() {
        System.out.println(" --- test3: search --- ");

        Stack<Long> S = new Stack<Long>();

        S.push(11L);
        S.push(22L);
        S.push(33L);
        S.push(44L);
        S.push(55L);

        System.out.println(S);

        System.out.println(S.search(55L));
        System.out.println(S.search(44L));
        System.out.println(S.search(33L));
        System.out.println(S.search(11L));
        System.out.println(S.search(99L));
    }

    static void test4() {
        System.out.println(" --- test4: EmptyStackException --- ");

        Stack<Long> S = new Stack<Long>();

        try {
            System.out.println(S.pop());
        }
        catch (EmptyStackException e) {
            System.out.println("pop from empty stack");
        }

        try {
            System.out.println(S.peek());
        }
        catch (EmptyStackException e) {
            System.out.println("peek from empty stack");
        }
    }

    static void test5() {
        System.out.println(" --- test5: methods inherited from Vector --- ");

        Stack<Long> S = new Stack<Long>();

        S.push(1000L);
        S.push(2000L);
        S.push(3000L);
        S.push(4000L);

        System.out.println(S);
        System.out.println(S.size());

        System.out.println(S.get(0));
        System.out.println(S.get(1));
        System.out.println(S.get(2));
        System.out.println(S.get(3));

        S.set(1, 2222L);
        System.out.println(S);

        Object[] A = S.toArray();

        for (int i = 0; i < A.length; ++i) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    static void test6() {
        System.out.println(" --- test6: clone --- ");

        Stack<Long> S1 = new Stack<Long>();

        S1.push(7L);
        S1.push(14L);
        S1.push(21L);

        @SuppressWarnings("unchecked")
        Stack<Long> S2 = (Stack<Long>)S1.clone();

        System.out.println(S1);
        System.out.println(S2);

        S1.pop();
        S1.push(999L);

        System.out.println(S1);
        System.out.println(S2);
    }

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }
}
