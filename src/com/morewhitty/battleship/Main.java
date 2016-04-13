package com.morewhitty.battleship;

import java.io.Console;

public class Main {
	
	private static String playerName;
	
	static Console console = System.console();
	String s = console.readLine();
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Battleship.");
		System.out.println("Please enter your name.");
		String playerName = console.readLine();
		PlayerUtilities.isRich(playerName);
		System.out.println("Hello " + playerName +". Let's Begin.");
	}
	
}
