package com.websystique.springmvc.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.CategoryDAO;
import com.websystique.springmvc.model.Category;

@Transactional
@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Override
	public List<Category> findAll() {
		
		return categoryDAO.findAll();
	}

	@Override
	public Category findByName(String catCatgryNm) {
		
		return categoryDAO.findByName(catCatgryNm);
	}

	@Override
	public Category findById(Long catId) {
		
		return categoryDAO.findById(catId);
	}

	@Override
	public void deleteById(Long catId) {
		categoryDAO.deleteById(catId);
		
	}

	@Override
	public void addCategory(Category category) {
		categoryDAO.addCategory(category);
		
	}

	@Override
	public void editCategory(Category category) {
		categoryDAO.editCategory(category);
		
	}

	
	/*public String findAll() {
		return "hello";
	}*/
	
	/*public List<Category> findAll() {
		List<Category> listCategory = categoryDAO.findAll();
		return listCategory;
	}*/

//	public Category findOne(TYPE PK) {
//		return categoryDAO.findOne(PK);
//	}

//	public List<Category> findBy-ReplaceFIELD(TYPE FIELD) {
//		return categoryDAO.findBy-ReplaceFIELD(FIELD);
//	}

	/*public void create (Category category) {
		categoryDAO.save(category);
	}

	public void update (Category category) {
		categoryDAO.save(category);
	}

	public void delete (Category category) {
		categoryDAO.delete(category);
	}*/

}
