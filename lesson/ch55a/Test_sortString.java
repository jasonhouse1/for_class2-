import java.util.Arrays;

public class Test_sortString {
    public static void printA(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"邱振營", "資管系4", "是", "411631327", "我"};

        System.out.println("排序前:");
        printA(a);

        Arrays.sort(a);

        System.out.println("排序後:");
        printA(a);
    }
}
