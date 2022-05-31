package ch17;

public class IndexOf {
    public static void main(String[] args) {
        String subject = "java programming";

        int location = subject.indexOf("programming");
        System.out.println(location);

        if (subject.indexOf("java") != -1) {
            System.out.println("yes java");
        } else {
            System.out.println("no java");
        }
    }
}
