package exceptions;

public class IIlegalArgumentExceptions {

	public void setMarks(int mark) {
		if (mark < 0 || mark > 100) {
			throw new IllegalArgumentException("Please enter a mark between 0 to 100");
		} else {
			System.out.println("Your mark is..." + mark);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IIlegalArgumentExceptions iae = new IIlegalArgumentExceptions();
		// iae.setMarks(45);
		iae.setMarks(101);
		//iae.setMarks(0);

	}

}
