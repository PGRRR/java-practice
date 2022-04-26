package ch9;

class InitTest {
	int x = 5;
	static int y = 5;
	String str = "aaa";
	
	static {
		System.out.println("before static init block \ny = " + y);
		y = 10;
	}
	
	{
		System.out.println("before init block \nx = " + x);
		System.out.println("y = " + y);
		System.out.println("str = " + str);
		x = 20;
		y = 20;
		str = "bbb";
	}
	
	InitTest(){
		System.out.println("before constructor \nx = " + x);
		System.out.println("y = " + y);
		System.out.println("str = " + str);
		x = 30;
		y = 30;
		str = "ccc";
	}
	
	void print() {
		System.out.println("after all init \nx = " + x);
		System.out.println("y = " + y);
		System.out.println("str = " + str);
	}
}

public class InitTestMain {
	public static void main(String[] args) {
		InitTest t = new InitTest();
		t.print();
	}
}