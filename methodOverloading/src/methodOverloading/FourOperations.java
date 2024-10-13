package methodOverloading;

public class FourOperations {

	public int sum(int number1, int number2) {
		return number1 + number2;
	}

	public int sum(int number1, int number2, int number3) {
		return number1 + number2 + number3;
	}

	public int sum(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

}
