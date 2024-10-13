package loopDemo;

public class Main {

	public static void main(String[] args) {

		//for
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For loop is over.");
		
		//while
		int i=2;
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println("While loop is over.");
		
		//do-while
		int j=1;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While loop is over.");
	}

}
