package com.mooc.service;

import com.mooc.domain.Validation;

public class ValidationServiceImpl extends GenericEntityServiceImpl<Validation> implements ValidationServiceLocal, ValidationServiceRemote{

	protected ValidationServiceImpl() {
		super(Validation.class);
		// TODO Auto-generated constructor stub
	}

}
