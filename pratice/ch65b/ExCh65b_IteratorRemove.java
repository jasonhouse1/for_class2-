import java.util.LinkedList;
import java.util.Iterator;

public class ExCh65b_IteratorRemove {
    public static void main(String[] args) {
        LinkedList<String> L = new LinkedList<String>();

        L.add("A");
        L.add("B");
        L.add("A");
        L.add("C");
        L.add("A");

        System.out.println(L);

        Iterator<String> itr = L.iterator();

        while (itr.hasNext()) {
            String x = itr.next();

            if (x.equals("A")) {
                itr.remove();
            }
        }

        System.out.println(L);
    }
}

/*
重點:
1. Iterator 的 remove() 是刪除剛剛被 next() 跨過的元素。
2. 不能在 next() 之前呼叫 remove()。
3. 不能連續呼叫 remove()。
4. 使用 iterator 刪除 LinkedList 中的元素，比用 index 更符合 LinkedList 的特性。

預期輸出:
[A, B, A, C, A]
[B, C]
*/
