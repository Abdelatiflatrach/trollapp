package com.mooc.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Learner extends User implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy="learner")
	private List<Comment> comments;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="learners_sessions",
	   joinColumns=@JoinColumn(name="LEARNER_ID", referencedColumnName="id"),
	   inverseJoinColumns=@JoinColumn(name="SESSION_ID", referencedColumnName="id"))
	private List<Session> sessions;

	public Learner() {
		super();
	}

	public Learner(String name, String familyName, String phone, String address, Authorization authorization) {
		super(name, familyName, phone, address, authorization);
	}

	public List<Session> getSessions() {
		return sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
}