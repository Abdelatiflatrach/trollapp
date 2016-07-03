package com.mooc.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Session implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Integer id;
	protected String title;
	protected String designation;
	protected Date startDate;
	protected Date endDate;
	
	@ManyToOne(fetch=FetchType.EAGER)
	protected Trainer trainer;
	
	@OneToMany(mappedBy="session")
	private List<Course> courses;
	
	@ManyToMany(mappedBy="sessions", fetch=FetchType.EAGER)
	private List<Learner> learnes;

	
	public Session() {
		super();
	}

	public Session(String title, String designation, Date startDate, Date endDate, Trainer trainer) {
		super();
		this.title = title;
		this.designation = designation;
		this.startDate = startDate;
		this.endDate = endDate;
		this.trainer = trainer;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public List<Learner> getLearnes() {
		return learnes;
	}

	public void setLearnes(List<Learner> learnes) {
		this.learnes = learnes;
	}
}
