package com.mooc.service;

import javax.ejb.Stateless;

import com.mooc.domain.University;

@Stateless
public class UniversityServiceImpl extends GenericEntityServiceImpl<University> implements UniversityServiceLocal, UniversityServiceRemote{

	protected UniversityServiceImpl() {
		super(University.class);
		// TODO Auto-generated constructor stub
	}

}
