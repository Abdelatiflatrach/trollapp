package com.mooc.service;

import javax.ejb.Local;

import com.mooc.domain.Authorization;

@Local
public interface AuthorizationServiceLocal extends GenericEntityService<Authorization>{

	Authorization findAuthorithy(String email, String password);
	Authorization findByEmail(String email);
}
