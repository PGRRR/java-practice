package javabasicpractice;

import java.util.Arrays;

public class BuyMethod {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new MTv());
        b.buy(new Computer());
        b.buy(new MTv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());

        b.summary();
    }
}

class Buyer {
    int money = 1000;
    MyProduct[] cart = new MyProduct[3];
    int i = 0;

    void buy(MyProduct p) {
        if (p.price > money) {
            return;
        } else {
            money -= p.price;
            add(p);
        }
    }

    void add(MyProduct p) {
        if (i >= cart.length) {
            MyProduct[] newCart = new MyProduct[cart.length * 2];
            System.arraycopy(cart, 0, newCart, 0, cart.length);
            cart = newCart;
        }
        cart[i] = p;
        i++;
    }
    void summary() {
        System.out.println(Arrays.toString(cart));
        int sum = 0;
        for (int i = 0; i < cart.length; i++) {
            sum += cart[i].price;
        }
        System.out.println("Sum : " + sum);
        System.out.println("Money : " + money);
    }
}
class MyProduct {
    int price;

    MyProduct(int price) {
        this.price = price;
    }
}

class MTv extends MyProduct {
    MTv() {super(100);}
    public String toString(){return "Tv";}
}

class Computer extends MyProduct {
    Computer() {super(200);}
    public String toString(){return "Computer";}
}

class Audio extends MyProduct {
    Audio(){super(50);}
    public String toString(){return "Audio";}
}