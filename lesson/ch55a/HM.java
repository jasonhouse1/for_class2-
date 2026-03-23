public class HM implements Comparable<HM> {
    int hour;
    int minute;

    HM() {
        hour = 0;
        minute = 0;
    }

    HM(int h, int m) {
        hour = h;
        minute = m;
    }

    void print() {
        System.out.println(hour + ":" + minute);
    }

    boolean equals(HM other) {
        if (this.hour == other.hour && this.minute == other.minute) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof HM) {
            return equals((HM) other);
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(HM other) {
        if (this.hour < other.hour) {
            return -1;
        } else if (this.hour > other.hour) {
            return 1;
        } else if (this.minute < other.minute) {
            return -1;
        } else if (this.minute > other.minute) {
            return 1;
        } else {
            return 0;
        }
    }
}
