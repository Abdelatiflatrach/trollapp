package com.mooc.service;

import javax.ejb.Local;

import com.mooc.domain.Exam;

@Local
public interface ExamServiceLocal extends GenericEntityServiceLocal<Exam>{
}
