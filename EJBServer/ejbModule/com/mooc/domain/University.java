package com.mooc.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Entity
public class University implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String location;
	private int postalCode;
	private String phone;
	
	@OneToMany(mappedBy = "university")
	private List<Trainer> trainers;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private ComitteeMember comitteeMember;
	
	public University() {
		super();
	}

	public University(String name, String location, int postalCode, String phone,
			ComitteeMember comitteeMember) {
		super();
		this.name = name;
		this.location = location;
		this.postalCode = postalCode;
		this.phone = phone;
		this.comitteeMember = comitteeMember;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Trainer> getTrainers() {
		return trainers;
	}

	public void setTrainers(List<Trainer> trainers) {
		this.trainers = trainers;
	}


	public ComitteeMember getComitteeMember() {
		return comitteeMember;
	}


	public void setComitteeMember(ComitteeMember comitteeMember) {
		this.comitteeMember = comitteeMember;
	}
}
