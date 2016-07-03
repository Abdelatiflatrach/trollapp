package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Session;

@Remote
public interface SessionServiceRemote extends GenericEntityService<Session>{
}
