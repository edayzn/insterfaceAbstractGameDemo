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
			System.out.println(gamer.getFirstName() +" "+ gamer.getLastName()+ " taraf�ndan "+ game.getGameName()+ " sat�n al�nm��t�r");
		}
		else {
			System.out.println("Kullan�c� bilgileri hatal� ve ya eksik oldu�u i�in sat�n alma i�lemi ger�ekle�tirilemedi.");
		}
		
	
		
	}

	@Override
	public void discountPurchase(Gamer gamer, Game game, Campaign campaign) {
		
		if(MernisServiceAdapter.CheckIfRealPerson(gamer)) {
			System.out.println(gamer.getFirstName() +" "+ gamer.getLastName()+ " taraf�ndan "+ game.getGameName()+ " oyununu "+ campaign.getCampaignNamae()+" ile % "+campaign.getDiscount() +" indirim alarak sat�n al�nm��t�r");
		}
		else {
			System.out.println("Kullan�c� bilgileri hatal� ve ya eksik oldu�u i�in sat�n alma i�lemi ger�ekle�tirilemedi.");
		}
	}

	

}
