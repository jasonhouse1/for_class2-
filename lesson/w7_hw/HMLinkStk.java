package w7_hw;

import java.util.EmptyStackException;

class HMStkNode {
    HM data;
    HMStkNode link;

    HMStkNode(HM data, HMStkNode link) {
        this.data = data;
        this.link = link;
    }
}

public class HMLinkStk {
    private HMStkNode top;

    public HMLinkStk() {
        this.top = null;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void push(HM x) {
        this.top = new HMStkNode(x, this.top);
    }

    public HM pop() {
        if (this.isEmpty()) {
            throw new EmptyStackException();
        }

        HM ans = this.top.data;
        this.top = this.top.link;
        return ans;
    }

    public void clear() {
        this.top = null;
    }

    public void p() {
        System.out.print(this.toString());
    }

    public void pn() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String ans = "[";
        HMStkNode p = this.top;

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

    public String toRevString() {
        String ans = "";
        HMStkNode p = this.top;

        while (p != null) {
            if (ans.length() == 0) {
                ans = "" + p.data;
            }
            else {
                ans = p.data + ", " + ans;
            }

            p = p.link;
        }

        return "[" + ans + "]";
    }
}

