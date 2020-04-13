package question6;

public class StarWarsShips extends SpaceShip {
    public StarWarsShips (int weight, String shipName) {
        tonnage = weight;
        name = shipName;
    }
    public String getFranchise() {
        return "Star Wars";
    }
}
