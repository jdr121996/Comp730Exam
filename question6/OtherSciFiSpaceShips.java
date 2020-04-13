package question6;

public class OtherSciFiSpaceShips extends SpaceShip {
	public OtherSciFiSpaceShips (int weight, String shipName) {
		tonnage = weight;
        name = shipName;
	}
public String getFranchise() {
	// Halo by Bungie (Video Game Series)
	return "Halo"; 
	}
}