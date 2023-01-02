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
   
	private void showBoard() {
		System.out.println("------------");
		System.out.println("|" + board[1] + " | "+ board[2] + " | " + board[3] + " | ");
		System.out.println("------------");
		System.out.println("|" + board[4] + " | "+ board[5] + " | " + board[6] + " | ");
		System.out.println("------------");
		System.out.println("|" + board[7] + " | "+ board[8] + " | " + board[9] + " | ");
		System.out.println("------------");
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to TicTacToeGame");
		TicTacToe obj=new TicTacToe();
        obj.createBoard();
        obj.chooseLetter();
        obj.showBoard();
       
	}



}
