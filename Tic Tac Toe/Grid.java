//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

public class Grid
{
	private Cell[][] grid;
	
	public Grid()
	{
		setSize(0,0);
	}

	public Grid(int rows, int cols)
	{
		setSize(rows, cols);
	}

	public void setSize(int rows, int cols)
	{
		grid = new Cell[rows][cols];
	}

	public void setSpot(int row, int col, Cell val)
	{
		grid[row][col] = val;
	}
	
	public Cell getSpot(int row, int col)
	{
		return grid[row][col];
	}
	
	public int getNumRows()
	{
		return grid.length;
	}
	
	public int getNumCols()
	{
		if (grid.length > 0) {
			return grid[0].length;
		} else {
			return 0;
		}
	}

	public boolean drawGrid(Graphics window)
	{
		boolean full=true;
		

		for (int row = 0; row < grid.length; row++)
		{
			for (int col = 0; col < grid[row].length; col++)
			{
				Cell currentCell = getSpot(row, col);

				if (currentCell != null)
				{
					Piece thingy = (Piece) grid[row][col];
					thingy.draw(window);
				}
				else
				{
					full = false;
				}
			}
		}

		return full;
	}


	public String toString() {
		String output = "";
		for (int row = 0; row < getNumRows(); row++) {
			for (int col = 0; col < getNumCols(); col++) {
				if( (Piece) grid[row][col] != null){
					output = grid[row][col].toString();
				}
			}
		}

		return output;
	}
}