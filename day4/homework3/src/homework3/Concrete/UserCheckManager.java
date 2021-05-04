package homework3.Concrete;

import homework3.Abstract.UserCheckService;
import homework3.Entities.User;

public class UserCheckManager implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		// TODO Auto-generated method stub
		return true;
	}
}
