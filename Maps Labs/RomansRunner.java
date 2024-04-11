/*
Name: Arav Neroth
Class: CS 3 3rd Period
Date: 10/10/23
 */

public class RomansRunner
{
	public static void main( String args[] )
	{
		Romans w = new Romans();
		System.out.println( w.getNumber( "V", "I", "I" ) );
		System.out.println( w.getNumber( "X", "X" ) );
		System.out.println( w.getNumber( "C", "D", "M" ) );
		System.out.println( w.getNumber( "L") );

	}
}

