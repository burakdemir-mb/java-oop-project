package overriding;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] creditManagers = new BaseCreditManager[] { new TeacherCreditManager(),
				new AgriCreditManager(), new StudentCreditManager() };

		for (BaseCreditManager creditManager : creditManagers) {
			System.out.println(creditManager.Calculate(1000));
		}
	}

}
