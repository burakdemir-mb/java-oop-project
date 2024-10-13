package methodOverloading;

public class Main {

	public static void main(String[] args) {
		FourOperations fourOperations = new FourOperations();
		System.out.println(fourOperations.sum(1, 5));
		System.out.println(fourOperations.sum(1, 5, 6));
		System.out.println(fourOperations.sum(1, 2, 3, 4, 5, 6));
	}

}
