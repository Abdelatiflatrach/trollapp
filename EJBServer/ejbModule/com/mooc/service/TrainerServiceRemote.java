package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Trainer;

@Remote
public interface TrainerServiceRemote extends GenericEntityService<Trainer>{

}
