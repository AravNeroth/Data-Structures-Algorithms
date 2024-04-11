/*
name: arav neroth
date: 12/10/23 ( late work 'redo' )
class: CS 3 3rd period
i do not like diameter, & some of the code (diameter & leaves) I got help with
 */
public class TreeNode implements Treeable
{
	private Comparable treeNodeValue;
	private TreeNode leftTreeNode;
	private TreeNode rightTreeNode;

	public TreeNode( )
	{
		treeNodeValue = null;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public TreeNode(Comparable value)
	{
		treeNodeValue = value;
		leftTreeNode = null;
		rightTreeNode = null;
	}

	public TreeNode(Comparable value, TreeNode left, TreeNode right)
	{
		treeNodeValue = value;
		leftTreeNode = left;
		rightTreeNode = right;
	}

	public Comparable getValue()
	{
		return treeNodeValue;
	}

	public TreeNode getLeft()
	{
		return leftTreeNode;
	}

	public TreeNode getRight()
	{
		return rightTreeNode;
	}

	public void setValue(Comparable value)
	{
		treeNodeValue = value;
	}

	public void setLeft(Treeable left)
	{
		leftTreeNode = (TreeNode) left;
	}

	public void setRight(Treeable right)
	{
		rightTreeNode = (TreeNode)right;
	}
}