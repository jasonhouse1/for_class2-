import java.util.Arrays;

public class Test_sortHM {
    public static void printA(HM[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i].print();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        HM a = new HM(10, 30);
        HM b = new HM(8, 45);
        HM c = new HM(10, 15);
        HM d = new HM(12, 0);
        HM e = new HM(8, 45);

        System.out.println("a equals b ? " + a.equals(b));
        System.out.println("b equals e ? " + b.equals(e));
        System.out.println("a compareTo c = " + a.compareTo(c));
        System.out.println("b compareTo e = " + b.compareTo(e));

        HM[] arr = {a, b, c, d, e};

        System.out.println("排序前:");
        printA(arr);

        Arrays.sort(arr);

        System.out.println("排序後:");
        printA(arr);
    }
}
