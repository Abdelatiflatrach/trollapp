package com.mooc.service;

import javax.ejb.Local;
import com.mooc.domain.Learner;

@Local
public interface LearnerServiceLocal extends GenericEntityService<Learner>{

}
