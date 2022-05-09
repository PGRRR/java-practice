package javaBasic;

abstract class Unit {
    int x, y;

    abstract void move(int x, int y);

    void stop() {
        System.out.println("Stop");
    }
}

interface Fightable {
    void move(int x, int y); // public abstract skip

    void attack(Fightable f); // public abstract skip
}

class Fighter extends Unit implements Fightable {
    public void move(int x, int y) {
        System.out.println("Move to " + x + ", " + y);
    } // 오버라이딩 규칙 : 조상 (public) 보다 접근제어자가 좁으면 안된다.

    public void attack(Fightable f) {
        System.out.println("Attack " + f);
    }
}

public class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();
        f.move(100, 200);
        f.attack(new Fighter());
    }
}
