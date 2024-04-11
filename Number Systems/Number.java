/*
Name: Arav Neroth
Class: CS 3 3rd Period
Date: 10.22
 */

import static java.lang.System.*;

public class Number implements Comparable<Number>
{

	private String starting;
	private int baseTen;
	private int base;
	
	public Number(String starting, int base){

		this.starting = starting;
		this.base = base;

	}

	private String binaryConvert(){
		int binary = Integer.parseInt(starting, base);
		return Integer.toBinaryString(binary);
	}

	public int baseTenConvert(){
		baseTen = Integer.parseInt(starting,base);
		return baseTen;
	}

	public int compareTo(Number param)
	{
		// amt of ones in one line vs the other line
		int currentOnes = 0;
		int paramOnes = 0;

		// iterates through the current binary to add all ones
		for (char c : binaryConvert().toCharArray()) {
			if (c == '1')
				currentOnes++;
		}

		// iterates through the next numbers binary to add all ones
		for (char c : param.binaryConvert().toCharArray()) {
			if (c == '1')
				paramOnes++;
		}

		// comparing in binary ones
		if (currentOnes == paramOnes) {

			// comparing in converted base ten
			if (baseTenConvert()!= param.baseTenConvert())

				// recursively compares if the converted bases are NOT the same,
				// if they are not the same, we compare the converted binary
				return binaryConvert().compareTo(param.binaryConvert());
			// compares the original numbers of
			return starting.compareTo(param.starting);

		} else if (currentOnes > paramOnes) {

			return 1;

		} else {

			return -1;
		}

	}
	
	public String toString( )
	{
	  return starting + " " + baseTen + " " + binaryConvert();
	}
}