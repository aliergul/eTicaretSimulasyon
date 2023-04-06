package eTicaretSimulasyon.facebookService;

import eTicaretSimulasyon.entities.concretes.User;

public class FacebookAuthentication {
	public boolean authenticateWithFacebook(User user) {
		System.out.println(user.geteMail() + " kullanıcısı google ile yetkilendirildi..");
        return true;
	}
}
