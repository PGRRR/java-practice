package ch11;

public class PersonMain {
    public static void main(String[] args) {
        Person p = new Person();
        p.setNum(1);
        p.setName("person");
        p.setDept("dept");
        p.setAddress("address");
        p.print();
        System.out.println("-----------------");

        Professor f = new Professor();
        f.setNum(2);
        f.setName("Pro 1");
        f.setDept("Computer");
        f.setAddress("Seoul");
        f.setSubjects(new String[] {"c", "java", "python"});
        f.print();
        f.print_subj();
        System.out.println("-----------------");

        Student s = new Student();
        s.setNum(3);
        s.setName("Student 1");
        s.setDept("Computer");
        s.setAddress("KKD");
        s.setSubjects(new String[]{"java", "OS", "compiler"});
        s.print();
        s.print_subj();
        System.out.println("-----------------");

        Staff sf = new Staff();
        sf.setNum(4);
        sf.setName("Staff 1");
        sf.setDept("HR");
        sf.setAddress("KYD");
        sf.setJob("Academy");
        sf.print();
        sf.print_job();
    }
}
