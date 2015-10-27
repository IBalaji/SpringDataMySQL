package data.mysql.repo;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import data.mysql.model.User;

@Transactional
public interface UserDAO extends CrudRepository<User, Integer> {

	User findOne(Integer id);
	
}
