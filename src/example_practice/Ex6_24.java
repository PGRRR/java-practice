package example_practice;

public class Ex6_24 {
    public static int abs(int value) {
        return (value > 0) ? value : -value;
    }

    public static void main(String[] args) {
        int value = 5;
        System.out.println(value + " abs : " + abs(value));
        value = -10;
        System.out.println(value + " abs : " + abs(value));

    }
}
// 오버라이딩의 정의 = 상속 받은 메서드의 구현부를 재정의 하는 것
// 오버라이딩의 필요성 = 상속 받은 메서드를 그대로 사용할 수 없을 때 자식 클래스에 맞게 재정의하여 사용