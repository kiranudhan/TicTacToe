package game.com;

import java.util.Scanner;

public class TicTacToe {
	static char userChoice;
	static char computerChoice;
	char[] board=new char[10];
	Scanner sc=new Scanner(System.in);
	
	private void createBoard() {
		
		for(int i=1;i<10;i++) {
			board[i]=' ';
		}
		
	}
	
	private void chooseLetter() {
		System.out.println("choose your choice 1. X  and 2.o");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			userChoice='X';
			computerChoice='o';
			System.out.println("user choice is :: "+userChoice+" Computer choice is :: "+computerChoice);
			break;
		case 2:
			userChoice='o';
			computerChoice='X';
			System.out.println("user choice is :: "+userChoice+" Computer choice is :: "+computerChoice);
			break;
		default:
			System.out.println("Enter valid option");
			chooseLetter();
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToeGame");
		TicTacToe obj=new TicTacToe();
        obj.createBoard();
        obj.chooseLetter();
	}



}
