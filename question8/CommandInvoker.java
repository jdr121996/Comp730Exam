package question8;

public class CommandInvoker implements CommandInterface {
	// Create new player
	Player newPlayer;
	
	public CommandInvoker(Player newPlayer) {
		this.newPlayer = newPlayer;
	}
	
	@Override
	public void execute() {
		if (newPlayer.randomNum == 1) {
			newPlayer.MoveNorth();
			newPlayer.count = newPlayer.count - 1;
			System.out.println("Player moved north \nTheir coordinates are: (" + newPlayer.xCoord + "," + newPlayer.yCoord + ")"); 
		}
		else if (newPlayer.randomNum == 2) {
			newPlayer.MoveEast();
			newPlayer.count = newPlayer.count - 1;
			System.out.println("Player moved east \nTheir coordinates are: (" + newPlayer.xCoord + "," + newPlayer.yCoord + ")");
		}
		else if (newPlayer.randomNum == 3) {
			newPlayer.MoveSouth();
			newPlayer.count = newPlayer.count - 1;
			System.out.println("Player moved south \nTheir coordinates are: (" + newPlayer.xCoord + "," + newPlayer.yCoord + ")");
		}
		else {
			newPlayer.MoveWest();
			newPlayer.count = newPlayer.count - 1;
			System.out.println("Player moved west \nTheir coordinates are: (" + newPlayer.xCoord + "," + newPlayer.yCoord + ")");
		}
	}

	@Override
	public boolean undo() {
		if (newPlayer.count == 0) {
			return false;
		}
		else {
			return true;
		}
	}
}