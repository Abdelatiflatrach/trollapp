package com.mooc.service;

import javax.ejb.Stateless;

import com.mooc.domain.IndividualCM;

@Stateless
public class IndividualCMServiceImpl extends GenericEntityServiceImpl<IndividualCM> implements IndividualCMServiceRemote, IndividualCMServiceLocal{

	protected IndividualCMServiceImpl() {
		super(IndividualCM.class);
		// TODO Auto-generated constructor stub
	}
}
