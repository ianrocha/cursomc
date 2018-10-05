package com.iarocha.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iarocha.cursomc.domain.Category;
import com.iarocha.cursomc.repositories.CategoryRepository;
import com.iarocha.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repo;
	
	public Category getCategory(Integer id) {
		Optional<Category> obj = repo.findById(id);
//		return obj.orElse(null);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found ID: " + id + ", Tipo: " + Category.class.getName()));
	}
}
