package overriding;

public class StudentCreditManager extends BaseCreditManager {
	public final double Calculate(double amount) {
		return amount * 1.10;
	}
}
