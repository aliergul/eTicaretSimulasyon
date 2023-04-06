package eTicaretSimulasyon.business.concretes;

import eTicaretSimulasyon.business.abstracts.UserInformationService;
import eTicaretSimulasyon.business.abstracts.UserService;
import eTicaretSimulasyon.core.abstracts.ExternalAuthenticationService;
import eTicaretSimulasyon.dataAccess.abstracts.UserDao;
import eTicaretSimulasyon.entities.concretes.User;

public class UserManager implements UserService {
	
	private final ExternalAuthenticationService facebookService;
	private UserDao userDao;
	private UserInformationService userInformationService;
	
	
	public UserManager(
			UserDao userDao, 
			UserInformationService userInformationService,
			ExternalAuthenticationService facebookService) {
		super();
		this.userDao = userDao;
		this.userInformationService = userInformationService;
		this.facebookService = facebookService;
	}

	@Override
	public void logIn(String eMail, String password) {
		User user = userDao.getByEmail(eMail);
		
		if(user.geteMail().equals(eMail) && user.getPassword().equals(password)) {
			System.out.println(user.getName()+" "+user.getSurName() + " adlı kullanıcı başarılı bir şekilde giriş yaptı.");
		}else
			System.out.println("E-Mail bilgisi veya parola bilgisi hatalı.");
	}
	
	@Override
	public void signIn(String name, String surName, String eMail, String password) {
		

        if (userInformationService.checkName(name) &&
        		userInformationService.checkSurname(surName) &&
        		userInformationService.checkEmail(eMail) &&
        		//userInformationService.checkUniqueEmail(eMail) &&
        		userInformationService.checkPassword(password)
        ) {
			System.out.println(name + " " + surName + " adlı kullanıcı sisteme başarılı bir şekilde kaydedildi. E-Mail adresine doğrulama linki gönderildi.");
		}else {
			System.out.println("Kayıt işlemi başarısız. Girdiğiniz bilgileri kontrol ediniz.");
		}
		
	}

	@Override
	public boolean loginWithFacebookService(User user) {
		return facebookService.authenticate(user);
	}
	
}
