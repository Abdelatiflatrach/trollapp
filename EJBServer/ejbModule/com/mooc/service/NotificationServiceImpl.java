package com.mooc.service;

import javax.ejb.Stateless;

import com.mooc.domain.Notification;

@Stateless
public class NotificationServiceImpl extends GenericEntityServiceImpl<Notification> implements NotificationServiceLocal,NotificationServiceRemote{

	protected NotificationServiceImpl() {
		super(Notification.class);
		// TODO Auto-generated constructor stub
	}

}
