package ds;

public class HM {
    private int hour;
    private int min;

    public HM(int hour, int min) {
        this.hour = hour;
        this.min = min;
        this.adjust();
    }

    private void adjust() {
        this.hour += this.min / 60;
        this.min = this.min % 60;

        if (this.min < 0) {
            this.min += 60;
            this.hour -= 1;
        }
    }

    public void addBy(HM p) {
        this.hour += p.hour;
        this.min += p.min;
        this.adjust();
    }

    @Override
    public String toString() {
        return this.hour + ":" + this.min;
    }
}

/*
重點:
1. 這個檔案放在 ds/HM.java。
2. 第一行要寫 package ds;
3. class HM 要讓 package 外使用，所以寫 public。
4. hour 和 min 用 private，外部不能直接改。
5. 外部若要操作 HM，要透過 public method。
*/
