package javaBasic;

public class Hello2 {
	public static void main(String[] args) {
		Phone iPhone = new Phone();
		iPhone.product = "iPhone";
		iPhone.ver = 13;
		iPhone.price = 150;
		System.out.printf("Monthly : %.1f%n", iPhone.bill());
		iPhone.tagPrint();

		Phone galaxy = new Phone();
		galaxy.product = "Galaxy";
		galaxy.ver = 22;
		galaxy.price = 100;
		System.out.printf("Monthly : %.1f%n", galaxy.bill());
		galaxy.tagPrint();
	}
}
class Phone{
	String product;
	int ver;
	int price;
	void tagPrint() {
		System.out.printf("Phone : %s%nVersion : %d%nPrice : %d%n%n", product, ver, price);
	}
	double bill() {
		double result = (double) price / 24;
		return result;
	}

}

