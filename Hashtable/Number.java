/*
name- Arav Neroth
date- 12/3/2023 (yes i know its late im sorry this took a while the logic was really getting to me)
class- CS 3 3rd Period
 */

public class Number
{
	private int theValue;

	public Number(int value)
	{
		theValue = value;
	}

	public int getValue()
	{
		return theValue;
	}

	public boolean equals(Object obj)
	{
		// casting is very annoying
		return theValue == ((Number) (obj)).theValue;
	}

	public int hashCode()
	{
		return (theValue % 10);
	}

	public String toString()
	{
		return " " + theValue;
	}
}