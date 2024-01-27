package JavaOdev.core.logging;

public class FileLogger implements Logger{

	@Override
	public void Log(String message) {
		System.out.println("dosyaya " + message);
	}
}
