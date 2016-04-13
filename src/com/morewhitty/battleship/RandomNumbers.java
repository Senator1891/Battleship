package com.morewhitty.battleship;

import java.util.Random;

public class RandomNumbers 
{

	public static int[] randomStart() 
	{
		Random randomStart = new Random();
		int randomStartFirst = randomStart.nextInt(100);
		int randomStartSecond = randomStart.nextInt(100);
		return new int[] 
		{
			randomStartFirst, randomStartSecond
		};
	}
	
	public static int randomDirection() 
	{
		Random randomStart = new Random();
		return randomStart.nextInt(4);
	}

}