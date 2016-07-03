package com.mooc.service;

import javax.ejb.Local;

import com.mooc.domain.ComitteeMember;

@Local
public interface ComitteeMemberServiceLocal extends GenericEntityServiceLocal<ComitteeMember> {
}
