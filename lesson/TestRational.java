public class TestRational {
    public static void main(String[] args) {
        Rational a = new Rational(1, 2);
        Rational b = new Rational(1, 3);

        System.out.println("a = ");
        a.print();

        System.out.println("b = ");
        b.print();

        Rational c = a.add(b);
        System.out.println("a + b = ");
        c.print();

        a.addBy(b);
        System.out.println("a addBy b = ");
        a.print();

        System.out.println("a eq b ? " + a.eq(b));
    }
}