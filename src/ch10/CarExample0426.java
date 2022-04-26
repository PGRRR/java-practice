package ch10;

public class CarExample0426 {

	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("run");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("need gas");
		} else {
			System.out.println("fill gas");
		}

	}

}
