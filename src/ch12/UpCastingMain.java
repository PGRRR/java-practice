package ch12;

public class UpCastingMain {
    public static void main(String[] args) {
        System.out.println("UpCastingParent Object");
        UpCastingParent up = new UpCastingParent();
        System.out.println("up.add()=" + up.add() + "\n");

        System.out.println("UpCastingChild Object");
        UpCastingChild uc = new UpCastingChild();
        System.out.println("uc.add()=" + uc.add());
        System.out.println("uc.sub()=" + uc.sub() + "\n");

        System.out.println("UpCasting Object");
        UpCastingParent upc = new UpCastingChild();

        System.out.println("upc.add()=" + upc.add() + "\n");
    }
}
