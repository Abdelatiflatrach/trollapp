package com.mooc.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class IndividualCM extends User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private ComitteeMember comitteeMember;
	
	@OneToMany(mappedBy="individualCM")
	List<Validation> validations;

	public IndividualCM() {
		super();
	}
	
	public IndividualCM(String name, String familyName, String phone, String address, Authorization authorization,
			ComitteeMember comitteeMember) {
		super(name, familyName, phone, address, authorization);
		this.comitteeMember = comitteeMember;
	}

	public List<Validation> getValidations() {
		return validations;
	}

	public void setValidations(List<Validation> validations) {
		this.validations = validations;
	}

	public ComitteeMember getComitteeMember() {
		return comitteeMember;
	}

	public void setComitteeMember(ComitteeMember comitteeMember) {
		this.comitteeMember = comitteeMember;
	}
}
