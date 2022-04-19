package example_practice;

public class EP2DArraySum0419 {

	public static void main(String[] args) {
		int [][] arr = {
				{100, 100, 100},
				{200, 200, 200},
				{50, 50, 50},
				{25, 25, 25}
		};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[j].length; j++) {
				System.out.printf("arr[%d][%d] = %d%n", i, j, arr[i][j]);
				sum += arr[i][j];
			}
		}
		System.out.println("sum = " + sum);
	}

}
