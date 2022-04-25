package ch9;

public class AddMain {

	public static void main(String[] args) {
		Add a = new Add();
		System.out.println("int 2 parameter add() call : " + a.add(3, 5));
		System.out.println("int 3 parameter add() call : " + a.add(3, 5, 4));
		System.out.println("float add() call : " + a.add(3.4f, 4.7f));
		System.out.println("String add() call : " + a.add("aaa", "bbb"));

	}

}
