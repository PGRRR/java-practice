package ch11;

class Parent {
    public String name;
    protected int age;
    private int money;

    public Parent() {
        System.out.println("Parent constructor");
    }
    public Parent(int a, int b) {
    	System.out.println(a + b);
    }

    public void printParentInfo() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
    }

    public int getMoney() { // getter
        return money;
    }

    public void setMoney(int money) { // setter
        this.money = money;
    }
}

class Child extends Parent {
	void a () {
		Child w = new Child();
		w.name = "wd";
	}
    private String hobby;

    public Child() {
        System.out.println("Child constructor");
    }
    public Child(int a, int b) {
    	System.out.println(a + b);
    }

    public void printInfo() {
        System.out.println("name : " + name);
        System.out.println("age : " + age);
//        System.out.println("money : " + money);
        System.out.println("hobby : " + hobby);
    }

    public String getHobby() { // getter
        return hobby;
    }

    public void setHobby(String hobby) { // setter
        this.hobby = hobby;
    }
}

public class ParentMain {
    public static void main(String[] args) {
        Parent p = new Parent(); // call constructor
        p.name = "Parent";
        p.age = 50;
        p.setMoney(10000);
        p.printParentInfo();
        System.out.println("money : " + p.getMoney());
        System.out.println("-----------------------");

        Child c = new Child(); // 
        Child d = new Child(4, 5);
        c.name = "Child";
        c.age = 20;
        c.setHobby("guitar");
        c.printParentInfo();
        c.printInfo();
    }
}

