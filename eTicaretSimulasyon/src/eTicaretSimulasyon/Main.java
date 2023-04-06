package eTicaretSimulasyon;

import eTicaretSimulasyon.business.abstracts.UserService;
import eTicaretSimulasyon.business.concretes.UserInformationManager;
import eTicaretSimulasyon.business.concretes.UserManager;
import eTicaretSimulasyon.dataAccess.concretes.HibernateUserDao;
import eTicaretSimulasyon.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		UserService userManager = new UserManager(
				new HibernateUserDao(), 
				new UserInformationManager(new HibernateUserDao())
				);
		
		//HibernateUserDao hibernateUserDao = new HibernateUserDao();
		//User user1 = hibernateUserDao.getByEmail("emreergul@gmail.com");
		
		userManager.logIn("aysubilgec132@gmail.com", "134679");
		
		userManager.signIn("Emre", "Ergül", "emre@gmail.com", "1234567");
		
	}

}
