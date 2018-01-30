package com.zilker.dto;

import java.util.Comparator;

public class SortbyName implements Comparator<Player>
{
    // Used for sorting in ascending order of
    // roll number
   
	@Override
	public int compare(Player pl1, Player pl2) {
		// TODO Auto-generated method stub
		return pl1.getPlayerName().compareTo(pl2.getPlayerName());
	}
}