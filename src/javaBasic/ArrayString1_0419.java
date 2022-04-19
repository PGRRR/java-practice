package javaBasic;

import java.util.Arrays;

public class ArrayString1_0419 {

	public static void main(String[] args) {
		String [] strArr = {"Rock", "Scissors", "Paper"};
		System.out.println(Arrays.toString(strArr));

		int num = (int)(Math.random()*3);
		System.out.println(strArr[num]);
	}

}
