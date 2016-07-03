package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Exam;

@Remote
public interface ExamServiceRemote extends GenericEntityService<Exam>{
}
