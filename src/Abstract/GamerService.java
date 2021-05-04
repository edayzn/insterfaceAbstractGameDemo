package Abstract;


import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GamerService {
	 void add(Gamer gamer);
	 void update(Gamer gamer);
	 void delete(Gamer gamer);
	 void buy(Gamer gamer,Game game);
	 void discountPurchase(Gamer gamer, Game game,Campaign campaign);
	
}
