package eTicaretSimulasyon.business.concretes;

import java.util.List;
import java.util.regex.Pattern;
import eTicaretSimulasyon.business.abstracts.UserInformationService;
import eTicaretSimulasyon.dataAccess.abstracts.UserDao;
import eTicaretSimulasyon.entities.concretes.User;

public class UserInformationManager implements UserInformationService {
	
	List<User> users;
	
	public UserInformationManager(UserDao userDao) {
		this.users = userDao.getAll();
	}
	
	@Override
	public boolean checkName(String name) {
		
		if(name.isEmpty()) {
			System.out.println("İsim bilgisi boş bırakılamaz.");
			return false;
		}else
			return true;
	}

	@Override
	public boolean checkSurname(String surName) {
		
		if(surName.isEmpty()) {
			System.out.println("Soyadı bilgisi boş bırakılamaz.");
			return false;
		}else
		return true;
	}

	@Override
	public boolean checkPassword(String password) {
		
		if(password.isEmpty()) {
			System.out.println("Parola bilgisi boş bırakılamaz.");
			return false;
		}else {
			if(password.length()<6) {
				System.out.println("Parola 6 karakterden uzun olmalıdır.");
				return false;
			}
		return true;
		}
	}

	@Override
	public boolean checkEmail(String eMail) {
		   String regex = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
	        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	        if (eMail.isEmpty()) {
	            System.out.println("E-Mail bilgisi boş bırakılamaz.");
	            return false;

	        } else {
	            if (!pattern.matcher(eMail).find()) {
	                System.out.println("Geçersiz bir mail adresi girdiniz.");
	                return false;
	            }
	        }
	        return true;
	}

	@Override
	public boolean checkUniqueEmail(String eMail) {
		for(User u: users) {
			if(u.geteMail().equals(eMail)) {
				System.out.println("Bu mail adresi sistemde kayıtlıdır.");
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean checkUser(User user) {
		
		return checkName(user.getName()) && checkSurname(user.getSurName()) 
				&& checkPassword(user.getPassword()) && checkEmail(user.geteMail()) 
				&& checkUniqueEmail(user.geteMail());
	}

}
