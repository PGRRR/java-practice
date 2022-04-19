package ch7;

public class ProductMain {

	public static void main(String[] args) {

		Product p1;
		p1 = new Product();
		p1.num = 1;
		p1.name = "notebook";

		Product p2 = new Product();
		p2.num = 2;
		p2.name = "TV";

		Product p3 = new Product();
		p3.num = 3;
		p3.name = "iPhone";
		
		Product.variable = 10;
		
		Product p4 = new Product();
		p4.variable = 20;
		
		System.out.println("Object p1 info output");
		System.out.println("p1.num = " + p1.num);
		System.out.println("p1.name = " + p1.name);
		System.out.println();

		System.out.println("Object p2 info output");
		System.out.println("p2.num = " + p2.num);
		System.out.println("p2.name = " + p2.name);
		System.out.println();

		System.out.println("Object p3 info output");
		System.out.println("p2.num = " + p3.num);
		System.out.println("p2.name = " + p3.name);
		System.out.println();
		
		System.out.println(p4.variable);
		System.out.println(Product.variable);
		
	}

}
