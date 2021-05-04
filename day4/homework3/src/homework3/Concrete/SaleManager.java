package homework3.Concrete;

import homework3.Abstract.SaleService;
import homework3.Entities.Campaign;
import homework3.Entities.Game;
import homework3.Entities.User;

public class SaleManager implements SaleService {

	@Override
	public void sale(User user, Game game) {
		System.out.println("Merhaba "+user.getFirstName()+" :) "+game.getName()+" isimli oyunu "+game.getPrice()+ " TL'ye satýn aldýnýz.Ýyi eðlenceler :)");
		
	}

	@Override
	public void campaignSale(Campaign campaign, Game game, User user) {
		
		double gamePrice= game.getPrice()-((game.getPrice()*campaign.getDiscountRate())/100);
		
		System.out.println("Merhaba "+user.getFirstName()+" :) "+game.getName()+" isimli oyunu "+campaign.getCampaignName()+" kampanyasýyla % "+campaign.getDiscountRate()+" indirimle "+game.getPrice()+" TL yerine "+ gamePrice +" TL'ye satýn aldýnýz.Ýyi eðlenceler :)");
	}

}
