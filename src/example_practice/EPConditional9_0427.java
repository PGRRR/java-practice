package example_practice;

public class EPConditional9_0427 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            sum += str.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
