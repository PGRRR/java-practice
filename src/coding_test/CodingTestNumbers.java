package coding_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodingTestNumbers {

	public static void main(String[] args) {
		int [] numbers = {5,8,4,0,6,7,9};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
		for (int j = 0; j < 10; j++) {
			for (int i = 0; i < numbers.length; i++) {
				if (numbers[i] == j) {
					list.remove(list.indexOf(j));
					break;
					}
				}
			}
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		}
	}
