package miniProjectFindNumber;

public class Main {

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int aloneNumber = 5;
		boolean isThere = false;

		for (int number : numbers) {
			if (number == aloneNumber) {
				isThere = true;
				break;
			}
		}

		if (isThere) {
			System.out.println("The number has been found.");
		} else {
			System.out.println("The number has not been found.");
		}
	}

}
