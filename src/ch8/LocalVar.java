package ch8;

public class LocalVar {
	int memVar;
//	int a, b, c; // solution
	void localTest() {
		int a = 10, c;
		{
			int b = 20;
			System.out.println("in block");
			System.out.println("a = " + a + "b = " + b);
		} // block end - block lv delete
//		System.out.println("a = " + a + ", b = " + b);
//		error - b is lv in block
		
		int b = 30;
		System.out.println("out block");
		System.out.println("a = " + a + ",  b = " + b);
	
			// memVar auto init to 0
			System.out.println("before memVar = " + memVar);
			memVar = 100;
			System.out.println("after memVar = " + memVar);
	} // method end = method lv delete
	
	void printVar() {
		System.out.println("memVar = " + memVar);
//		System.out.println("a = " + a + ", b = " + b);
//		error - a is lv in method b is lv in block
		
	}

}
