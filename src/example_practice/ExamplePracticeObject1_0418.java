package example_practice;

public class ExamplePracticeObject1_0418 {

	public static void main(String[] args) {
		// 이름, 신장, 체중 등을 멤버로 가지는 '사람 클래스'를 작성하자(필드는 자유롭게 설정할 것).
		Person me = new Person();
		me.name = "n_u";
		me.height = 200;
		me.weight = 500;
	}

}
class Person {
	String name;
	int height;
	int weight;
}
