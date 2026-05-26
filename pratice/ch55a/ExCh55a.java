import java.util.Arrays;

class HM implements Comparable<HM> {
    int hour;
    int min;

    HM(int hour, int min) {
        this.hour = hour;
        this.min = min;
        this.adjust();
    }

    void adjust() {
        this.hour += this.min / 60;
        this.min = this.min % 60;

        if (this.min < 0) {
            this.min += 60;
            this.hour -= 1;
        }
    }

    int totalMin() {
        return this.hour * 60 + this.min;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof HM)) {
            return false;
        }

        HM p = (HM)obj;
        return this.totalMin() == p.totalMin();
    }

    @Override
    public int compareTo(HM p) {
        return this.totalMin() - p.totalMin();
    }

    @Override
    public String toString() {
        return this.hour + ":" + this.min;
    }
}

public class ExCh55a {
    public static void main(String[] args) {
        HM p1 = new HM(1, 30);
        HM p2 = new HM(1, 30);
        HM p3 = p1;

        System.out.println(p1 == p2);
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p2));

        HM[] A = {
            new HM(3, 10),
            new HM(1, 50),
            new HM(2, 20)
        };

        System.out.println(Arrays.toString(A));

        Arrays.sort(A);

        System.out.println(Arrays.toString(A));
    }
}

/*
重點:
1. p1 == p2 是 false，因為兩個不同物件，地址不同。
2. p1 == p3 是 true，因為 p3 和 p1 指向同一個物件。
3. p1.equals(p2) 是 true，因為 equals 比內容。
4. Arrays.sort(A) 會呼叫 HM 的 compareTo() 排序。

預期輸出:
false
true
true
[3:10, 1:50, 2:20]
[1:50, 2:20, 3:10]
*/
