package javaBasic;

class Data2 {
	int x;
}

public class ReferenceParameter0422 {

	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);

	}
	static void change(Data2 da) {
		da.x = 1000;
		System.out.println("change() : x = " + da.x);
	}

}
