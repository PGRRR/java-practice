package ch6;

public class IfForExample0418 {

	public static void main(String[] args) {
		int weight = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for (int i = 0; i < 11; i++) {
			weight = weight + 2;
			count1++;
			if (weight == 81) {
				break;
			}
			condition1 : for(int j = 0; j < 11; j++) {
				weight = weight + 3;
				count2++;
				if (weight == 81) {
					break;
				}
				for(int k = 0; k < 11; k++) {
					weight = weight + 5;
					count3++;
					if (weight == 81) {
						break condition1;
					}
					
				}
			}
		}

	}

}
