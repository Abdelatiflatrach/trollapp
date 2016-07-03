package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Authorization;

@Remote
public interface AuthorizationServiceRemote extends GenericEntityService<Authorization>{

	Authorization findAuthorithy(String email, String password);
	Authorization findByEmail(String email);

}
