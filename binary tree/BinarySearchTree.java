/*
name: arav neroth
date: 12/10/23 ( late work 'redo' )
class: CS 3 3rd period
i do not like diameter, & some of the code (diameter & leaves) I got help with
 */

public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val) {
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree) {
		if (tree == null) {
			return new TreeNode(val);
		}

		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);

		if (dirTest < 0) {
			tree.setLeft(add(val, tree.getLeft()));
		} else if (dirTest > 0) {
			tree.setRight(add(val, tree.getRight()));
		}

		return tree;
	}

   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}


	//add preOrder, postOrder, and revOrder

	public void preOrder(){
		preOrder(root);
		System.out.println("\n\n");
	}
	public void preOrder(TreeNode tree) {
		if (tree != null) {
			System.out.print(tree.getValue() + " ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}

	public void postOrder(){
		postOrder(root);
		System.out.println("\n\n");
	}
	private void postOrder(TreeNode tree) {
		if (tree != null) {
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			// i over complicated this the first time for no reason
			System.out.print(tree.getValue() + " ");
		}
	}


	public void revOrder(){
		revOrder(root);
		System.out.println("\n\n");
	}

	public void revOrder(TreeNode node){
		if(node != null){

			revOrder(node.getRight());
			System.out.print(node.getValue() + " ");

			revOrder(node.getLeft());
		}
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;

		else if(getNumLevels(tree.getLeft()) > getNumLevels(tree.getRight()))
			return 1 + getNumLevels(tree.getLeft());
		else
			return 1 + getNumLevels(tree.getRight());
	}

	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	// the nicest method out of all of them
	public int getHeight(){
		return getNumLevels() - 1;
	}

	//to do: fix the getDiameter, getNumNodes





	private int getNumLeaves(TreeNode node) {
		if(node.getLeft() != null && node.getRight() != null){
			return getNumLeaves(node.getLeft()) + getNumLeaves(node.getRight());

		} else if(node.getLeft() != null){
			return getNumLeaves(node.getLeft());

		} else if(node.getRight() != null){
			return getNumLeaves(node.getRight());
		}

		return 1;
	}

	public int getNumLeaves(){
		return getNumLeaves(root);
	}




	// another nice method to code
	private boolean isFull(TreeNode node) {
		if(node.getLeft() != null && node.getRight() != null){
			return isFull(node.getLeft()) && isFull(node.getRight());
		}
		else {
			return node.getLeft() == null && node.getRight() == null;
		}
	}

	public boolean isFull(){
		return isFull(root);
	}


	private int getNumNodes(TreeNode node) {
		if(node.getLeft() != null && node.getRight() != null){
			return getNumNodes(node.getLeft()) + getNumNodes(node.getRight()) + 1;
		} else if(node.getLeft() != null){
			return getNumNodes(node.getLeft()) + 1;
		} else if(node.getRight() != null){
			return getNumNodes(node.getRight()) + 1;
		}
		return 1;
	}

	public int getNumNodes(){
		return getNumNodes(root);
	}


	private int getDiameter(TreeNode node){
		// total hours spent: 3
		int leftHeight, rightHeight;
		if (node == null) {
			return 0;
		}

			leftHeight = getHeight(node.getLeft());
			rightHeight = getHeight(node.getLeft());

		int leftDiameter = getDiameter(node.getLeft());
		int rightDiameter = getDiameter(node.getRight());

		return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
	}

	public int getDiameter() {
		return getDiameter(root);
	}

	private int getHeight(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int leftHeight = getHeight(node.getLeft());
		int rightHeight = getHeight(node.getRight());

		return Math.max(leftHeight, rightHeight) + 1;
	}





	// I dont have the will to do the extra credit
	//add extra credit options here - 10 points each
	
	//search
	
	//maxNode
	
	//minNode
	
	//level order
	
	//display like a tree
	
	//remove


	public String toString()
	{
		return "";
	}

	private String toString(TreeNode tree)
	{
		if(tree.getLeft() != null && tree.getRight() != null){
			return toString(tree.getLeft()) + " " + tree.getValue() + " " +  toString(tree.getRight());

		} else if(tree.getLeft() != null){
			return getNumNodes(tree.getLeft()) + " " + tree.getValue();

		} else if(tree.getRight() != null){
			return tree.getValue() + " " + toString(tree.getRight());

		}
		return tree.getValue().toString();	}
}