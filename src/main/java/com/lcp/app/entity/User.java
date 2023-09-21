package com.lcp.app.entity;

import java.util.Calendar;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "Users")
public class User {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long userId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "lastName")
	private String lastName;
	
	@Column(name = "lastName2")
	private String lastName2;
	
	@Column(name = "birthdate")
	private String birthdate;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "sex")
	private String sex;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "regist_date", nullable = false)
    private Calendar registDate;
	
	@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Role role;
	
}
