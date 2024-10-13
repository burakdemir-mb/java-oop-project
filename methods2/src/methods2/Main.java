package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Weather is so nicely!";
		String newMessage = provideCity();
		System.out.println(newMessage);

		int number = sum(15, 7);
		System.out.println(number);

		int total = sum2(2, 3, 4, 5, 6, 10);
		System.out.println(total);
	}

	public static void add() {
		System.out.println("Added successfully.");
	}

	public static void remove() {
		System.out.println("Removed successfully.");
	}

	public static void update() {
		System.out.println("Updated successfully.");
	}

	public static int sum(int number1, int number2) {
		return number1 + number2;
	}

	public static int sum2(int... numbers) {
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public static String provideCity() {
		return "Ankara";
	}
}
