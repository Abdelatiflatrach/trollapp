package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Category;

@Remote
public interface CategoryServiceRemote extends GenericEntityService<Category>{

}
