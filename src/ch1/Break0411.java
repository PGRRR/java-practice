package ch1;

public class Break0411 {

	public static void main(String[] args) {
		int i = 1;
		for (;;) { // ���� �ݺ� While(1)
			System.out.print((i++)+"\t");
			if(i == 11) {
				break;
			}
		}

	}

}
