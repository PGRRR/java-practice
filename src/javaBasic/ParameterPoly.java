package javaBasic;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("Not enough money");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + " buy");
    }
}

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product[] cart = new Product[10];
    int i = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("Not enough money");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        cart[i++] = p;
        System.out.println(p + " buy");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            sum += cart[i].price;
            itemList += cart[i] + ", ";
        }
        System.out.println("Sum : " + sum);
        System.out.println("List : " + itemList);
    }
}

public class ParameterPoly {
    public static void main(String[] args) {
//        Buyer b = new Buyer();
//        b.buy(new Tv1());
//        b.buy(new Computer());
//
//        System.out.println(b.money);
//        System.out.println(b.bonusPoint);
        Buyer2 b = new Buyer2();

        b.buy(new Tv1());
        b.buy(new Computer());
        b.summary();
    }


}
