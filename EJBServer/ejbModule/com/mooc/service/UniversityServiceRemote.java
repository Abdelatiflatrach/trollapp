package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.University;

@Remote
public interface UniversityServiceRemote extends GenericEntityService<University>{

}
