package com.morewhitty.battleship;



public class PlayerUtilities 
{
	public static void isRich(String playerName)
	{
		if(playerName.equalsIgnoreCase("Rich") || playerName.equalsIgnoreCase("Richard"))
		{
			playerName = "Dick";
		}
	}
}
