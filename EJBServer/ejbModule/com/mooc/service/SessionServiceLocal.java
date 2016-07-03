package com.mooc.service;

import javax.ejb.Local;

import com.mooc.domain.Session;

@Local
public interface SessionServiceLocal extends GenericEntityService<Session>{
}
