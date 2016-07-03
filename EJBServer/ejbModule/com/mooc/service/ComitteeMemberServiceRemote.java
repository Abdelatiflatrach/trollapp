package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.ComitteeMember;

@Remote
public interface ComitteeMemberServiceRemote extends GenericEntityService<ComitteeMember>{
}
