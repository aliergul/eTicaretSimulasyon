package eTicaretSimulasyon.business.abstracts;

import eTicaretSimulasyon.entities.concretes.User;

public interface UserService {
	void signIn(String name, String surName, String eMail, String password);
	void logIn(String eMail, String password);
    boolean loginWithFacebookService(User user);

}
