package example_practice;

public class EPClass2_0427 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "�솉湲몃룞";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;

        System.out.println(s.name);
        System.out.println(s.getTotal());
        System.out.println(s.getAverage());
    }
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
        return (float) getTotal() / 3;
    }
}
