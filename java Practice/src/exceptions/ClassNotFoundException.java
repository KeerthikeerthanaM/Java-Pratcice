package exceptions;

public class ClassNotFoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("Happy");
			System.out.println("HIIIIIII");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
