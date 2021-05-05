package Concrete;




import Abstract.CampaignService;
import Abstract.GamerService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Adapters.*;

public class GamerManager implements GamerService {
	 
	private MernisService mernisService;
	private CampaignService campaignService;
	public GamerManager() {
		
	}

	public GamerManager(MernisService mernisService, CampaignService campaignService) {
		this.mernisService = mernisService;
		this.campaignService=campaignService;
	}

	
	@Override
	public void add(Gamer gamer) {
		System.out.println("Saved " + gamer.getFirstName());

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Updated " + gamer.getFirstName());

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Deleted " + gamer.getFirstName());

	}

	@Override
	public void buy(Gamer gamer, Game game) {
		
		if(mernisService.CheckIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() +" "+ gamer.getLastName()+ " tarafýndan "+ game.getGameName()+ " satýn alýnmýþtýr");
		}
		else {
			System.out.println("Kullanýcý bilgileri hatalý ve ya eksik olduðu için satýn alma iþlemi gerçekleþtirilemedi.");
		}
		
	}

	@Override
	public void discountPurchase(Gamer gamer, Game game, Campaign campaign) {
		
		if(mernisService.CheckIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() +" "+ gamer.getLastName()+ " tarafýndan "+ game.getGameName()+ " oyununu "+ campaign.getCampaignNamae()+" ile % "+campaign.getDiscount()+ " indirim alarak " +campaignService.calculateDiscount(game, campaign) +" satýn alýnmýþtýr");
		}
		else {
			System.out.println("Kullanýcý bilgileri hatalý ve ya eksik olduðu için satýn alma iþlemi gerçekleþtirilemedi.");
		}
	}

	

}
