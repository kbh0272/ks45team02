package ks45.team02.admin.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/addUser")
	public String addUser() {
		
		return "user/addUser";
	}
	
	@GetMapping("/basket")
	public String basket() {
		
		return "user/basket";
	}
	
	@GetMapping("/deleteUser")
	public String deleteUser() {
		
		return "user/deleteUser";
	}
	
	@GetMapping("/delivery")
	public String delivery() {
		
		return "user/delivery";
	}
	
	@GetMapping("/findId")
	public String findId() {
		
		return "user/findId";
	}
	
	@GetMapping("/findPw")
	public String findPw() {
		
		return "user/findPw";
	}
	
	@GetMapping("/listDormant")
	public String listDormant() {
		
		return "user/listDormant";
	}
	
	@GetMapping("/listDrop")
	public String listDrop() {
		
		return "user/listDrop";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "user/login";
	}
	
	@GetMapping("/modifyUser")
	public String modifyUser() {
		
		return "user/modifyUser";
	}
	
	@GetMapping("/pointsave")
	public String pointsave() {
		
		return "user/pointsave";
	}
}
