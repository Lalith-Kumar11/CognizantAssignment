package SingletonPattern;

public class Main {

	public static void main(String args[]) {
		Logger log1 = Logger.getInstance();
		log1.displayLog("First Logger is initiated");
		
		
		Logger log2=Logger.getInstance();
		log2.displayLog("Second Logger is initiated");
		
		
		if(log1==log2) {
			System.out.println("Logger1 and logger2 has same instance");
		}
		else {
			System.out.println("Different Logger Identified,Singleton Failed");
		}
		
	}
	
	
}
