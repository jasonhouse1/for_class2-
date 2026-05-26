import ds.HM;

public class ExCh61_62 {
    public static void main(String[] args) {
        HM p1 = new HM(1, 40);
        HM p2 = new HM(0, 50);

        System.out.println(p1);

        p1.addBy(p2);

        System.out.println(p1);
    }
}

/*
編譯方式:
javac ds/HM.java ExCh61_62.java

執行方式:
java ExCh61_62

重點:
1. 因為 HM 在 package ds 裡，所以外部程式要 import ds.HM。
2. 若 HM 不是 public，這裡不能使用。
3. 若 addBy() 不是 public，這裡不能呼叫。
4. 這是 Ch61 / Ch62 最常見的 package 題型。

預期輸出:
1:40
2:30
*/
