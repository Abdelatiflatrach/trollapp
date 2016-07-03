package com.mooc.service;

import javax.ejb.Stateless;

import com.mooc.domain.Category;

@Stateless
public class CategoryServiceImpl extends GenericEntityServiceImpl<Category> implements CategoryServiceRemote, CategoryServiceLocal{

	protected CategoryServiceImpl() {
		super(Category.class);
		// TODO Auto-generated constructor stub
	}

}
