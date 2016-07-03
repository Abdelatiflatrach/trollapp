package com.mooc.service;

import javax.ejb.Local;

import com.mooc.domain.Comment;

@Local
public interface CommentServiceLocal extends GenericEntityServiceLocal<Comment>{

}
