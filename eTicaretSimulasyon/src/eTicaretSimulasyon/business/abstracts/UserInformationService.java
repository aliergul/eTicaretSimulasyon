package eTicaretSimulasyon.business.abstracts;

import eTicaretSimulasyon.entities.concretes.User;

public interface UserInformationService {
	boolean checkName(String name);
	boolean checkSurname(String surName);
	boolean checkPassword(String password);
	boolean checkEmail(String eMail);
	boolean checkUniqueEmail(String eMail);
	boolean checkUser(User user);
}
