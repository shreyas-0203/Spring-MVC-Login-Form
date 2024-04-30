package MVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class LoginController
{
	@RequestMapping("/login")
	public String log(Model model)
	{
		System.out.println("This is Login URL");
		model.addAttribute("name", "Shreyas Bhosale");
		model.addAttribute("id", 27);
		return "welcome";
	}
	
	
	@RequestMapping("/about")
	public ModelAndView aboutt()
	{
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name", "Shreyas Bhosale");
		modelAndView.setViewName("about");
		System.out.println("This is About URL");
		return modelAndView;
	}
	
	@RequestMapping(path = "/form" , method = RequestMethod.POST)
	
	public String fo(
			@RequestParam("email") String userEmail,
			@RequestParam("password") String userPassword , Model model)
	{
		System.out.println("UserEmail is "+ userEmail);
		System.out.println("UserPassword is "+ userPassword);
		
		model.addAttribute("email", userEmail);
		model.addAttribute("password", userPassword);
		
		return "success";
	}

}
