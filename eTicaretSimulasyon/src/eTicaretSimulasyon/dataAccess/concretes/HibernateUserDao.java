package eTicaretSimulasyon.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;
import eTicaretSimulasyon.dataAccess.abstracts.UserDao;
import eTicaretSimulasyon.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	
	List<User> users;
	
	public HibernateUserDao() {
		//halihazırda veritabanında bulunan kullanıcılar.
		this.users = new ArrayList<>();
		users.add(new User(1,"Ali","Ergul","123456","m.alieergul@gmail.com"));
		users.add(new User(2,"Bilge","Cilli","134679","aysubilgec132@gmail.com"));

	}
	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi: " + user.getName() + " " + user.getSurName());
	}

	@Override
	public void delete(User user) {
		
	}

	@Override
	public void update(User user) {
		
	}

	@Override
	public User getById(int id) {
		
		for(User user: users) {
			if(user.getId()==id)
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return null;
	}
	@Override
	public User getByEmail(String eMail) {
		for(User user: users) {
			if(user.geteMail().equals(eMail))
				return user;
		}
		return null;
	}
	
}
