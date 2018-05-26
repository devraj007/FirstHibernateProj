package com.javabrains.devraj.dto;

//Give some clues to hibernate by annotations min 2 for this model
	//Id treate this field as primary key for this object
//Entities telling hibernate to treate this class as an entity and it need to save it. other way to make an object annotated

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity    
public class UserDetails {
	@Id
	private int userId;
	private String userName;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
