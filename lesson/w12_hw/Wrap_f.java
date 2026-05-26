public class Wrap_f {
    public float v;

    public Wrap_f(float value) {
        this.v = value;
    }

    public Wrap_f() {
        this.v = 0.0f;
    }

    @Override
    public String toString() {
        return Float.toString(this.v);
    }
}
