package ch15;

public class AnimalExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.sound();
        cat.sound();
        System.out.println("-----");

        Animal animal = null;
        animal = (Animal) new Dog(); // 부모 참조 변수 자식 객체 자동 형변환?
//        Dog d = (Dog) animal;
        animal.sound();
        animal = new Cat();
        animal.sound();
        System.out.println("-----");

        animalSound(new Dog());
        animalSound(new Cat());
        method((Hyundai) new Car());
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
    public static void method(Hyundai h){

    }
}
class tesr {
    Hyundai h = new Hyundai();

    Car c = (Car)h; // OK, 조상인 Car 타입으로 형변환 (생략 가능)
    Hyundai h2 = (Hyundai)c; // OK, 자손인 Hyundai 타입으로 형변환 (생략 불가)
//    Kia k = (Kia)h; // ERROR, 상속 관계가 아닌 클래스 간의 형변환 불가
}

class Hyundai extends Car {}
class Car {}
class Kia extends Car{}