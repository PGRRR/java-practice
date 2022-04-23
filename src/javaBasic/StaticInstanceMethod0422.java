package javaBasic;

class MyMath2 {
	long a, b; // iv
	static int st = 10;
	long add(int a, int b) { // instance method
		return a + b;
	}

	static long add(long a, long b) { // class method lv
		return a + b; // lv
	}
}

public class StaticInstanceMethod0422 {
	public static void main(String[] args) {
		System.out.println(MyMath2.add(200L, 100L)); // call class method
		MyMath2 si = new MyMath2(); // construct instance
		si.a = 200L;
		si.b = 100L;
		si.st = 20;
		System.out.println(si.add(1,2)); // call instance method
		System.out.println(MyMath2.st);
	}
}
