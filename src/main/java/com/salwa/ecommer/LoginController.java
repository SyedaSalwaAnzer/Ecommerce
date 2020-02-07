package com.salwa.ecommer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.salwa.ecommer.dao.LoginDaoImpl;
import com.salwa.ecommer.model.User;

public class LoginController {
	
	public ModelAndView LoginController()
	{
		ModelAndView modelAndView=new ModelAndView("AdminHome");
		return modelAndView;
	}
	
/*	@Autowired
@RequestMapping("/login")

public ModelAndView login()
{
ModelAndView modelandView= new ModelAndView("login");
User user=new User();
modelandView.addObject("log",user);
return modelandView;
}*/
	@Autowired
	LoginDaoImpl loginDaoImpl;
	
	@RequestMapping(value="/carrylogin",method=RequestMethod.POST)
	public String  login(@ModelAttribute("log") User user)
	{
		User s=loginDaoImpl.checkLogin(user);
		if(s!=null)
		{
			if(s.getRole().equals("ROLE_ADMIN"))
			{
				return "home";
				
			}
			else if(s.getRole().equals("ROLE_USER"))
			{
				return "userhome";
				
			}
		}
		else if(s==null)
		{
			return "redirect:login";
			
		}
		return "";
		
	}
	
	

}
