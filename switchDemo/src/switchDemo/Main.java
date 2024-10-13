package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch (grade) {
			case 'A':
				System.out.println("Astonishing! You have passed!");
				break;
			case 'B':
			case 'C':
				System.out.println("Fine work! You have passed!");
				break;
			case 'D':
				System.out.println("Good, You have passed!");
				break;
			case 'F':
				System.out.println("Unfortunately, You have failed.");
				break;
			default:
				System.out.println("Entered invalid grade.");
		}
	}

}
