package ch6;

public class CraneCodingTest0414 {

	public static void main(String[] args) {
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int [] moves = {1,5,3,5,1,2,1,4};
        int [] goal = new int [moves.length];
		for (int i = 0; i < moves.length; i++){
            for (int j = 0; j < board.length; j++){
                if(board[board.length - j][moves[i]] == 0){
                    continue;
                }
                for(int k = 0; k < goal.length; k++) {
                    if(goal[goal.length - k] == 0){
                        continue;
                    }
                }
                goal[i] = board[board.length - j][moves[i]]; // 보드에서 찾은 값 골에 입력
                board[board.length - j][moves[i]] = 0;
                if (goal[i] == goal[i + 1]) {
                	goal[i] = 0;
                	goal[i + 1] = 0;
                }
            }
            
        }
		System.out.println();
	}

}
