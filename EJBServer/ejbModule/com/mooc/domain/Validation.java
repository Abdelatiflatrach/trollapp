package com.mooc.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Validation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String designation;
	private Date _date;
	private boolean status;
	
	@OneToMany(mappedBy="validation")
	private List<Course> courses;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Notification notification;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private IndividualCM individualCM;
	
	public Validation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Validation(String designation, Date _date, boolean status, Notification notification,
			IndividualCM individualCM) {
		super();
		this.designation = designation;
		this._date = _date;
		this.status = status;
		this.notification = notification;
		this.individualCM = individualCM;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date get_date() {
		return _date;
	}

	public void set_date(Date _date) {
		this._date = _date;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Notification getNotification() {
		return notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;
	}

	public IndividualCM getIndividualCM() {
		return individualCM;
	}

	public void setIndividualCM(IndividualCM individualCM) {
		this.individualCM = individualCM;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}