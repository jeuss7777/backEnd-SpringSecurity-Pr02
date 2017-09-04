package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Category;
import com.websystique.springmvc.model.User;

import org.hibernate.criterion.Order;

@Repository("CategoryDAO")

public class CategoryDAOImpl extends AbstractDao<Long, Category> implements CategoryDAO {

	
	@SuppressWarnings("unchecked")
	public List<Category> findAll() {
		Criteria crit = createEntityCriteria();
		crit.addOrder(Order.asc("catId"));
		return (List<Category>) crit.list();
	}

	
	public Category findByName(String catCatgryNm) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("catCatgryNm", catCatgryNm));
		return (Category) crit.uniqueResult();
	}

	
	public Category findById(Long catId) {
		// TODO Auto-generated method stub
		return getByKey(catId);
	}
	
	public void addCategory(Category category) {
		persist(category);
	}


	public void editCategory(Category category) {
		update(category);
	}

	public void deleteById(Long catId) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("catId", catId));
		Category category = (Category)crit.uniqueResult();
		delete(category);
	}
	
	
}
