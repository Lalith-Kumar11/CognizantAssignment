package SingletonPattern;

public class Logger {
	private static Logger instance;
	
	private Logger() {
		System.out.println("Logger Initiated");
	}
	
	public static Logger getInstance() {
		
		if(instance==null) {
			instance = new Logger();
		}
		
		return instance;
	}
	
	public void displayLog(String str) {
		
		System.out.println(str);
	}
	
	
}
