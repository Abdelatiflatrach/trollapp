package com.mooc.service;

import javax.ejb.Stateless;

import com.mooc.domain.Course;

@Stateless
public class CourseServiceImpl extends GenericEntityServiceImpl<Course> implements CourseServiceRemote, CourseServiceLocal{

	protected CourseServiceImpl() {
		super(Course.class);
	}
}
