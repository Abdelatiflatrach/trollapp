package com.mooc.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Trainer extends User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="trainer")
	private List<Session> sessions;
	
	@OneToMany(mappedBy="trainer")
	private List<Notification> notifications;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private University university;

	public Trainer() {
		super();
	}

	public Trainer(String name, String familyName, String phone, String address, Authorization authorization, University university) {
		super(name, familyName, phone, address, authorization);
		this.university = university;
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	public List<Notification> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Notification> notifications) {
		this.notifications = notifications;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
}