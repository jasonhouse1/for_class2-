import java.util.LinkedList;
import java.util.ListIterator;

class Wrap_f {
    float v;

    Wrap_f(float v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return Float.toString(this.v);
    }
}

public class ExCh65b_ListIterator {
    public static void main(String[] args) {
        LinkedList<Wrap_f> L = new LinkedList<Wrap_f>();

        L.add(new Wrap_f(1.1f));
        L.add(new Wrap_f(2.2f));
        L.add(new Wrap_f(3.3f));

        System.out.println(L);

        ListIterator<Wrap_f> itr = L.listIterator();

        while (itr.hasNext()) {
            Wrap_f x = itr.next();
            itr.set(new Wrap_f(x.v + 1.0f));
        }

        System.out.println(L);

        itr.add(new Wrap_f(99.9f));

        System.out.println(L);

        while (itr.hasPrevious()) {
            System.out.print(itr.previous() + " ");
        }

        System.out.println();
    }
}

/*
重點:
1. LinkedList 是 sequential access，適合用 iterator。
2. ListIterator 可以用 next() 正向走，也可以用 previous() 反向走。
3. set(e) 會替換剛剛 next() 或 previous() 跨過的元素。
4. add(e) 會在目前游標位置插入元素。
5. Wrap_f 是物件，所以不能直接 x + 1，要用 x.v + 1.0f，再 new Wrap_f。

預期輸出:
[1.1, 2.2, 3.3]
[2.1, 3.2, 4.3]
[2.1, 3.2, 4.3, 99.9]
99.9 4.3 3.2 2.1
*/
