package com.mvc.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvc.system.entity.User;
import com.mvc.system.service.UserService;

@org.springframework.stereotype.Controller
public class Controller {

	@Autowired
	private UserService userService;
	
	@GetMapping("/home")
	public String home() {
		return "home"; /* view path: ./resources/templates/home.html */
	}
	
	@GetMapping("/users")
	public String getAllUsers(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users"; /* view path: ./resources/templates/users.html */ 
	}

	@GetMapping("users/new")
	public String createUserForm(Model model){
		User user = new User();
		model.addAttribute("user", user);
		return "create-users";
	}

	@PostMapping("users")
	public String saveUser(@ModelAttribute("user")User user){
		userService.saveUser(user);
		return "redirect:/users";
	}

	@GetMapping("/users/edit/{id}")
	public String editUserForm(@PathVariable int id, Model model){
		model.addAttribute("user", userService.getById(id));
		return "edit-users";
	}

	@PostMapping("/user/edit/{id}")
	public String updateUser(@PathVariable int id, @ModelAttribute("user") User user){

		User existingUser = userService.getById(id);

		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());

		userService.saveUser(existingUser);
		return "redirect:/users";

	}

	@GetMapping("/users/{id}")
	public String deleteById(@PathVariable int id){
		userService.deleteById(id);
		return "redirect:/users";
	}
	
}
