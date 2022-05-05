package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class codingTestMarathon2_0423 {
    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};
        String answer = null;
        Arrays.sort(participant);
        Arrays.sort(completion);
       ArrayList<String> compelList = new ArrayList<>(Arrays.asList(completion));
        for (int i = 0; i < participant.length; i++) {
            if (!compelList.contains(participant[i])) {
                answer = participant[i];
            }
        }
        System.out.println(answer);
    }
}
