package example_practice;

public class EAConstructorOverloading0425 {

	public static void main(String[] args) {
		Singer s1 = new Singer("IU");
		System.out.println(s1.name);
		Singer s2 = new Singer("Suzy", 20);
		System.out.println(s2.name);
		System.out.println(s2.age);
		Singer s3 = new Singer("Na", 40, true);
		System.out.println(s3.name);
		System.out.println(s3.age);
		System.out.println(s3.nice);

	}

}
class Singer {
	String name;
	int age;
	boolean nice;
	
	Singer(){
		
	}
	Singer(String name){
		this.name = name;
	}
	Singer(String name, int age){
		this.name = name;
		this.age = age;
	}
	Singer(String name, int age, boolean nice){
		this.name = name;
		this.age = age;
		this.nice = nice;
	}
}
