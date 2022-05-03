package ch13;

public class InstanceVariableTest {
    int instanceVariable; // 객체 생성 후 사용
   public static int classVariable;
// 객체 생성 InstanceVariableTest ivt = new InstanceVariableTest();
    void instanceMethod() {
        System.out.println(instanceVariable);
        System.out.println(classVariable);
        classMethod();
    }
    static void classMethod(){
//        System.out.println(instanceVariable);
        System.out.println(classVariable);
//        instanceMethod();
    }
}
class OtherClass{
    public static void instanceMethod(){
//        System.out.println(classVariable);
    }
}