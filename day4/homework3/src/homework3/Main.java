package homework3;

import java.time.LocalDate;

import homework3.Adapters.MernisServiceAdapter;
import homework3.Concrete.CampaignManager;
import homework3.Concrete.GameManager;
import homework3.Concrete.SaleManager;
import homework3.Concrete.UserManager;
import homework3.Entities.Campaign;
import homework3.Entities.Game;
import homework3.Entities.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserManager userManager=new UserManager(new MernisServiceAdapter());
		User user=new User(1,"Havva Selin","Çakmak",LocalDate.of(1998,11,19),"12345678910");
		userManager.add(user);
		System.out.println("---------------------------------------------");
		
		
		Game game1=new Game(1,"Minecraft",145);
		Game game2=new Game(1,"Call of Duty",165);
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		gameManager.update(game2);
		System.out.println("---------------------------------------------");
		
		Campaign campaign1=new Campaign(1,"Bayram",5);
		Campaign campaign2=new Campaign(1,"Ramazan",10);
		
		CampaignManager campaignManager =new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign2);
		System.out.println("---------------------------------------------");
		
		SaleManager saleManager1=new SaleManager();
		saleManager1.campaignSale(campaign1, game2, user);
		saleManager1.sale(user, game1);
		
		
		
		
		
		
	}

}
