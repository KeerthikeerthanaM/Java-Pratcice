package stackImplementation;

public class Stack {
	char[] arr = new char[3];
	char tos;

	Stack() {
		tos = (char) -1;
	}

	void push(char element) {
		if (tos == 3) {
			System.out.println("Stack is full.......");
		} else {
			arr[++tos] = element;

		}
	}

	void pop() {
		if (tos >= 0) {

			System.out.println("The popped letter is: "+arr[tos--]);
//		  return arr[tos--];

		} else {
			System.out.println("Stack is empty...........");

		}
	}

	public void view() {

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	void size() {
		System.out.println(" size : " + arr.length);

	}


}
