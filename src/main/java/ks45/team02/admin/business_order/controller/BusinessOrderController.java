package ks45.team02.admin.business_order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/businessorder")
public class BusinessOrderController {
	
	@GetMapping("/addBusinessOrder")
	public String addBusinessOrder() {
		
		return "businessorder/addBusinessOrder";
	}
	
	@GetMapping("/deleteBusinessOrder")
	public String deleteBusinessOrder() {
		
		return "businessorder/deleteBusinessOrder";
	}
	
	@GetMapping("/listBusinessOrder")
	public String listBusinessOrder() {
		
		return "businessorder/listBusinessOrder";
	}
	
	@GetMapping("/modifyBusinessOrder")
	public String modifyBusinessOrder() {
		
		return "businessorder/modifyBusinessOrder";
	}
}
