package com.productsmgmt.productsmgmt.controller;


import com.productsmgmt.productsmgmt.model.Product;
import com.productsmgmt.productsmgmt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value="/products", method = RequestMethod.GET)
	public ModelAndView products(){
		List<Product> products = productService.findAll();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("products", products);
		modelAndView.setViewName("product/list");
		return modelAndView;
	}


	@RequestMapping(value="/product", method = RequestMethod.GET)
	public String create(Model model){
		model.addAttribute("product", new Product());
		return "product/edit";
	}


	@RequestMapping(value = "/product", method = RequestMethod.POST)
	public String edit(@Valid @ModelAttribute("product") Product product,
                       BindingResult result, Model model)  {

		if (result.hasErrors()) {
			model.addAttribute("errors", result.getAllErrors());
			return "product/edit";
		}
		product = productService.save(product);
		return "redirect:/products";
	}

	@RequestMapping(value="/product/{pid}", method = RequestMethod.GET)
	public String view(@PathVariable Long pid, Model model){
		model.addAttribute("product", productService.findOne(pid));
		return "product/edit";
	}

	@RequestMapping(value="/product/delete/{pid}", method = RequestMethod.GET)
	public String delete(@PathVariable Long pid, Model model){
		productService.delete(pid);
		return "redirect:/products";
	}
}
