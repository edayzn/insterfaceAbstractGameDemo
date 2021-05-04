package Concrete;

import Entities.Campaign;

public class CampaignManager {
	public void add(Campaign campaign) {
		System.out.println("Saved :" + campaign.getCampaignNamae());
	}

	public void update(Campaign campaign) {
		System.out.println("Updated :" + campaign.getCampaignNamae());

	}

	public void delete(Campaign campaign) {
		System.out.println("Deleted :" + campaign.getCampaignNamae());

	}

}
