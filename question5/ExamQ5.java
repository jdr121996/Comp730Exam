package question5;

public class ExamQ5 {
	public static void main(String[] args) {
		ExamSingleton examSingleton = ExamSingleton.createInstance();
		System.out.print(examSingleton.tellJoke());
	}
}