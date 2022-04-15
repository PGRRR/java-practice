package ch4;

public class arrTest1_0414 {

	public static void main(String[] args) {
		int [] array = new int [5];
		for (int i = 0; i < array.length; i++) {
			array[i] = 5 - i;
		}
		for (int i = 0; i < array.length; i++)
		System.out.print(array[i] + "\t");
	}

}
