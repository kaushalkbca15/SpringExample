package com.kk.spring.dto;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class UserDTO {

	private Long id;
	@NotNull(message="use name can not be null")
	@Length(min=5,message="user name min lenght 5 char")
	private String name;
	@NotNull(message="address can not be null")
	@Length(min=3,message="address min length 3 char")
	private String addes;

	public UserDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddes() {
		return addes;
	}

	public void setAddes(String addes) {
		this.addes = addes;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", addes=" + addes + "]";
	}

}
