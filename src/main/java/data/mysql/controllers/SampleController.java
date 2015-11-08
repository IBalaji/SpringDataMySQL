package data.mysql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import data.mysql.model.Transaction;
import data.mysql.model.User;
import data.mysql.repo.TransactionDAO;
import data.mysql.repo.UserDAO;

@RestController
public class SampleController {

	@Autowired
	UserDAO userDAO;
	
	/*@Autowired
	TransactionDAO transDAO;*/
	
	
	
	@RequestMapping("/create/{name}/{email}")
	public boolean createUser(@PathVariable("name") String name, @PathVariable("email") String email){
		return userDAO.save(new User(name,email)) != null ? true : false;
	}
	
	@RequestMapping("/load")
	public List<User> loadUsers(){
		return (List<User>) userDAO.findAll();
	}
	
	/*@RequestMapping("/transactions/{userId}")
	public List<Transaction> loadTrans(@PathVariable("userId") int userId){
		if(userId != 0){
			return transDAO.findAllUserTransactions(userId);
		}
		return (List<Transaction>) transDAO.findAll();
		
		
	}*/
}