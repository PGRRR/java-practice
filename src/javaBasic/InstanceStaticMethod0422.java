package javaBasic;

public class InstanceStaticMethod0422 {
	void instanceMethod() {}
	static void staticMethod(){}
	
	void instanceMethod2() {
		instanceMethod();
		staticMethod();
	}
	static void staticMethod2() {
//		instanceMethod();
		staticMethod();
	}
}
