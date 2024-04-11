/*
Name: Arav Neroth
Class: CS 3 3rd Period
Date: 10/10/23
 */

import java.util.*;

public class Romans
{
	private Map<String, Integer> m;
	
	public Romans()
	{
		m = new TreeMap<String, Integer>();
		
		/*
			Symbol	I	V	X		L		C		D		M
			Value		1	5	10		50		100	500	1000
		*/
		
		m.put( "I", 1 );
		m.put( "V", 5 );
		m.put( "X", 10 );
		m.put( "L", 50 );
		m.put( "C", 100 );
		m.put( "D", 500 );
		m.put( "M", 1000 );					
	}
	
	public int getNumber( String s )
	{
		return (m.get( s ));
	}
	public int getNumber( String s, String x )
	{
		return (m.get( s ) + m.get(x));
	}

	public int getNumber( String s, String x, String p )
	{
		return (m.get( s ) + m.get(x) + m.get(p));
	}


}