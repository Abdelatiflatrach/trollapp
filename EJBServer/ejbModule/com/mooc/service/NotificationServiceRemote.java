package com.mooc.service;

import javax.ejb.Remote;

import com.mooc.domain.Notification;

@Remote
public interface NotificationServiceRemote extends GenericEntityService<Notification>{

}
