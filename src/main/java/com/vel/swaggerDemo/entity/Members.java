package com.vel.swaggerDemo.entity;

import com.vel.swaggerDemo.utill.BodyType;
import com.vel.swaggerDemo.utill.Complexion;
import com.vel.swaggerDemo.utill.MarriedStatus;
import com.vel.swaggerDemo.utill.PhysicalStatus;
import com.vel.swaggerDemo.utill.SexStatus;

public class Members {
	
	private int id;
	
	private String name;
	
	private int age;
	
	private MarriedStatus marriedStatus = MarriedStatus.SINGLE;
	
	private SexStatus sexStatus = SexStatus.MALE;
	
	private BodyType bodyType = BodyType.AVERAGE;
	
	private Complexion complexion = Complexion.FAIR;
	
	private int height;
	
	private int weight;
	
	private String mothertongue;
	
	private PhysicalStatus physicalStatus = PhysicalStatus.NORMAL;

	private String languagesKnown;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public MarriedStatus getMarriedStatus() {
		return marriedStatus;
	}

	public void setMarriedStatus(MarriedStatus marriedStatus) {
		this.marriedStatus = marriedStatus;
	}

	public SexStatus getSexStatus() {
		return sexStatus;
	}

	public void setSexStatus(SexStatus sexStatus) {
		this.sexStatus = sexStatus;
	}

	public BodyType getBodyType() {
		return bodyType;
	}

	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

	public Complexion getComplexion() {
		return complexion;
	}

	public void setComplexion(Complexion complexion) {
		this.complexion = complexion;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getMothertongue() {
		return mothertongue;
	}

	public void setMothertongue(String mothertongue) {
		this.mothertongue = mothertongue;
	}

	public PhysicalStatus getPhysicalStatus() {
		return physicalStatus;
	}

	public void setPhysicalStatus(PhysicalStatus physicalStatus) {
		this.physicalStatus = physicalStatus;
	}

	public String getLanguagesKnown() {
		return languagesKnown;
	}

	public void setLanguagesKnown(String languagesKnown) {
		this.languagesKnown = languagesKnown;
	}

	@Override
	public String toString() {
		return "Members [id=" + id + ", name=" + name + ", age=" + age + ", marriedStatus=" + marriedStatus
				+ ", sexStatus=" + sexStatus + ", bodyType=" + bodyType + ", complexion=" + complexion + ", height="
				+ height + ", weight=" + weight + ", mothertongue=" + mothertongue + ", physicalStatus="
				+ physicalStatus + ", languagesKnown=" + languagesKnown + "]";
	}

}
