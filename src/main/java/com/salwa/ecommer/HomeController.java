package com.salwa.ecommer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.salwa.ecommer.dao.ConnectDataBase;
import com.salwa.ecommer.dao.UserDaoImpl;
import com.salwa.ecommer.model.Product;
import com.salwa.ecommer.model.User;

@Component 
@Controller
public class HomeController {
	
	public static void HomeController()
	{
		System.out.println("HomeController Loading...");
	}

@Autowired 
//UserDaoImpl userdaoimpl;

@RequestMapping("/register")

	public ModelAndView register()
	{
	
	ModelAndView modelandView= new ModelAndView("register");
	User user=new User();
	modelandView.addObject("usr",new User());
	return modelandView;
	}

@Autowired 
UserDaoImpl userdaoimpl;
@RequestMapping(value="/carryuser",method=RequestMethod.POST)
public String readUserForm(@ModelAttribute("usr") User user)
{
	/*System.out.println(user.getUserName());
	System.out.println(user.getPassword());
	System.out.println(user.getEmail());
	System.out.println(user.getContact()); 
	
	//ConnectDataBase cdb=new ConnectDataBase();
	String s1=user.getUserName();
	String s2=user.getPassword();
    String s3=user.getEmail();
	String s4=user.getContact();
	//cdb.connection(s1,s2,s3,s4);*/
	
	userdaoimpl.insertUser(user);
	
	
	return "home";
}


@RequestMapping("/userList")
public ModelAndView displayUser()
{
	System.out.println("at user controller");
	User user =new User();
	List list=userdaoimpl.displayUser(user);
	ModelAndView modelAndView=new ModelAndView("userList");
	modelAndView.addObject("userList",list);
	return modelAndView;
}



/*
@Autowired
UserDaoImpl userdaoimpl1;
@RequestMapping(value="/carryuser",method=RequestMethod.POST)
public String writeUserForm(@ModelAttribute("usr") User user)
{
	return "displayUser";
}

*/

@RequestMapping("/login")

public ModelAndView login()
{
ModelAndView modelandView= new ModelAndView("login");
User user=new User();
modelandView.addObject("log",user);
return modelandView;
}

@RequestMapping("/home")

public ModelAndView home()
{
ModelAndView modelandView= new ModelAndView("home");
return modelandView;
} 
	
}
