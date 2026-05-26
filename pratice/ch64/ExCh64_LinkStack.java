class HM {
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

    @Override
    public String toString() {
        return this.hour + ":" + this.min;
    }
}

class HMNode {
    HM data;
    HMNode link;

    HMNode(HM data, HMNode link) {
        this.data = data;
        this.link = link;
    }
}

class HMLinkStk {
    HMNode top;

    HMLinkStk() {
        this.top = null;
    }

    boolean isEmpty() {
        return this.top == null;
    }

    void push(HM x) {
        this.top = new HMNode(x, this.top);
    }

    HM pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("stack underflow");
        }

        HM ans = this.top.data;
        this.top = this.top.link;
        return ans;
    }

    @Override
    public String toString() {
        String ans = "[";
        HMNode p = this.top;

        while (p != null) {
            ans += p.data;
            p = p.link;

            if (p != null) {
                ans += ", ";
            }
        }

        ans += "]";
        return ans;
    }
}

public class ExCh64_LinkStack {
    public static void main(String[] args) {
        HMLinkStk S = new HMLinkStk();

        S.push(new HM(1, 10));
        S.push(new HM(2, 20));
        S.push(new HM(3, 30));

        System.out.println(S);

        System.out.println(S.pop());
        System.out.println(S.pop());

        System.out.println(S);
    }
}

/*
重點:
1. Stack 是 LIFO，後進先出。
2. push(new HM(3, 30)) 最後放入，所以最先 pop 出來。
3. linked stack 裡的 top 指向堆疊頂端。
4. push 時，新 node 的 link 指向舊 top，然後 top 指向新 node。
5. pop 時，先取 top.data，再讓 top = top.link。

預期輸出:
[3:30, 2:20, 1:10]
3:30
2:20
[1:10]
*/
