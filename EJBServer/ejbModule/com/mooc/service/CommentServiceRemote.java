package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Comment;

@Remote
public interface CommentServiceRemote extends GenericEntityService<Comment>{

}
