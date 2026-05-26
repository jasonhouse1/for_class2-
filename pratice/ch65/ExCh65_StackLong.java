import java.util.Stack;
import java.util.EmptyStackException;

public class ExCh65_StackLong {
    public static void main(String[] args) {
        Stack<Long> S = new Stack<Long>();

        System.out.println(S.empty());

        S.push(10L);
        S.push(20L);
        S.push(30L);

        System.out.println(S);
        System.out.println(S.peek());
        System.out.println(S.search(30L));
        System.out.println(S.search(10L));
        System.out.println(S.search(99L));

        System.out.println(S.pop());
        System.out.println(S);

        try {
            Stack<Long> T = new Stack<Long>();
            T.pop();
        }
        catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}

/*
重點:
1. 泛型不能寫 Stack<long>，要寫 Stack<Long>。
2. 10L、20L、30L 是 long literal。
3. Stack 的 top 在右邊。
4. peek() 查看 top，但不移除。
5. pop() 取出 top，並且移除。
6. search(obj) 從 top 開始算，top 的位置是 1，找不到回傳 -1。
7. 空 stack 做 pop() 會丟 EmptyStackException。

預期輸出:
true
[10, 20, 30]
30
1
3
-1
30
[10, 20]
empty stack
*/
