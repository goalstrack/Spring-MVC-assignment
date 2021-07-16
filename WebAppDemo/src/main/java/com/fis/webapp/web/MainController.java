package com.fis.webapp.web;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fis.webapp.service.RetrieveService;

@Controller
public class MainController {
	
	@Autowired
	RetrieveService rs;
	
	public MainController() {
		super();
		System.out.println("Inside Web Controller - default constructor called");
	}
	
	@RequestMapping("/")
	public String showHomePage()
	{
		return "receiveEmail";
	}
	
	@RequestMapping(value = "/doSubmit",method = RequestMethod.POST)
	public String doMathsAdditionCalulation(HttpServletRequest req,Model model)
	{
		String email=req.getParameter("email"); 
		int i=Integer.parseInt(req.getParameter("gender"));
		
		String userName = rs.getUserName(email);
		String domain=rs.getDomain(email);
		String gender=rs.getGender(i);
		model.addAttribute("userName", userName);
		model.addAttribute("domain", domain);
		model.addAttribute("gender", gender);
		
		
		return "displayInfo";
		
	}
	
	

}
