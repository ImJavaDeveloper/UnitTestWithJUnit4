package com.basic.junit;


public class StringHelper {
	
	public String truncateAInFirstTwoPosition(String str)
	{
		if(str.length()<=2)
			return str.replaceAll("A", "");
		String firstTwoChar=str.substring(0,2);
		String stringMinusTwoChar=str.substring(2);
		
		return firstTwoChar.replace("A", "")+stringMinusTwoChar;
	}
	
	public boolean isFirstAndLastTwoCharSame(String str)
	{
		if(str.length()<=1)
			return false;
		String firstTwoChar=str.substring(0,2);
		String lastTwoChar=str.substring(str.length()-2);
		
		if(firstTwoChar.equals(lastTwoChar))
			return true;
		else
			return false;
	}
	
	

}
