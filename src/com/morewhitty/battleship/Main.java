package com.morewhitty.battleship;

import java.util.Scanner;

public class Main {
	
	private static String playerName;
	
	static Scanner scan =  new Scanner(System.in); 
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Battleship.");
		System.out.println("Please enter your name.");
		String playerName = scan.nextLine();
		playerName = PlayerUtilities.changeName(playerName);
		System.out.println("Hello " + playerName +". My name is Roger. Let's Begin.");
		RogersBoard.setupRogersBoard();
		
		
	}
	
}
