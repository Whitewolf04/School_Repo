package Assignment4;
import java.util.NoSuchElementException;

/**
 * This is the linked list class for Cell Phones
 * @author Tuan To
 * @student_id 40114920
 * @course COMP 249 Section S
 */

public class CellList {
	/**
	 * This is the inner class for each Node
	 */
	public class CellNode{
		private CellPhone cell;
		private CellNode link;
		
		/**
		 * Default constructor creating an empty node
		 * Set all attributes to null
		 */
		public CellNode() {
			cell = null;
			link = null;
		}
		
		/**
		 * Parameterized constructor
		 * @param cell A new cell phone
		 * @param link A link to the next node
		 */
		public CellNode(CellPhone cell, CellNode link) {
			this.cell = cell;
			this.link = link;
		}
		
		/**
		 * Copy constructor
		 * @param otherNode
		 */
		public CellNode(CellNode otherNode) {
			this.cell = new CellPhone(otherNode.cell, otherNode.cell.getSerialNum());
			this.link = otherNode.link;
		}
		
		/**
		 * Clone method
		 * @return A deep copy of the called node
		 */
		public CellNode Clone() {
			return(new CellNode(this));
		}
		
		/**
		 * getCellPhone method to get the CellPhone variable of the node
		 * @return CellPhone
		 */
		public CellPhone getCellPhone() {
			return(new CellPhone(this.cell, this.cell.getSerialNum()));
		}
		
		/**
		 * getLink method to get the link to the next node
		 * @return CellNode
		 */
		public CellNode getLink() {
			return this.link;
		}
		
		/**
		 * setCellPhone method to change the CellPhone in the current node
		 * @param otherCell Another CellPhone
		 * @param serial Serial number of another CellPhone
		 */
		public void setCellPhone(CellPhone otherCell, long serial) {
			this.cell = new CellPhone(otherCell, serial);
		}
		
		/**
		 * setLink method to set the link of the current node
		 * @param otherLink Another link to a different node
		 */
		public void setLink(CellNode otherLink) {
			this.link = otherLink;
		}
	}
	
	private CellNode head;
	private int size;
	
	/**
	 * Default constructor to set all attributes to null
	 */
	public CellList() {
		head = null;
		size = 0;
	}
	
	/**
	 * Copy constructor to copy from another list
	 * @param otherList Another list
	 */
	public CellList(CellList otherList) {
		CellNode position = otherList.head;
		while(position != null) {
			addToStart(position.cell);
			position = position.link;
			size++;
		}
	}
	
	/**
	 * Adding an element to the start of the linked list
	 * @param cell A CellPhone variable
	 */
	public void addToStart(CellPhone cell) {
		head = new CellNode(cell, head);
		size++;
	}
	
	/**
	 * Inserting an element to a specified index in the list
	 * @param index The index specified
	 * @param cell A CellPhone variable
	 * @throws NoSuchElementException Throws an exception if the index doesnt exist
	 */
	public void insertAtIndex(int index, CellPhone cell) throws NoSuchElementException{
		CellNode newNode = new CellNode(cell, null);
		// Check if the index is invalid
		if(index < 0 || index > size-1) {
			System.out.println("Index Invalid!!");
			throw new NoSuchElementException();
		}
		// Check if the user wants to add to the head
		if(index == 0) {
			addToStart(cell);
			size++;
			return;
		}
		// Otherwise
		CellNode previousPos = head;
		CellNode position = head.link;
		int count = 1;
		// Move the pointers to the right index
		while(index != count) {
			previousPos = previousPos.link;
			position = position.link;
			count++;
		}
		previousPos.link = newNode;
		newNode.link = position;
		size++;
	}
	
	/**
	 * Deleting from a specified index
	 * @param index The specified index
	 * @throws NoSuchElementException Throws an exception if the index doesn't exist
	 */
	public void deleteFromIndex(int index) throws NoSuchElementException{
		// Check if the index is invalid
		if(index < 0 || index > size-1) {
			System.out.println("Index Invalid!!");
			throw new NoSuchElementException();
		}
		// Check if the user wants to delete the first node
		if(index == 0) {
			head = head.link;
			size--;
			return;
		}
		CellNode previousPos = head;
		CellNode position = head.link;
		int count = 1;
		// Move the pointer to the right index
		while(index != count) {
			previousPos = previousPos.link;
			position = position.link;
			count++;
		}
		previousPos.link = position.link;
		size--;
	}
	
	/**
	 * Deleting from the start of the list (the head node)
	 */
	public void deleteFromStart() {
		head = head.link;
		size--;
	}
	
	/**
	 * Replacing the element at a specified index of the linked list
	 * @param index The specified index
	 * @param cell A CellPhone variable that will replace the current element
	 */
	public void replaceAtIndex(int index, CellPhone cell){
		// Check if the index is invalid
		if(index < 0 || index > size-1) {
			System.out.println("Index Invalid!!");
			return;
		}
		deleteFromIndex(index);
		insertAtIndex(index, cell);
	}
	
	/**
	 * Finds a certain serial number of CellPhone inside the list
	 * @param serial The serial looking for
	 * @return A deep copy of the CellNode containing the CellPhone looking for
	 */
	public CellNode find(long serial) {
		int count = 0;
		CellNode position = head;
		boolean found = false;
		while(position != null) {
			if(position.cell.getSerialNum() == serial) {
				found = true;
				break;
			}
			position = position.link;
			count++;
		}
		if(found == true) {
			System.out.println("Number of Iteration: " + count + " times");
			return position.Clone();
		} else {
			return null;
		}
	}
	
	/**
	 * Check if the list contains a certain CellPhone with the specified serial number
	 * @param serial The serial number specified
	 * @return A boolean value of whether the list contains it or not
	 */
	public boolean contains(long serial) {
		CellNode position = head;
		boolean contain = false;
		while(position != null) {
			if(position.cell.getSerialNum() == serial) {
				contain = true;
				break;
			}
			position = position.link;
		}
		return contain;
	}
	
	/**
	 * Checking if the list contains a duplicate of a certain CellPhone
	 * @param cell A CellPhone value that is being checked for duplicate
	 * @return A boolean value of whether the list contains it or not
	 */
	public boolean containsDuplicate(CellPhone cell) {
		CellNode position = head;
		boolean contain = false;
		while(position != null) {
			if(position.cell.equals(cell)) {
				contain = true;
				break;
			}
			position = position.link;
		}
		return contain;
	}
	
	/**
	 * Showing all contents of the list to display
	 */
	public void showContents() {
		int count = 0;
		CellNode position = head;
		while(position != null) {
			System.out.print("[" + position.cell.toString() + "] ---> ");
			count++;
			if(count == 3) {
				System.out.println();
				count = 0;
			}
			position = position.link;
		}
		System.out.println("X");
	}
	
	/**
	 * Checking if two linked lists are equal to each other
	 * @param otherObj Another linked list being compared to the current linked list
	 * @return A boolean value of whether they are equal or not
	 */
	public boolean equals(Object otherObj) {
		if(otherObj == null) {
			return false;
		} else if(getClass() != otherObj.getClass()) {
			return false;
		} else {
			CellList otherList = (CellList) otherObj;
			CellNode thisPos = head;
			CellNode otherPos = otherList.head;
			boolean equal = true;
			if(otherList.size != size) {
				equal = false;
			} else {
				while(thisPos != null) {
					if(!thisPos.cell.equals(otherPos.cell)) {
						equal = false;
					}
					thisPos = thisPos.link;
					otherPos = otherPos.link;
				}
			}
			return equal;
		}
	}
}
