package ch8;

class Person {
	String name;
	int height;
	int weight;
}
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Lee";
		p1.height = 160;
		p1.weight = 45;
		
		Person p2 = new Person();
		p2.name = "Kim";
		p2.height = 180;
		p2.weight = 70;
	
		System.out.printf("Name : %s%nHeight : %d%nWeight : %d%n%n",p1.name,p1.height,p1.weight);
		System.out.printf("Name : %s%nHeight : %d%nWeight : %d%n%n",p2.name,p2.height,p2.weight);
	}
}