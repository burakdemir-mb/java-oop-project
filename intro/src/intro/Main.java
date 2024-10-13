package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hi!");

		//camelCase
		String ortaMetin ="Ilginizi Cekebilir?";
		String altMetin ="Vade suresi";
		
		System.out.println(ortaMetin + " " + altMetin);
		
		int vade = 12;
		
		double dolarYesterday = 18.14;
		double dolarToday = 18.14;
		
		char character = 'A';
		
		boolean isDolarDown = false;
		
		String currencyStatus= "";
		
		if (dolarToday < dolarYesterday) {
			currencyStatus = "down.svg";
			System.out.println(currencyStatus);
		} else if(dolarToday > dolarYesterday) {
			currencyStatus = "up.svg";
			System.out.println(currencyStatus);
		}
		else {
			currencyStatus = "equal.svg";
			System.out.println(currencyStatus);
		}
		
		String[] credits = {"Fast Credit","for Regulars","Happy Retired"};
		
		for (int i = 0; i < credits.length; i++) {
			System.out.println(credits[i]);
		}
	
	}

}
