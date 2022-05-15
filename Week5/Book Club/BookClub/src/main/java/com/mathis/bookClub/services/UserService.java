package com.mathis.bookClub.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;

import com.mathis.bookClub.models.LoginUser;
import com.mathis.bookClub.models.User;
import com.mathis.bookClub.repositories.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public void validation(User newUser, Errors errors) {
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			errors.rejectValue("password", "Password", "Passwords Do Not Match");
		}
		if(userRepo.findByEmail(newUser.getEmail())!=null){
			errors.rejectValue("email", "Email", "Email Address Is Already Registered");
		}
	}
	
	public User register(User newUser) {
		String hashed=BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		userRepo.save(newUser);
		return null;
	}
	
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	public User findById(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	
	public boolean login(LoginUser newLogin, Errors errors) {
		User user=userRepo.findByEmail(newLogin.getEmail());
		if(user==null) {
			errors.rejectValue("email", "missing", "Invalid Login Attempt");
			return false;
		}	
		if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
			errors.rejectValue("password", "Matches", "Invalid Login Attempt");
			return false;
		}
		return true;
	}

}
