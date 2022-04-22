package example_practice;

public class EAQuestion0422 {
	void print() {
		System.out.println("Method");
		print2();
	}

	void print2() {
		System.out.println("Method");
		print();
		print3();
	}
	static void print4() {
		print3();
	}
	static void print3() {
		System.out.println("Method");
		print4();
		EAQuestion0422 p = new EAQuestion0422();
		p.print();
		// print(); // error - only static method available 
	}
}
class Aw {
	void a1() {
		EAQuestion0422 p = new EAQuestion0422();
		p.print();
		// print(); // error - out of class need constructor
	}
	void a2() {
		EAQuestion0422.print3();
	}
	static void a3() {
		EAQuestion0422 p = new EAQuestion0422();
		p.print2();
		// print3(); // error - even static out of class
	}
}


