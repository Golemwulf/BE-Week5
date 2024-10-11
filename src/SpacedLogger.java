
public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
//		Called on the addSpaces method to print the log) 
		System.out.println(addSpaces(log));

	}

	@Override
	public void error(String log) {
//		Called on the addSpaces method to print the log) 
		System.out.println("ERROR: " + addSpaces(log));
	}
	//Used a loop to generate spaces between each character of the string, then appended it using a string builder. 
	private String addSpaces(String str) {
		StringBuilder spaced = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			spaced.append(str.charAt(i));
			if (i < str.length() - 1) {
				spaced.append(" ");
			}
		}
		return spaced.toString();

	}
}