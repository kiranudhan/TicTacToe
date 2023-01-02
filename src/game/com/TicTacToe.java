package game.com;

public class TicTacToe {
	
	private void createBoard() {
		char[] board=new char[10];
		for(int i=1;i<10;i++) {
			board[i]=' ';
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToeGame");
		int a=10;
		int b=20;
		TicTacToe obj=new TicTacToe();
        obj.createBoard();
	}



}
