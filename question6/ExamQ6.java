package question6;

import java.util.ArrayList;

public class ExamQ6 {
	public static void main(String[] args) {
		ArrayList<SpaceShip> shipList = new ArrayList<SpaceShip>();

		StarWarsShips starWarsShip1 = new StarWarsShips(150, "Tie Dagger");
		StarWarsShips starWarsShip2 = new StarWarsShips(1270, "Night Buzzard");
		StarWarsShips starWarsShip3 = new StarWarsShips(90, "Y-Wing Starfighter");
		shipList.add(starWarsShip1);
		shipList.add(starWarsShip2);
		shipList.add(starWarsShip3);

		StarTrekShips starTrekShip1 = new StarTrekShips(1500, "U.S.S. Challenger");
		StarTrekShips starTrekShip2 = new StarTrekShips(1450, "U.S.S. Defiant");
		StarTrekShips starTrekShip3 = new StarTrekShips(1760, "U.S.S. Al-Batani");
		shipList.add(starTrekShip1);
		shipList.add(starTrekShip2);
		shipList.add(starTrekShip3);
		
		OtherSciFiSpaceShips haloShip1 = new OtherSciFiSpaceShips(150, "GA-TL1 Longsword Interceptor");
		OtherSciFiSpaceShips haloShip2 = new OtherSciFiSpaceShips(45, "YSS-1000 Sabre");
		OtherSciFiSpaceShips haloShip3 = new OtherSciFiSpaceShips(70, "D96-TCE Albatross");
		shipList.add(haloShip1);
		shipList.add(haloShip2);
		shipList.add(haloShip3);	
		
		for (SpaceShip ss: shipList) {
			System.out.println(ss.getTonnage() + " metric tons / " + ss.getName() + " / " + ss.getFranchise());
		}
	}
}