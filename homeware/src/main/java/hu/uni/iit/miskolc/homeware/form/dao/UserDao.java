package hu.uni.iit.miskolc.homeware.form.dao;

import java.util.List;

import hu.uni.iit.miskolc.homeware.form.core.model.User;

public interface UserDao {

	User findById(Integer id);

	List<User> findAll();

	void save(User user);

	void update(User user);

	void delete(Integer id);

}