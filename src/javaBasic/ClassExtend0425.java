package javaBasic;

class Tvn {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		++channel;
	}

	void channelDown() {
		--channel;
	}
} // 5 member

class SmartTv extends Tvn {
	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
} // 7 member

public class ClassExtend0425 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10; // parent member
		stv.channelUp(); // parent member
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World");
		stv.caption = true;
		stv.displayCaption("Hello, World");

	}

}
