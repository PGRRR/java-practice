package ch5;

public class ArrayTest0412 {

	public static void main(String[] args) {
		String[] arrString = {"Jan", "Feb", "Mar","Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int i;
		System.out.println("en");
		for (i = 0; i < arrString.length; i++) {
				System.out.println(arrString[i]);
		}
		for(i = 0; i < arrString.length; i++) {
			arrString[i] = ( i + 1) + "��";
		}
		System.out.println("ko");
		for(i = 0; i < arrString.length; i++) {
			System.out.println(arrString[i]);
		}
	}
}
