package Assignment3;
/**
 * An exception that indicates the content within the file is invalid
 * @author Tuan To
 * @student_id 40114920
 * @course COMP 249 Section S
 */
public class FileInvalidException extends Exception{

	/**
	 * Default serial version ID to keep Eclipse happy!
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Default constructor for FIleInvalidException
	 * Output the default message
	 */
	public FileInvalidException() {
		super("Error: Input file cannot be parsed due to missing information (i.e. month={}, title={}, etc.)");
	}
	
	/**
	 * Parameterized constructor to ouptput custom message
	 * @param Custom message
	 */
	public FileInvalidException(String msg) {
		super(msg);
	}
}
