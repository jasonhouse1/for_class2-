import java.util.ArrayList;

public class ExCh65a_RemoveAll {
    static void removeAllObj(ArrayList<String> L, String obj) {
        while (L.remove(obj)) {
        }
    }

    public static void main(String[] args) {
        ArrayList<String> L = new ArrayList<String>();

        L.add("cat");
        L.add("dog");
        L.add("cat");
        L.add("bird");
        L.add("cat");

        System.out.println(L);

        System.out.println(L.remove("cat"));
        System.out.println(L);

        removeAllObj(L, "cat");
        System.out.println(L);
    }
}

/*
重點:
1. remove(Object obj) 只刪除第一個等於 obj 的元素。
2. remove(obj) 有刪到會回傳 true。
3. remove(obj) 找不到會回傳 false。
4. while(L.remove(obj)) 可以一直刪，直到沒有 obj 為止。

預期輸出:
[cat, dog, cat, bird, cat]
true
[dog, cat, bird, cat]
[dog, bird]
*/
