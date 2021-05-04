package homework3.Concrete;

import homework3.Abstract.CampaignService;
import homework3.Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println( "%"+campaign.getDiscountRate() +" indirimli "+campaign.getCampaignName()+" kampanyas� olu�turuldu.");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+ " kampanya i�eri�i g�ncellendi.");
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println(campaign.getCampaignName()+ " kampanyas� silinmi�tir.");
		
	}

}
