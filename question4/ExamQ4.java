package question4;

import java.util.Scanner;

public class ExamQ4 {
	public static void main(String[] args) {
		StringReverse reversedOutput = new StringReverse();
		System.out.print("Enter input string to reverse: ");		
		try (Scanner manualInput = new Scanner(System.in)) {
			String inputStr = manualInput.nextLine();
			System.out.println(reversedOutput.reverseString(inputStr));
		}
	}
}