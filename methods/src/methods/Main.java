package methods;

public class Main {

	public static void main(String[] args) {
		findNumber();
	}

	public static void findNumber() {
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
			giveMessage("The number has been found: " + aloneNumber);
		} else {
			giveMessage("The number has not been found: " + aloneNumber);
		}
	}

	public static void giveMessage(String message) {
		System.out.println(message);
	}
}
