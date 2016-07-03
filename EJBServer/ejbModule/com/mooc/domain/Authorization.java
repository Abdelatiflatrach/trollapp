package com.mooc.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints=@UniqueConstraint(columnNames={"email"}))
public class Authorization implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Column(name="email")
	private String email;
	private String password;
	private String _ROLE;
	
	@OneToOne(fetch=FetchType.EAGER, mappedBy="authorization")
	private User user;
	
	public Authorization() {
		super();
	}
	
	public Authorization(String email, String password, String _ROLE) {
		super();
		this.email = email;
		this.password = password;
		this._ROLE = _ROLE;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String get_ROLE() {
		return _ROLE;
	}
	public void set_ROLE(String _ROLE) {
		this._ROLE = _ROLE;
	}
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
