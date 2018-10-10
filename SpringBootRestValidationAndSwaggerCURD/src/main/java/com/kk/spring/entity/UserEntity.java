package com.kk.spring.entity;

import java.sql.Time;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "user_tab")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name = "user_id", nullable = false)
	private Long id;
	@Column(name = "user_name")
	private String name;
	@Column(name = "user_address")
	private String addes;
	private Timestamp createDate;
	private Timestamp updateDate;

	//@Column(name = "user_id", nullable = false)
	public Long getId() {
		return id;
	}

//	@Column(name = "user_name")
	public String getName() {
		return name;
	}

//	@Column(name = "user_address")
	public String getAddes() {
		return addes;
	}

	@Column(name = "create_date")
	public Timestamp getCreateDate() {
		return createDate;
	}

	@Column(name = "update_date")
	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddes(String addes) {
		this.addes = addes;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}

}
