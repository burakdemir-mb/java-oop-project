package reCapDemo_Classes;

public class FourOperations {
	public int Sum(int number1, int number2) {
		return number1 + number2;
	}

	public int Subtract(int number1, int number2) {
		return number1 - number2;
	}

	public int Multiply(int number1, int number2) {
		return number1 * number2;
	}

	public int Divide(int number1, int number2) {
		// Exception management for number2 when number2 is 0.
		return number1 / number2;
	}
}
