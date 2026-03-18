class Character {
    int atk;
    int hp;

    public Character(int atk, int hp) {
        this.atk = atk;
        this.hp = hp;
    }

    public void print() {
        System.out.println("攻擊力:" + this.atk + " 血量:" + this.hp);
    }

   
    public static int totalPower(Character c) {
        return c.atk + c.hp;
    }
}

public class w4 {
    public static void main(String[] args) {
        Character james = new Character(10, 100);
        james.print();

       
        int power = Character.totalPower(james);
        System.out.println("Total Power = " + power);
    }
}