package com.mooc.service;

import javax.ejb.Stateless;
import com.mooc.domain.Trainer;

@Stateless
public class TrainerServiceImpl extends GenericEntityServiceImpl<Trainer> implements TrainerServiceRemote, TrainerServiceLocal{

	protected TrainerServiceImpl() {
		super(Trainer.class);
		// TODO Auto-generated constructor stub
	}

}
