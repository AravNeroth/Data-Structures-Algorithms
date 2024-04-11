/*
name: arav neroth
date: 12/5/23
class: CS 3 3rd period
note: i'm sorry mrs roberts my brain is confused i'll get it done i promise
 */

public interface Treeable
{
	public Object getValue();
	public Treeable getLeft();
	public Treeable getRight();

	public void setValue(Comparable value);
	public void setLeft(Treeable left);
	public void setRight(Treeable right);
}