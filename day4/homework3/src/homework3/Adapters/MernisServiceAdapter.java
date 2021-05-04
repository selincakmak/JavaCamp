package homework3.Adapters;

import java.rmi.RemoteException;

import homework3.Abstract.UserCheckService;
import homework3.Entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		
		KPSPublicSoap mernisCheck = new KPSPublicSoapProxy();

		try {
					boolean result=mernisCheck.TCKimlikNoDogrula
							(Long.parseLong(user.getNationalId()), 
							user.getFirstName().toUpperCase(), 
							user.getLastName().toUpperCase(), 
							user.getDateOfBirth().getYear());
							return result;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}

