package w7_hw;

public class HM {
    int hour;
    int min;

    public HM() {
        this.hour = 0;
        this.min = 0;
    }

    public HM(int h, int m) {
        this.hour = h;
        this.min = m;
        this.adjust();
    }

    public HM(HM p) {
        this.hour = p.hour;
        this.min = p.min;
    }

    private void adjust() {
        this.hour += this.min / 60;
        this.min = this.min % 60;

        if (this.min < 0) {
            this.min += 60;
            this.hour -= 1;
        }
    }

    public void setBy(HM p) {
        this.hour = p.hour;
        this.min = p.min;
    }

    public void addBy(HM p) {
        this.hour += p.hour;
        this.min += p.min;
        this.adjust();
    }

    public void inc(int m) {
        this.min += m;
        this.adjust();
    }

    public void p() {
        System.out.print(this.toString());
    }

    public void pn() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return this.hour + ":" + this.min;
    }
}

