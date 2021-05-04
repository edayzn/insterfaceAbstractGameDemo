package Concrete;




import Abstract.GamerService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Adapters.*;

public class GamerManager implements GamerService {
	 
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
		
		if( MernisServiceAdapter.CheckIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() +" "+ gamer.getLastName()+ " tarafýndan "+ game.getGameName()+ " satýn alýnmýþtýr");
		}
		else {
			System.out.println("Kullanýcý bilgileri hatalý ve ya eksik olduðu için satýn alma iþlemi gerçekleþtirilemedi.");
		}
		
	
		
	}

	@Override
	public void discountPurchase(Gamer gamer, Game game, Campaign campaign) {
		
		if(MernisServiceAdapter.CheckIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() +" "+ gamer.getLastName()+ " tarafýndan "+ game.getGameName()+ " oyununu "+ campaign.getCampaignNamae()+" ile % "+campaign.getDiscount() +" indirim alarak satýn alýnmýþtýr");
		}
		else {
			System.out.println("Kullanýcý bilgileri hatalý ve ya eksik olduðu için satýn alma iþlemi gerçekleþtirilemedi.");
		}
	}

	

}
