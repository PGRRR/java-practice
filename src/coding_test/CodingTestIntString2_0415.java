package coding_test;

public class CodingTestIntString2_0415 {

	public static void main(String[] args) {
		String [] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String s = "one4seveneight";
		for (int i = 0; i < num.length; i++) {
			s = s.replaceAll(num[i],Integer.toString(i));
		}
        System.out.println(Integer.parseInt(s));
	}
}