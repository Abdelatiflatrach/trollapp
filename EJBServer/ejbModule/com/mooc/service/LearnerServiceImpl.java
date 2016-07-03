package com.mooc.service;


import javax.ejb.Stateless;

import com.mooc.domain.Learner;

@Stateless
public class LearnerServiceImpl extends GenericEntityServiceImpl<Learner> implements LearnerServiceRemote, LearnerServiceLocal {

	protected LearnerServiceImpl() {
		super(Learner.class);
	}	
}
