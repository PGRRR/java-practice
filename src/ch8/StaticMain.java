package ch8;

public class StaticMain {
	public static void main(String[] args) {
		
		StaticVar v1 = new StaticVar();
		System.out.println("print from v1");
		v1.staticTest();
		
		StaticVar v2 = new StaticVar();
		System.out.println("print from v2");
		v2.staticTest();
		
		StaticVar v3 = new StaticVar();
		System.out.println("print from v3");
		v3.staticTest();
		
		v1.a = 50;
		v1.b = 500;
		
		System.out.println("v1.a = " + v1.a);
		System.out.println("v1.b = " + v1.b);
		
		System.out.println("v2.a = " + v2.a);
		System.out.println("v2.b = " + v2.b);
		
		System.out.println("v3.a = " + v3.a);
		System.out.println("v3.b = " + v3.b);
	}
}
