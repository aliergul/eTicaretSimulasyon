package eTicaretSimulasyon.dataAccess.abstracts;

import java.util.List;
import eTicaretSimulasyon.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getById(int id);
	User getByEmail(String eMail);
	List<User> getAll();
	
}
