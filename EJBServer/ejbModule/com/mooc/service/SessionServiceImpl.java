package com.mooc.service;

import javax.ejb.Stateless;

import com.mooc.domain.Session;

@Stateless
public class SessionServiceImpl extends GenericEntityServiceImpl<Session> implements SessionServiceRemote, SessionServiceLocal{

	protected SessionServiceImpl() {
		super(Session.class);
		// TODO Auto-generated constructor stub
	}

}
