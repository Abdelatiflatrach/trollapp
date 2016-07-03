package com.mooc.service;

import javax.ejb.Stateless;

import com.mooc.domain.Comment;

@Stateless
public class CommentServiceImpl extends GenericEntityServiceImpl<Comment> implements CommentServiceLocal, CommentServiceRemote{

	protected CommentServiceImpl() {
		super(Comment.class);
	}

}
