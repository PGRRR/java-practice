package example_practice;

public class EPArraySumAvg0419 {

	public static void main(String[] args) {
		int [] arr = {80, 90, 77};
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] = %d%n", i, arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum = " + sum);
		avg = (double)sum/arr.length;
		System.out.println("avg = " + avg);

	}

}
