package ch4;

public class SwitchStringExample0413 {

	public static void main(String[] args) {
		String position = "C";
		
		switch(position) {
		case "AB":
			System.out.println("700 C");
			break;
		case "C":
			System.out.println("500 C");
			break;
		default:
			System.out.println("300 C");
		}

	}

}
