package com.vel.swaggerDemo.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "RegisterUserRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class RegisterUserRequest {

	@XmlElement(name = "UserName", required = true)
	private String userName;
	
	@XmlElement(name = "Password", required = true)
	private String password;
	
	@XmlElement(name = "MobileNumber", required = true)
	private String mobileNumber;
	
	@XmlElement(name = "Email", required = true)
	private String email;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "RegisterUserRequest [userName=" + userName + ", password=" + password + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + "]";
	}
	
}
