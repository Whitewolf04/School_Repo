package Assignment4;

/**
 * Represents a cell phone
 * @author Tuan To
 * @student_id 40114920
 * @course COMP 249 Section S
 */

public class CellPhone {
	private long serialNum;
	private int year;
	private String brand;
	private double price;
	
	/**
	 * Parameterized constructor
	 * @param serial The serial number of the cell phone
	 * @param brand The brand of the cell phone
	 * @param year The year introduced of the cell phone
	 * @param price The price of the cell phone
	 */
	public CellPhone(long serial, String brand, int year, double price) {
		serialNum = serial;
		this.brand = brand;
		this.year = year;
		this.price = price;
	}
	
	/**
	 * Copy constructor of CellPhone
	 * @param otherCell Another CellPhone that is being copied
	 * @param serial The serial number to ensure the uniqueness in serial number
	 */
	public CellPhone(CellPhone otherCell, long serial) {
		serialNum = serial;
		this.brand = otherCell.brand;
		this.year = otherCell.year;
		this.price = otherCell.price;
	}
	
	/**
	 * Getting the serial number of the current cell phone
	 * @return The serial number
	 */
	public long getSerialNum() {
		return serialNum;
	}
	
	/**
	 * Setting the serial number of the current cell phone
	 * @param serialNum The replacing serial number
	 */
	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}
	
	/**
	 * Getting the introduced year of the cell phone
	 * @return The introduced year
	 */
	public int getYear() {
		return year;
	}
	
	/**
	 * Setting the introduced year of the cell phone
	 * @param year Another year
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Getting the brand of the cell phone
	 * @return The brand of the cell phone
	 */
	public String getBrand() {
		return brand;
	}
	
	/**
	 * Setting the brand of the cell phone
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * Getting the price of the cell phone
	 * @return The price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Setting the price of the cell phone
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Creating a deep copy of the CellPhone
	 * @param serial A new serial number to ensure the uniqueness of the serial
	 * @return The deep copy of the CellPhone
	 */
	public CellPhone Clone(long serial) {
		CellPhone temp = new CellPhone(this, serial);
		return temp;
	}
	
	/**
	 * Comparing 2 CellPhones with each other
	 * @param otherObj Another Object
	 * @return A boolean value of whether the Object passed in is equal to the current cell phone
	 */
	public boolean equals(Object otherObj) {
		if(otherObj == null) {
			return false;
		} else if(getClass() != otherObj.getClass()) {
			return false;
		} else {
			CellPhone otherCell = (CellPhone) otherObj;
			return(brand.equals(otherCell.brand) && price == otherCell.price && year == otherCell.year);
		}
	}
	
	/**
	 * Print out all attributes of the current CellPhone
	 * @return A string of all attributes
	 */
	public String toString() {
		return(serialNum + ": " + brand + " " + price + "$ " + year);
	}
}
