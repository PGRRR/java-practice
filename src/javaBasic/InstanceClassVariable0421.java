package javaBasic;

class Phone1 {
	static int width;
	static int height;
	String model;
	int ver;
	int price;
	double monthly;
}

public class InstanceClassVariable0421 {

	public static void main(String[] args) {
		System.out.printf("iPhone.width = %s%n", Phone1.width);
		System.out.printf("iPhone.height = %s%n", Phone1.height);

		Phone1 apple = new Phone1();
		apple.model = "iPhone";
		apple.ver = 13;
		apple.price = 150;
		apple.monthly = (double) apple.price / 30;

		Phone1 samsung = new Phone1();
		samsung.model = "Galaxy S";
		samsung.ver = 22;
		samsung.price = 100;
		samsung.monthly = (double) samsung.price / 30;

		System.out.printf("Apple`s product is %s %d and product size is %d%n",apple.model,apple.ver,Phone1.width);
		System.out.printf("Samsung`s product is %s %d and product size is %d%n",samsung.model,samsung.ver,Phone1.width);
		System.out.println("!Fix size!");
		Phone1.width = 100;
		Phone1.height = 100;
		System.out.printf("Apple`s product is %s %d and product size is %d%n",apple.model,apple.ver,Phone1.width);
		System.out.printf("Samsung`s product is %s %d and product size is %d%n",samsung.model,samsung.ver,Phone1.width);
		
		
	}

}
