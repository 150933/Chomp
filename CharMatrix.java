/*
 * Implements a 2-D array of characters
 */

public class CharMatrix
{

	char[][] theMatrix;
	
	
  /*
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  
  public CharMatrix(int rows, int cols)
  {
    theMatrix = new char[rows][cols];
  }

  /*
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill  character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
	  theMatrix = new char[rows][cols];
	  fillRect(0, 0, rows, cols, fill);
  }

  /*
   * Returns the number of rows in grid
   */
  
  public int numRows()
  {
    return theMatrix.length;
  }

  /*
   * Returns the number of columns in grid
   */
  public int numCols()
  {
	  return theMatrix[0].length;
  }

  /*
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
	  return theMatrix[row][col];
  }

  /*
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
	  
    theMatrix[row][col]=ch;
    
  }

  /*
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
	  if (theMatrix[row][col]== ' ')
	  {
		  return true;
	  }
	  
	  else 
	  {
		  return false;
	  }
  }

  /*
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    for (int i = row0; i<col0; i++)
    {
    	for (int j=col0; j<col1; j++)
    	{
    		theMatrix[i][j]=fill;
    	}
    }
  }

  /*
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
	  fillRect(row0, col0, row1, col1, ' ');
  }

  /*x
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
	  int counter = 0;
	    
	    for (int i = 0; i < theMatrix[row].length; i++) {
	    	if (theMatrix[row][i] != ' ') {
	    		counter ++;
	    	}
	    }
	    
	    return counter;
  }

  /*
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
	  int counter = 0;
	    
	    for (int i = 0; i < theMatrix.length; i++) {
	    	if (theMatrix[i][col] != ' ') {
	    		counter ++;
	    	}
	    }
	    
	    return counter;
  }
}
