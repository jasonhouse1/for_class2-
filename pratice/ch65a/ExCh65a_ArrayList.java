import java.util.ArrayList;

class Rational {
    long a;
    long b;

    Rational(long a, long b) {
        this.a = a;
        this.b = b;
        this.reduce();
    }

    Rational(Rational p) {
        this.a = p.a;
        this.b = p.b;
    }

    static long gcd(long x, long y) {
        if (x < 0) {
            x = -x;
        }

        if (y < 0) {
            y = -y;
        }

        while (y != 0) {
            long r = x % y;
            x = y;
            y = r;
        }

        return x;
    }

    void reduce() {
        if (this.b < 0) {
            this.a = -this.a;
            this.b = -this.b;
        }

        long g = gcd(this.a, this.b);

        if (g != 0) {
            this.a /= g;
            this.b /= g;
        }
    }

    void setBy(Rational p) {
        this.a = p.a;
        this.b = p.b;
    }

    @Override
    public String toString() {
        return this.a + "/" + this.b;
    }
}

public class ExCh65a_ArrayList {
    public static void main(String[] args) {
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

        AL2.set(0, new Rational(9, 10));

        System.out.println(AL1);
        System.out.println(AL2);
    }
}

/*
重點:
1. ArrayList<Rational> 裡面存的是 Rational 物件的指標。
2. new ArrayList<Rational>(AL1) 會建立新的 ArrayList。
3. 但是裡面的 Rational 物件沒有被複製，仍然是共用物件。
4. p2.setBy(new Rational(100, 1)) 會讓 AL1 和 AL2 中同一個 p2 都變成 100/1。
5. AL2.set(0, new Rational(9, 10)) 是把 AL2 的第 0 格換成新物件，不會改到 AL1 的第 0 格。

預期輸出:
[1/2, 2/3, 3/4]
[1/2, 2/3, 3/4]
[1/2, 100/1, 3/4]
[1/2, 100/1, 3/4]
[1/2, 100/1, 3/4]
[9/10, 100/1, 3/4]
*/
