package question6;

public class StarTrekShips extends SpaceShip {
	public StarTrekShips (int weight, String shipName) {
		tonnage = weight;
        name = shipName;
	}
public String getFranchise() {
	return "Star Trek";
	}
}