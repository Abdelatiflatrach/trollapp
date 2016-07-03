package com.mooc.service;

import javax.ejb.Stateless;

import com.mooc.domain.Exam;

@Stateless
public class ExamServiceImpl extends GenericEntityServiceImpl<Exam> implements ExamServiceLocal, ExamServiceRemote{

	protected ExamServiceImpl() {
		super(Exam.class);
		// TODO Auto-generated constructor stub
	}

}
