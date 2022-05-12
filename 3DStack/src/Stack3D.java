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
	
    // Common attributes for a grocery store 3D stack object  	
 
	private int height;
	
	private int width;
	
	private int numRows;
	
	
    private ArrayList<Integer> stackHeight;
    
    private ArrayList<Integer> stackWidth;
    
    private ArrayList <Product> stackNumRows;
    
    
    // creating a garbage 3D stack object
    
    public Stack3D() {
    	this.height = 0;
    	this.width = 0;
    	this.numRows = 0;
    	
    	this.stackHeight = null;
    	
    	this.stackWidth = null;
    	
    	this.stackNumRows = null;
    	
    }
    
    
	// creating actual 3D stack storage object
	
	public Stack3D(int height, int width, int numRows) {
		this.height = height;
		
		this.numRows = numRows;
		
		this.width = width;
		
		this.stackHeight = new ArrayList<Integer>(height);
		
		this.stackWidth = new ArrayList<Integer>(width);
		
		this.stackNumRows = new ArrayList<Product>(numRows);
		
		
		
	}

	
	// getters and setters for the instance variables
	

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
	
	
	
	// This are 3D version of stack operations 
	// starting with the number of products which are inside the 3D stack storage
	
	
	/**
	 * Check if the 3D stack has products or not
	 * @return status of number of products
	 */
	
	public boolean emptyProduct() {
		return this.stackNumRows.isEmpty();
	}
	
	
	/**
	 * Looks at the object ar the front of product stack
	 * @return the product at the front of the products stack
	 */
	
	public Product peekProduct() {
		return this.stackNumRows.get(0);
	}
	
	
	/**
	 * Removes the product at the front of the stack
	 * @return the product which was removed
	 */
	
	
    public Product popProduct() {
    	
    	Product poped = new Product(this.stackNumRows.get(0));
    	
    	this.stackNumRows.remove(0);
    	
    	return poped;
    	
    }
    
    /**
     * Adds product at the front of the stack
     * @param p
     * @return the product which was added 
     */
    
    public Product pushProduct(Product p) {
    	this.stackNumRows.add(p);
    	
    	return p;
    }
    
     
    // This are Stack operations for adding 1 layer of cabinet to upper layer of stack
    
    
    
    /**
     * Returns true or false depending if the height of the 3D stack is zero
     * @return
     */
    
    public boolean emptyHeight() {
    	return this.stackHeight.isEmpty();
    }
    
    /**
	 * Looks at the object at the next Upward Cabinet
	 * @return the cabinet at the front of the next cabinet
	 */
    
    
    public Integer peekNextUpwardCabinet() {
    	return this.stackHeight.get(0);
    }
    
    
    
    
	
	
	
	
	
	
	/**
	 * String representation of the 3D stack object
	 */


	@Override
	public String toString() {
		return "Stack3D [height=" + height + ", width=" + width + ", numRows=" + numRows + ", stackHeight="
				+ stackHeight + ", stackWidth=" + stackWidth + ", stackNumRows=" + stackNumRows + "]";
	}
	
	
	
	
	
	
	
	
}
