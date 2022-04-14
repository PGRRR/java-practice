package ch6;

public class CraneCodingTest0414 {

	public static void main(String[] args) {
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int [] moves = {1,5,3,5,1,2,1,4};
        int [] goal = null;
        int goalCount = 0;
		for (int i = 0; i < moves.length; i++){
            for (int j = 0; j < board.length; j++){
                if(board[board.length - j][moves[i]] == 0){
                    continue;
                }
                goal[goalCount] = board[board.length - j][moves[i]];
                goalCount++;
                board[board.length - j][moves[i]] = 0;
            }
            
        }

	}

}
