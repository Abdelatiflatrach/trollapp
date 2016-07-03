package com.mooc.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.TypedQuery;

import com.mooc.domain.Authorization;

@Stateless
public class AuthorizationServiceImpl extends GenericEntityServiceImpl<Authorization> implements AuthorizationServiceRemote, AuthorizationServiceLocal{

	protected AuthorizationServiceImpl() {
		super(Authorization.class);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Authorization findAuthorithy(String email, String password) {
		TypedQuery<Authorization> q = entityManager
				.createQuery("select a from Authorization a where a.email=?0 and a.password=?1", Authorization.class)
				.setParameter(0, email).setParameter(1, password);
		
		List<Authorization> list = q.getResultList();
		
		if (list.isEmpty()) {
			return null;
		}
		
		return list.get(0);
	}
	
	@Override
	public Authorization findByEmail(String email){
		TypedQuery<Authorization> q = entityManager
				.createQuery("select a from Authorization a where a.email=?0", Authorization.class)
				.setParameter(0, email);
		
		List<Authorization> list = q.getResultList();
		
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

}
