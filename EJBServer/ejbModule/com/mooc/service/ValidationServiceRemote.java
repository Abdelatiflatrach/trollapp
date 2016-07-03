package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Validation;

@Remote
public interface ValidationServiceRemote extends GenericEntityService<Validation>{

}
