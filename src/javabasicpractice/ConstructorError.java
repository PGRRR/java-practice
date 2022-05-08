package javabasicpractice;

class Product {
    int price;
    int bonusPoint;
    Product(){} // default constructor
    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price/10.0);
    }
}

class Tv extends Product {
    Tv() {} // error - there is no default constructor in Product class


}

public class ConstructorError {

}
