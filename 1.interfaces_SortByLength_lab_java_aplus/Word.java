/*
Arav Neroth
3rd Period CS 3
8/30/23
 */

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{
		Word input = (Word)rhs;
		int lengthComparison = Integer.compare(word.length(), input.word.length());

		if (lengthComparison == 0) {
			word.compareTo(input.word);
		}
		return lengthComparison;
	}

	public String toString()
	{
		return word;
	}
}