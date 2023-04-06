package eTicaretSimulasyon.core.concretes;

import eTicaretSimulasyon.core.abstracts.ExternalAuthenticationService;
import eTicaretSimulasyon.entities.concretes.User;

public class FacebookAuthenticationServiceAdapter implements ExternalAuthenticationService {

	@Override
	public boolean authenticate(User user) {
		FacebookAuthenticationServiceAdapter facebookAuthentication = new FacebookAuthenticationServiceAdapter();
		return facebookAuthentication.authenticate(user);
	}
	
}
