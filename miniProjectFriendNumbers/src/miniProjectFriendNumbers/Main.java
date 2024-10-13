package miniProjectFriendNumbers;

public class Main {

	public static void main(String[] args) {
		// 220-284

		int numberOne = 220;
		int numberTwo = 284;
		int totalOne = 0;
		int totalTwo = 0;

		for (int i = 1; i < numberOne; i++) {
			if (numberOne % i == 0) {
				totalOne += i;
			}
		}

		for (int i = 1; i < numberTwo; i++) {
			if (numberTwo % i == 0) {
				totalTwo += i;
			}
		}

		if (numberOne == totalTwo && numberTwo == totalOne) {
			System.out.println("This numbers are friend.");
		} else {
			System.out.println("This number are not friend.");
		}

	}
}
