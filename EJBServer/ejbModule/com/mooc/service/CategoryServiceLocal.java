package com.mooc.service;

import javax.ejb.Local;

import com.mooc.domain.Category;

@Local
public interface CategoryServiceLocal extends GenericEntityService<Category>{

}
