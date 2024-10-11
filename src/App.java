
public class App {

	public static void main(String[] args) {
		//calling on my log classes
		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();

		//Test AsteriskLogger
		System.out.println("Testing AsteriskLogger:");
		asteriskLogger.log("Hello");
		asteriskLogger.error("World");

		System.out.println(); // Add a blank line for readability

		// Test SpacedLogger
		System.out.println("Testing SpacedLogger:");
		spacedLogger.log("Hello");
		spacedLogger.error("World");
	}

}
