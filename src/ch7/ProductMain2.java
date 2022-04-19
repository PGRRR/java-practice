package ch7;

public class ProductMain2 {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.num = 1;
		p1.name = "notebook";

		System.out.println("Object p1 info output");
		p1.print();

		Product p2 = new Product();
		p2.num = 2;
		p2.name = "TV";

		System.out.println("Object p2 info output");
		p2.print();
		
		Product p3 = new Product();
		p3.num = 3;
		p3.name = "iPhone";
		
		System.out.println("Object p3 info output");
		p3.print();

	}

}
