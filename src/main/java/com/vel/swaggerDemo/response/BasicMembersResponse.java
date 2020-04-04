package com.vel.swaggerDemo.response;

import javax.ws.rs.core.Response.Status;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "BasicMembersResponse")
@XmlAccessorType(XmlAccessType.FIELD)
public class BasicMembersResponse {

	@XmlElement(name = "Status")
	Status status = Status.OK;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BasicMembersResponse [status=" + status + "]";
	}
	
}
