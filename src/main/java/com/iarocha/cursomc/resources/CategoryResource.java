package com.iarocha.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iarocha.cursomc.domain.Category;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Category> list() {
		
		Category cat1 = new Category(1, "Technology");
		Category cat2 = new Category(2, "Office");
		
		List<Category> categoryList = new ArrayList<>();
		categoryList.add(cat1);
		categoryList.add(cat2);
		
		return categoryList;
	}

}
