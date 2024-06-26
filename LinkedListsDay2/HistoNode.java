/*
name: Arav Neroth
date: 11.16.23
class: CS 3 3rd Period
 */


public class HistoNode
{
	private char letter;
	private int letterCount;
	private HistoNode next;

	public HistoNode(char let, int cnt, HistoNode n)
	{
		letter=let;
		letterCount=cnt;
		next=n;
	}

	public char getLetter()
	{
		return letter;
	}

	public int getLetterCount()
	{
		return letterCount;
	}

	public HistoNode getNext()
	{
	   return next;
	}

	public void setLetter(char let)
	{
		letter=let;
	}

	public void setLetterCount(int cnt)
	{
		letterCount=cnt;
	}

	public void setNext(HistoNode n)
	{
		next = n;
	}
}


