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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Course implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String text;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateTime;
	
	@OneToMany(mappedBy="course")
	private List<Chapter> chapters;
	
	@OneToMany(mappedBy="course")
	private List<Exam> exams;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Session session;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Category category;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Validation validation;
	
	public Course() {
		super();
	}
	
	public Course(String text, Date dateTime, Category category, 
			Validation validation, Session session) {
		super();
		this.text = text;
		this.dateTime = dateTime;
		this.session = session;
		this.validation = validation;
		this.category = category;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public List<Chapter> getChapters() {
		return chapters;
	}
	public void setChapters(List<Chapter> chapters) {
		this.chapters = chapters;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	
	public Validation getValidation() {
		return validation;
	}

	public void setValidation(Validation validation) {
		this.validation = validation;
	}

	public List<Exam> getExams() {
		return exams;
	}

	public void setExams(List<Exam> exams) {
		this.exams = exams;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}