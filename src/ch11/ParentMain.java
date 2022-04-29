package ch11;

class Parent {
    public String name;
    protected int age;
    private int money;

    public Parent() {
        System.out.println("Parent constructor");
    }

    public void printParentInfo() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Child extends Parent {
    private String hobby;

    public Child() {
        System.out.println("Child constructor");
    }

    public void printInfo() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
//        System.out.println("money : " + money);
        System.out.println("hobby : " + hobby);
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}

public class ParentMain {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.name = "Parent";
        p.age = 50;
        p.setMoney(10000);
        p.printParentInfo();
        System.out.println("money : " + p.getMoney());
        System.out.println("-----------------------");

        Child c = new Child();
        c.name = "Child";
        c.age = 20;
        c.setHobby("guitar");
        c.printParentInfo();
        c.printInfo();
    }
}

