package coding_test;

public class CodingTestLotto0414 {

	public static void main(String[] args) {
		int [] lottos = {44, 1, 0, 0, 31, 25};
		int [] win_nums = {31, 10, 45, 1, 6, 19};
        int zeroCount = 0; // 0�� ����
        int winCount = 0; // ��÷ ����
        int i = 0;
        for (; i < lottos.length; i++){
            if (lottos[i] == 0){
                zeroCount++;
            } else {
                for (int j = 0; j < win_nums.length; j++){
                    if (lottos[i] == win_nums[j]) {
                        winCount++;
                        } 
                    }
                } 
            }
        int maxWin = zeroCount + winCount;
        int maxRank;
        int minRank;
        switch (maxWin){
            case 6: 
                maxRank = 1;
                break;
            case 5: 
                maxRank = 2;
                break;
            case 4: 
                maxRank = 3;
                break;
            case 3: 
                maxRank = 4;
                break;
            case 2: 
                maxRank = 5;
                break;
            default:
                maxRank = 6;
                break;
            }
        switch (winCount){
            case 6: 
                minRank = 1;
                break;
            case 5: 
                minRank = 2;
                break;
            case 4: 
                minRank = 3;
                break;
            case 3: 
                minRank = 4;
                break;
            case 2: 
                minRank = 5;
                break;
            default:
                minRank = 6;
                break;
            }
        System.out.println(maxRank);
        System.out.println(minRank);
      }
}

