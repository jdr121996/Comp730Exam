package question5;

class ExamSingleton {
	// Lazy Initialization of ExamSingleton class
	private static ExamSingleton singleInstance;
	
	// Create string for line separators
	String newLine = System.getProperty("line.separator");
	
	// Create badJoke string for declaration in constructor
	private String badJoke;
	
	private ExamSingleton() {
		// Private constructor
		badJoke = "What did the fish say when he swam into the wall?" + newLine + newLine + "Dam";
	}
	
	// Only method to return instance of singleton
	public static ExamSingleton createInstance() {
		if (singleInstance == null) {
			// If the instance is null, initialize
			singleInstance = new ExamSingleton();
		}
		return singleInstance;
	}
	
	public String tellJoke() {
		return badJoke;
	}
}