package ch11;

public class Student extends Person{
    private String[] subjects;

    public void print_subj(){
        System.out.println(name + " student object");
        for (int i = 0; i < subjects.length; i++){
            System.out.println("subject : " + subjects[i]);
        }
    }
    public String[] getSubjects(){
        return subjects;
    }

    public void setSubjects(String[] subjects){
        this.subjects = subjects;
    }
}
