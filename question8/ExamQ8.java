package question8;

import java.util.Random;

public class ExamQ8 {
	public static void main(String[] args) {
		// Create player, commandinvoker, and random class
		Player createPlayer = new Player();
		CommandInvoker commandInvoker = new CommandInvoker(createPlayer);
		Random randomGen = new Random();
		
		// Create newLine separator.
		String newLine = System.getProperty("line.separator");
		
		// Create count to show which number we're at
		int invokerCount = 0;
		
		while (createPlayer.count > 0) {
			invokerCount = invokerCount + 1;
			createPlayer.randomNum = randomGen.nextInt(4) + 1;
			System.out.println("The count is at: " + invokerCount);
			System.out.println("The random number is: " + createPlayer.randomNum);
			commandInvoker.execute();
			if (commandInvoker.undo() == false) {
				System.out.println("The player's final coordinates are: " + "(" + createPlayer.xCoord + "," + createPlayer.yCoord + ")");
				createPlayer.xCoord = 0;
				createPlayer.yCoord = 0;
				System.out.println("After undoing the changes the player's coordinates are now: " + "(" + createPlayer.xCoord + "," + createPlayer.yCoord + ")");
			}
			System.out.println(newLine);
		}
	}
}