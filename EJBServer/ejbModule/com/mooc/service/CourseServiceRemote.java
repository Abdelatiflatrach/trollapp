package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Course;

@Remote
public interface CourseServiceRemote extends GenericEntityService<Course>{

}
