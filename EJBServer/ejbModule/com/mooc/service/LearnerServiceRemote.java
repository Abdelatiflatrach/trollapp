package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Learner;

@Remote
public interface LearnerServiceRemote extends GenericEntityService<Learner>{

}
