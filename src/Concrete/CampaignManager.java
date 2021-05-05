package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;
import Entities.Game;

public class CampaignManager implements CampaignService  {
	@Override
	public void add(Campaign campaign) {
		System.out.println("Saved :" + campaign.getCampaignNamae());
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Updated :" + campaign.getCampaignNamae());

	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Deleted :" + campaign.getCampaignNamae());

	}

	@Override
	public double calculateDiscount(Game game, Campaign campaign) {
		return  (game.getPrice() - (game.getPrice() * (campaign.getDiscount()) / 100));
		
	}

}
