public class TestHM {
    public static void main(String[] args) {
        HM a = new HM(2, 40);
        HM b = new HM(1, 30);

        System.out.println("a = ");
        a.print();

        System.out.println("b = ");
        b.print();

        HM c = a.add(b);
        System.out.println("a + b = ");
        c.print();

        HM d = a.sub(b);
        System.out.println("a - b = ");
        d.print();

        a.addBy(b);
        System.out.println("a addBy b = ");
        a.print();

        a.subBy(b);
        System.out.println("a subBy b = ");
        a.print();

        System.out.println("a eq b ? " + a.eq(b));
    }
}