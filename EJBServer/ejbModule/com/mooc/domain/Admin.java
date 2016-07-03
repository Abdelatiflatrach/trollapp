package com.mooc.domain;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Admin extends User implements Serializable{

	private static final long serialVersionUID = 1L;

	public Admin(String name, String familyName, String phone, String address, Authorization authorization) {
		super(name, familyName, phone, address, authorization);
		// TODO Auto-generated constructor stub
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
}
