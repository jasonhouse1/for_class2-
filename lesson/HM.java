public class HM {
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

    HM add(HM other) {
        HM ans = new HM();
        ans.hour = this.hour + other.hour;
        ans.minute = this.minute + other.minute;

        if (ans.minute >= 60) {
            ans.hour = ans.hour + 1;
            ans.minute = ans.minute - 60;
        }

        return ans;
    }

    HM sub(HM other) {
        HM ans = new HM();
        ans.hour = this.hour - other.hour;
        ans.minute = this.minute - other.minute;

        if (ans.minute < 0) {
            ans.hour = ans.hour - 1;
            ans.minute = ans.minute + 60;
        }

        return ans;
    }

    void addBy(HM other) {
        this.hour = this.hour + other.hour;
        this.minute = this.minute + other.minute;

        if (this.minute >= 60) {
            this.hour = this.hour + 1;
            this.minute = this.minute - 60;
        }
    }

    void subBy(HM other) {
        this.hour = this.hour - other.hour;
        this.minute = this.minute - other.minute;

        if (this.minute < 0) {
            this.hour = this.hour - 1;
            this.minute = this.minute + 60;
        }
    }

    boolean eq(HM other) {
        if (this.hour == other.hour && this.minute == other.minute) {
            return true;
        } else {
            return false;
        }
    }
}