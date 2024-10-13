package reCapDemo1;

public class Main {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 25;
		int num3 = 4;		
		
		int greatNum = num1;
		
		if(greatNum < num2){
			greatNum = num2;
		}
		else if(greatNum < num3){
			greatNum = num3;
		}
		
		System.out.println("greater number is "+ greatNum);
		
	}

}
