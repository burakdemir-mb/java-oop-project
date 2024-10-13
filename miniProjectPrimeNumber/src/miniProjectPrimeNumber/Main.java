package miniProjectPrimeNumber;

public class Main {

	public static void main(String[] args) {

		int number = 15;
		int i = 2;

		if (number < 1) {
			System.out.println("Gecersiz sayi girildi.");
		} else if (number == 1) {
			System.out.println("Sayi asal degildir.");
			// if-else karisikligi yapmamak icin ustteki iki kosulu iki ayri if yapip return atilabilir.
		} else {
			while (number % i != 0) {
				i++;
			}

			if (i == number) {
				System.out.println("Sayi asaldir.");
			} else if (i != number) {
				System.out.println("Sayi asal degildir.");
			}
		}
	}
}
