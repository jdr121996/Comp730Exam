package question8;

public class Player {
	int count = 50;
	int randomNum = 0;
	int xCoord = 0;
	int yCoord = 0;
	
	public void MoveEast() {
		xCoord = xCoord + 1;
	}
	public void MoveWest() {
		xCoord = xCoord - 1;
	}
	public void MoveNorth() {
		yCoord = yCoord + 1;
	}
	public void MoveSouth() {
		yCoord = yCoord - 1;
	}
}