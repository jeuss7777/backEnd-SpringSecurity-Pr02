package com.websystique.springmvc.service;
import java.util.List;

import com.websystique.springmvc.model.Category;

public interface CategoryService {

	List<Category> findAll();
	
	Category findByName(String catCatgryNm);
	
	Category findById(Long catId);
	
	void deleteById(Long catId);

	void addCategory(Category category);

	void editCategory(Category category);
	
}
