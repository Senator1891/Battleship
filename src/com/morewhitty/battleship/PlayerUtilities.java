package com.morewhitty.battleship;



public class PlayerUtilities 
{
	public static String changeName(String playerName) 
	{
		if(playerName.equalsIgnoreCase("Rich") || playerName.equalsIgnoreCase("Richard"))
		{
			playerName = "Dick";
			return playerName;
		}
	
		if(playerName.equalsIgnoreCase("Lizzie") || playerName.equalsIgnoreCase("Elizabeth"))
		{
			playerName = "Goegeous";
		}
		return playerName;
	}
}
