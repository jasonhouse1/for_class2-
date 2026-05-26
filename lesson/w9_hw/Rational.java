public class Rational {
    long a;
    long b;

    public Rational() {
        this.a = 0;
        this.b = 1;
    }

    public Rational(long a) {
        this.a = a;
        this.b = 1;
    }

    public Rational(long a, long b) {
        if (b == 0) {
            throw new IllegalArgumentException("denominator is zero");
        }

        this.a = a;
        this.b = b;
        this.reduce();
    }

    public Rational(Rational p) {
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

    public void setBy(Rational p) {
        this.a = p.a;
        this.b = p.b;
    }

    public void addBy(Rational p) {
        long na = this.a * p.b + p.a * this.b;
        long nb = this.b * p.b;

        this.a = na;
        this.b = nb;
        this.reduce();
    }

    public void mulBy(Rational p) {
        this.a *= p.a;
        this.b *= p.b;
        this.reduce();
    }

    @Override
    public String toString() {
        return this.a + "/" + this.b;
    }
}
