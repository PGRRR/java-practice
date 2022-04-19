package ch7;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = "sin";
		String strVar2 = "sin";
		
		if (strVar1 == strVar2){
			System.out.println("strVar1 strVar2 same address");
		} else {
			System.out.println("strVar1 strVar2 diff address");
		}
		
		if (strVar1.equals(strVar2)) {
			System.out.println("Same String");
		}
		
		String strVar3 = new String("sin");
		String strVar4 = new String("sin");
		
		if(strVar3 == strVar4){
			System.out.println("strVar3 strVar4 same address");
		} else {
			System.out.println("strVar3 strVar4 diff address");
		}

		if(strVar3.equals(strVar4)) {
			System.out.println("Same String");
		}
	}

}
