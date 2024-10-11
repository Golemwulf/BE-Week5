
public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {
	// used simple cancatenation to build the proper output. I did the same for the error method below.  
	System.out.println("***" +  log + "***");
		
	}

	@Override
	public void error(String log) {
		System.out.println("***Error: " +  log + "***");
		
	}

	
}