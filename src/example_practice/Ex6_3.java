package example_practice;

public class Ex6_3 {

}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        return (int) (getTotal() / 3f);
    }
}
