package oopWithNLayeredAppDemo.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Log sent to e-mail : " + data);
	}

}
