package hu.uni.iit.miskolc.homeware.form.service;

import java.util.List;

import hu.uni.iit.miskolc.homeware.form.core.model.User;

public interface UserService {

	User findById(Integer id);
	
	List<User> findAll();

	void saveOrUpdate(User user);
	
	void delete(int id);
	
}