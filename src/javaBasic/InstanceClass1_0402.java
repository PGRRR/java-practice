package javaBasic;

public class InstanceClass1_0402 {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);

		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;

		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;

		System.out.printf("c1 is %s, %d, size is %d%n", c1.kind, c1.number, Card.height);
		System.out.printf("c2 is %s, %d, size is %d%n", c2.kind, c2.number, Card.height);
		System.out.println("c1 width and height change");
		Card.width = 50;
		Card.height = 80;

		System.out.printf("c1 is %s, %d, size is %d%n", c1.kind, c1.number, Card.height);
		System.out.printf("c2 is %s, %d, size is %d%n", c2.kind, c2.number, Card.height);

	}

}
class Card {
	String kind;
	int number;
	static int width;
	static int height;
}