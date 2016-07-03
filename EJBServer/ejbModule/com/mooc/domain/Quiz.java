package com.mooc.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Quiz implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String question;
	private String choice;
	private Integer correctQuestionId;

	@ManyToOne(fetch=FetchType.EAGER)
	private Chapter chapter;

	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quiz(String question, String choice, Integer correctQuestionId, Chapter chapter) {
		super();
		this.question = question;
		this.choice = choice;
		this.correctQuestionId = correctQuestionId;
		this.chapter = chapter;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public void setChoices(String choice) {
		this.choice = choice;
	}

	public Integer getCorrectQuestionId() {
		return correctQuestionId;
	}

	public void setCorrectQuestionId(Integer correctQuestionId) {
		this.correctQuestionId = correctQuestionId;
	}

	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	public String getChoice() {
		return choice;
	}
}