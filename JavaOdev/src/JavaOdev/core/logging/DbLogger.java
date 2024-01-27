package JavaOdev.core.logging;

public class DbLogger implements Logger{

	@Override
	public void Log(String message) {
		System.out.println("db'ye " + message);
	}

}
