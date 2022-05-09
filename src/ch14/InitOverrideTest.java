package ch14;

class InitTest {

    int num =10;

    public InitTest() {
        num = 10;
    }

}
class InitChild extends InitTest{
    int sum = 0;
}

public class InitOverrideTest {
    public static void main(String[] args) {

        InitTest it = new InitTest();
        System.out.println(it instanceof InitChild);
//        System.out.println(it.sum);
        System.out.println(it.num);
    }
}
