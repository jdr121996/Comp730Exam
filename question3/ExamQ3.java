package question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ExamQ3 {
	public static void main(String[] args) {
		int count;
		int randomNum;
		int finalSum = 0;

		// Create array list to add to
		List<Integer> numList = new ArrayList<Integer>();
		
		// Create random number generator object
		Random randomGen = new Random();

		// Loop 10 times and add to list
		for (count = 1; count < 11; count++) {
			randomNum = randomGen.nextInt(10) + 1;
			System.out.println("The random number = " + randomNum);
			System.out.println("This is the count: " + count);
			numList.add(randomNum);
		}
		
		if (count == 11) {
			for (int i = 0; i < numList.size(); i++) {
				int tempInt = numList.get(i);
				finalSum = finalSum + tempInt;
			}
		}
		System.out.println(finalSum);
	}
}