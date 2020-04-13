package question7;

import java.util.ArrayList;

public class ExamQ7 {
	public static void main(String[] args) {
		ArrayList<BakedGoods> yummyTreats = new ArrayList<BakedGoods>();

		// Creation of cookie instances
		Cookie jakesChocolateChipCookie = new Cookie();
		jakesChocolateChipCookie.setPrice(1);
		jakesChocolateChipCookie.setDescription("Jake's homemade chocolate chip cookies.");
		jakesChocolateChipCookie.setSellByDate("4/14/2020");
		
		Cookie grandmasGingersnap = new Cookie();
		grandmasGingersnap.setPrice(1);
		grandmasGingersnap.setDescription("Guaranteed to destroy your teeth.");
		grandmasGingersnap.setSellByDate("NEVER");
		
		Cookie fakeCookieBiscotti = new Cookie();
		fakeCookieBiscotti.setPrice(1);
		fakeCookieBiscotti.setDescription("These aren't even cookies. I can't believe this world would think this is a cookie.");
		fakeCookieBiscotti.setSellByDate("4/19/2020");
		
		// Add cookie instances to ArrayList
		yummyTreats.add(jakesChocolateChipCookie);
		yummyTreats.add(grandmasGingersnap);
		yummyTreats.add(fakeCookieBiscotti);
		
		// Creation of cinnamonroll instances
		CinnamonRoll peppermintCinnamonRoll = new CinnamonRoll();
		peppermintCinnamonRoll.setPrice(3);
		peppermintCinnamonRoll.setDescription("Cinnamon Rolls made with Peppermint. Perfect for Winter!");
		peppermintCinnamonRoll.setSellByDate("4/13/2020");
		
		CinnamonRoll nutellaCinnamonRoll = new CinnamonRoll();
		nutellaCinnamonRoll.setPrice(3);
		nutellaCinnamonRoll.setDescription("Our famous Cinnamon Rolls made with Nutella. So sweet it will literally kill you...");
		nutellaCinnamonRoll.setSellByDate("4/13/2020");
		
		CinnamonRoll smoresCinnamonRoll = new CinnamonRoll();
		smoresCinnamonRoll.setPrice(3);
		smoresCinnamonRoll.setDescription("These aren't that good.");
		smoresCinnamonRoll.setSellByDate("4/13/2020");
		
		// Add cinnamonroll instances to ArrayList
		yummyTreats.add(peppermintCinnamonRoll);
		yummyTreats.add(nutellaCinnamonRoll);
		yummyTreats.add(smoresCinnamonRoll);
		
		// Creation of brownie instances
		Brownie fudgeBrownie = new Brownie();
		fudgeBrownie.setPrice(2);
		fudgeBrownie.setDescription("Absolute classics. A must buy. As well as everything else here.");
		fudgeBrownie.setSellByDate("4/15/2020");
		
		Brownie creamCheeseBrownie = new Brownie();
		creamCheeseBrownie.setPrice(2);
		creamCheeseBrownie.setDescription("If you like cream cheese and you like brownies. These are your best friend (and coincidentally your archnemesis too).");
		creamCheeseBrownie.setSellByDate("4/15/2020");
		
		Brownie tiramisuBrownie = new Brownie();
		tiramisuBrownie.setPrice(2);
		tiramisuBrownie.setDescription("A house favorite.");
		tiramisuBrownie.setSellByDate("4/15/2020");
		
		// Add cinnamonroll instances to ArrayList
		yummyTreats.add(tiramisuBrownie);
		yummyTreats.add(tiramisuBrownie);
		yummyTreats.add(tiramisuBrownie);
		
		// Iterate through the ArrayList
		for (BakedGoods bg : yummyTreats) {
			System.out.println("$" + bg.getPrice()  + " | " + bg.getDescription() + " | " + bg.getSellByDate());
			// System.out.println(bg);
		}
	}
}