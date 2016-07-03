package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Chapter;

@Remote
public interface ChapterServiceRemote extends GenericEntityService<Chapter>{

}
