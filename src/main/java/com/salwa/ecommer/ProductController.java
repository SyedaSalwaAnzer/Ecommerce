package com.salwa.ecommer;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.salwa.ecommer.dao.ConnectDataBase;
import com.salwa.ecommer.dao.ProductDaoImpl;
import com.salwa.ecommer.dao.UserDaoImpl;
import com.salwa.ecommer.model.Product;
import com.salwa.ecommer.model.User;



@Component
@Controller
public class ProductController {
	/*public ProductController() 
	{
	System.out.println("Product Controller is loading");
	}
	@Autowired
	 UserDaoImpl userDaoimpl;

/*	@RequestMapping("/productList")
	public ModelAndView   test2() 
	{

		userDaoimpl.testSessionFactory();
		
		
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		Product p4=new Product();
		
		
		p1.setProductId("101");
		p1.setProductName("Dell");
		p1.setProductPrice("100");
		
		p2.setProductId("102");
		p2.setProductName("Hp");
		p2.setProductPrice("2000");
		
		p3.setProductId("103");
		p3.setProductName("Lenova");
		p3.setProductPrice("22000");
		
		
		
		ArrayList al= new ArrayList();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		ModelAndView modelAndView=new ModelAndView("productList");
	  
		modelAndView.addObject("productList",al);
		
		return modelAndView;
	}*/
	
	
@RequestMapping("/addProducts")
public ModelAndView test5()
{
	ModelAndView modelAndView=new ModelAndView("addProducts");
	
	Product product =new Product();
	modelAndView.addObject("product",product);
	
	return modelAndView;
}

@Autowired

ProductDaoImpl productdaoimpl;

@RequestMapping(value="/carryproducts",method=RequestMethod.POST)
public String readProductForm(@ModelAttribute("product") Product pro)
{
	/*ConnectDataBase cdb=new ConnectDataBase();
	String s1=pro.getProductId();
	String s2=pro.getProductName();
	String s3=pro.getProductPrice();
	String s4=pro.getProductDescription();
cdb.connectionP(s1,s2,s3,s4);*/
	
	productdaoimpl.insertProduct(pro);
	return "home";

}

@RequestMapping("/productList")
public ModelAndView displayProduct()
{
	System.out.println("at product controller");
	Product product =new Product();
	List list=productdaoimpl.displayProduct(product);
	ModelAndView modelAndView=new ModelAndView("productList");
	modelAndView.addObject("productList",list);
	return modelAndView;
}

@Autowired

ProductDaoImpl productDaoImpl1;

@GetMapping("/info")
public ModelAndView goToSingleProduct(@RequestParam("pid") int proId)
{
	System.out.println(proId);
	Product product = productDaoImpl1.getProduct(proId);
	ModelAndView modelAndView=new ModelAndView("singleProduct");
    modelAndView.addObject("pro",product);
	return modelAndView;
}

/*
@Autowired

ProductDaoImpl productdaoimpl1;

@RequestMapping(value="/carryproducts",method=RequestMethod.POST)
public String writeProductForm(@ModelAttribute("product") Product pro)
{
	/*ConnectDataBase cdb=new ConnectDataBase();
	String s1=pro.getProductId();
	String s2=pro.getProductName();
	String s3=pro.getProductPrice();
	String s4=pro.getProductDescription();
cdb.connectionP(s1,s2,s3,s4);
	

    
return "productList";

}
*/

}
