package example_practice;

public class EAOverloadingMethod0425 {

	public static void main(String[] args) {
		EAOM op = new EAOM();
		System.out.println(op.add(5, 5));
		System.out.println(op.add(5, 5, 5));
		System.out.println(op.add(2.1f, 5.2f, 5.5f));
		System.out.println(op.add(5.2f, 5.5f));

	}

}
class EAOM {
	int add(int a, int b){
		return a + b;
	}
	int add(int a, int b, int c) {
		return a + b + c;
	}
	float add(float a, float b, float c) {
		return a + b + c;
	}
	float add(float a, float b) {
		return a + b;
	}
}
