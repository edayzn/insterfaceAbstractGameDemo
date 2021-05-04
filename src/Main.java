

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		
		Gamer gammer=new Gamer();
		gammer.setId(1);
		gammer.setFirstName("Eda");
		gammer.setLastName("Yazan Ayan");
		gammer.setNationalityId("**");
		gammer.setYearOfBirth(1994);
		gammer.setEmail("xxx@xxx.xx");
		gammer.setPassword("xxx");
		
		Game game= new Game();
		game.setId(1);
		game.setGameName("Age of Empires");
		game.setPrice(250);
	
	
		GameManager gameManager=new GameManager();
		gameManager.add(game);
		gameManager.delete(game);
		gameManager.update(game);
		
		
		Campaign campaign= new Campaign();
		campaign.setId(1);
		campaign.setCampaignNamae("3 ve 5 mayýs kampanyasý");
		campaign.setDiscount(10);
		
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.add(campaign);
		campaignManager.delete(campaign);
		campaignManager.update(campaign);
		
		GamerManager gamerManager=new GamerManager();
		
		gamerManager.add(gammer);
		gamerManager.delete(gammer);
		gamerManager.update(gammer);
		
		gamerManager.buy(gammer, game);
		gamerManager.discountPurchase(gammer, game, campaign);
		
	}

}
