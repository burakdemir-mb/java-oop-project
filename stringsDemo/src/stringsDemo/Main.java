package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugun hava cok hos.";
		System.out.println(mesaj);

		System.out.println("Eleman sayisi : " + mesaj.length());
		System.out.println("5. Eleman : " + mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yasasin!"));
		System.out.println(mesaj.startsWith("B")); // case sensitive
		System.out.println(mesaj.startsWith("b")); // case sensitive
		System.out.println(mesaj.endsWith("."));

		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); // srcEnd doesn't contain given last value
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('a'));
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("o"));
		System.out.println(mesaj.lastIndexOf("a"));

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2, 5));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

		// System.out.println(mesaj.trim());

	}

}
