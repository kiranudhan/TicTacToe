package game.com;

import java.util.Scanner;

public class TicTacToe {
	static char userChoice = 'x';
	static char computerChoice = 'o';
	char[] board=new char[10];
	Scanner sc=new Scanner(System.in);
	
	private void createBoard() {
     for(int i=1;i<10;i++) {
			board[i]=' ';
		}
		
	}
	
	private void choice() {
		int turn=(int) (Math.random() * 10) % 2;
		if(turn == 0) {
			System.out.println("user play first");
		}else if(turn == 1) {
			System.out.println("computer play first");
		}
	}
   
	private void computerChoice() {
		int computerTurn=(int)(Math.random() * 10) % 10;
		board[computerTurn]=computerChoice;
		System.out.println("Computer choice is :: "+computerChoice);
	}
	
	private void showBoard() {
		System.out.println("------------");
		System.out.println("|" + board[1] + " | "+ board[2] + " | " + board[3] + " | ");
		System.out.println("------------");
		System.out.println("|" + board[4] + " | "+ board[5] + " | " + board[6] + " | ");
		System.out.println("------------");
		System.out.println("|" + board[7] + " | "+ board[8] + " | " + board[9] + " | ");
		System.out.println("------------");
	}
	
	public void checkFreeIndex() {
		System.out.println("choose index from 1 to 9 to make the move");
		int index=sc.nextInt();
	   
	    showBoard();
		if(board[index] == 'x' || board[index] == 'o') {
			System.out.println("index is not free");
		} else if (board[index] != 'x' || board[index] == 'o') {
			System.out.println("index is free");
			board[index]=userChoice;
			showBoard();
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println("Welcome to TicTacToeGame");
		TicTacToe obj=new TicTacToe();
        obj.createBoard();
        obj.choice();
        obj.computerChoice();
        obj.showBoard();
        obj.checkFreeIndex();
        
        }
  }

	
