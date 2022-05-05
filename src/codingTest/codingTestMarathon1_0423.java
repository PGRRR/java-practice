package codingTest;

import java.util.Arrays;

public class codingTestMarathon1_0423 {
    public static void main(String[] args) {
        String[] participant = {"leo", "leo", "kiki", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        String[] fail = new String[participant.length - completion.length];
        int count = 0;
        int fCount = 0;
        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {
                if (!(participant[i].equals(completion[j]))) {
                    count++;
                }
                if (count == completion.length) {
                    fail[fCount] = participant[i];
                    fCount++;
                }

            }
            count = 0;
        }
        System.out.println(Arrays.toString(fail));
    }
}


