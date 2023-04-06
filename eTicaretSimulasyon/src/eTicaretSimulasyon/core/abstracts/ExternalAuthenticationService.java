package eTicaretSimulasyon.core.abstracts;

import eTicaretSimulasyon.entities.concretes.User;

public interface ExternalAuthenticationService {
	boolean authenticate(User user);
}
