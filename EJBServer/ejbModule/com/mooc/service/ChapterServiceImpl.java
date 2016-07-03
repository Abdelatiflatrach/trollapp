package com.mooc.service;

import javax.ejb.Stateless;

import com.mooc.domain.Chapter;

@Stateless
public class ChapterServiceImpl extends GenericEntityServiceImpl<Chapter> implements ChapterServiceRemote, ChapterServiceLocal{
	protected ChapterServiceImpl() {
		super(Chapter.class);
	}
}
