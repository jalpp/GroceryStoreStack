import java.util.ArrayList;

/**
 * 
 * @author Jalp
 *
 *This class represents a stack storage in a grocery store, it has stack height, width and number of rows for the products to be stored in 
 *
 *
 *
 */

public class Stack3D {
	
    	
 
	private int height;
	
	private int width;
	
	private int numRows;
	
	
    private ArrayList<Integer> stackHeight;
    
    private ArrayList<Integer> stackWidth;
    
    private ArrayList <Product> stackNumRows;
    
    
    public Stack3D() {
    	this.height = 0;
    	this.width = 0;
    	this.numRows = 0;
    }
	
	
	public Stack3D(int height, int width, int numRows) {
		this.height = height;
		
		this.numRows = numRows;
		
		this.width = width;
		
		this.stackHeight = new ArrayList<Integer>(height);
		
		this.stackWidth = new ArrayList<Integer>(width);
		
		this.stackNumRows = new ArrayList<Product>(numRows);
		
		
		
	}

	
	

	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getNumRows() {
		return numRows;
	}


	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}


	public ArrayList<Integer> getStackHeight() {
		return stackHeight;
	}


	public void setStackHeight(ArrayList<Integer> stackHeight) {
		this.stackHeight = stackHeight;
	}


	public ArrayList<Integer> getStackWidth() {
		return stackWidth;
	}


	public void setStackWidth(ArrayList<Integer> stackWidth) {
		this.stackWidth = stackWidth;
	}


	public ArrayList<Product> getStackNumRows() {
		return stackNumRows;
	}


	public void setStackNumRows(ArrayList<Product> stackNumRows) {
		this.stackNumRows = stackNumRows;
	}


	@Override
	public String toString() {
		return "Stack3D [height=" + height + ", width=" + width + ", numRows=" + numRows + ", stackHeight="
				+ stackHeight + ", stackWidth=" + stackWidth + ", stackNumRows=" + stackNumRows + "]";
	}
	
	
	
	
	
	
	
	
}
