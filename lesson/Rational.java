public class Rational {
    int num;
    int den;

    Rational() {
        num = 0;
        den = 1;
    }

    Rational(int n, int d) {
        num = n;
        den = d;

        if (den == 0) {
            System.out.println("分母不能是 0");
            den = 1;
        }

        reduce();
    }

    void print() {
        System.out.println(num + "/" + den);
    }

    Rational add(Rational other) {
        Rational ans = new Rational();

        ans.num = this.num * other.den + this.den * other.num;
        ans.den = this.den * other.den;

        ans.reduce();
        return ans;
    }

    void addBy(Rational other) {
        this.num = this.num * other.den + this.den * other.num;
        this.den = this.den * other.den;

        reduce();
    }

    boolean eq(Rational other) {
        if (this.num == other.num && this.den == other.den) {
            return true;
        } else {
            return false;
        }
    }

    void reduce() {
        int g = gcd(num, den);
        num = num / g;
        den = den / g;

        if (den < 0) {
            num = -num;
            den = -den;
        }
    }

    int gcd(int a, int b) {
        if (a < 0) {
            a = -a;
        }

        if (b < 0) {
            b = -b;
        }

        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }

        return a;
    }
}