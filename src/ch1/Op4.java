package ch1;

public class Op4 {

	public static void main(String[] args) {
		int a=10, b=20;
		
		//&& (AND)
		System.out.println(a==10 && b==20); // true
		System.out.println(a>10 && b==20); // false
		System.out.println(a==10 && b==10); // false
		System.out.println(a<10 && b>20); // false 
		
		//|| (OR)
		System.out.println(a==10 || b==20); // true
		System.out.println(a>10 || b==20); // true
		System.out.println(a==10 || b==10); // true
		System.out.println(a<10 || b>20); // false
		

	}

}
