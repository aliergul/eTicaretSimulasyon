package eTicaretSimulasyon.business.abstracts;


public interface UserService {
	void signIn(String name, String surName, String eMail, String password);
	void logIn(String eMail, String password);
}
