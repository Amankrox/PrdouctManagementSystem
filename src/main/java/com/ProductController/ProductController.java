package com.ProductController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ProductEntity.Product;
import com.ProductService.ProductService;

@Controller
public class ProductController {
	private ProductService service;
	int productId;
	String productBrand;
	String productName;
	@RequestMapping("/product")
	public ModelAndView display(HttpServletRequest req,HttpServletResponse res) {
		productId=Integer.parseInt(req.getParameter("productId"));
		productBrand=req.getParameter("productBrand");
		productName=req.getParameter("productName");
		int b=Integer.parseInt(req.getParameter("productPrice"));
		Product p =new Product();
		p.setProductId(productId);
		p.setProductBrand(productBrand);
		p.setProductName(productName);
		p.setProductPrice(productId);
		service.addProduct(p);
		String output="data saved succesfully";
		ModelAndView mav=new ModelAndView();
		mav.setViewName("Output.jsp");
		mav.addObject("result",output);
		return mav;
		
	}
	
}
