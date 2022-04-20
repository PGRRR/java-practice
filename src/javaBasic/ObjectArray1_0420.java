package javaBasic;

public class ObjectArray1_0420 {

	public static void main(String[] args) {
		Alpabet [] alpaArr = new Alpabet[3];
		System.out.println(alpaArr[0]);
		alpaArr[0] = new Alpabet();
		System.out.println(alpaArr[0]);
		Alpabet [] alpaArr2 = {new Alpabet(), new Alpabet()};
		System.out.println(alpaArr2);
		System.out.println(alpaArr2[0]);
		System.out.println(alpaArr[0].a);
	}
}
class Alpabet {
	int a = 1000;
}