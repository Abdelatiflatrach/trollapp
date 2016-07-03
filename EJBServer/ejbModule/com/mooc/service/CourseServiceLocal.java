package com.mooc.service;

import javax.ejb.Local;

import com.mooc.domain.Course;

@Local
public interface CourseServiceLocal extends GenericEntityService<Course>{

}
