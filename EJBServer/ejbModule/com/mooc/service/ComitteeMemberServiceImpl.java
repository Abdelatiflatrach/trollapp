package com.mooc.service;

import javax.ejb.Stateless;

import com.mooc.domain.ComitteeMember;

@Stateless
public class ComitteeMemberServiceImpl extends GenericEntityServiceImpl<ComitteeMember> implements ComitteeMemberServiceLocal, ComitteeMemberServiceRemote{

	protected ComitteeMemberServiceImpl() {
		super(ComitteeMember.class);
	}
}
