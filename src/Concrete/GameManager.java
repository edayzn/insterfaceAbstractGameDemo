package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Saved " + game.getGameName());

		
	}

	@Override
	public void update(Game game) {
		System.out.println("Updated " + game.getGameName());

		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Deleted " + game.getGameName());
	
	}
		
}
