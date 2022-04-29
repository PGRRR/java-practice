package ch11;

public class Parent2Main {
	public static void main(String[] args) {
		GrandParent gp = new GrandParent();
		gp.name = "GrandParent";
		gp.age = 80;
		gp.printGrandParentInfo();
		System.out.println("--------");
		
		Parent2 p = new Parent2();
		p.name = "Parent";
		p.age = 50;
		p.job = "Worker";
		p.printGrandParentInfo();
		p.printParentInfo();
		System.out.println("--------");
		
		Child2 c = new Child2();
		c.name = "Child";
		c.age= 20;
		c.job= "Student";
		c.printGrandParentInfo();
		c.printParentInfo();
	}
}
