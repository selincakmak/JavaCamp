package homework3.Concrete;

import homework3.Abstract.GameService;
import homework3.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		
		System.out.println(game.getName() +" isimli oyun "+game.getPrice()+" fiyatla eklendi.");
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println(game.getName() +" isimli oyun güncellendi.");
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println(game.getName() +" isimli oyun silindi.");
		
	}

}
