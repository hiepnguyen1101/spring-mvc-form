package com.mkyong.form.model;

import java.util.List;

public class User {
	Integer id;
	String name;
	String email;
	String address;
	String password;
	String confirmPassword;
	boolean newsletter;
	List <String> framework;
	String sex;
	Integer number;
	String country;
	List<String>skill;
	/**
	 * @author Steve Nguyen
	 * @return true if id is new =>> new user, false if id is not null =>> exist user
	 */
	public boolean isNew(){
		return (this.id==null);
	}
}
