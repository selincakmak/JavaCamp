package homework3.Abstract;

import homework3.Entities.Campaign;
import homework3.Entities.Game;
import homework3.Entities.User;

public interface SaleService {

	void sale(User user,Game game);
	void campaignSale(Campaign campaign, Game game, User user);
}
