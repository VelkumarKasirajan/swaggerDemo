package com.vel.swaggerDemo.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.vel.swaggerDemo.utill.BodyType;
import com.vel.swaggerDemo.utill.Complexion;
import com.vel.swaggerDemo.utill.MarriedStatus;
import com.vel.swaggerDemo.utill.PhysicalStatus;
import com.vel.swaggerDemo.utill.SexStatus;

@XmlRootElement(name = "BasicMembersRequest")
@XmlAccessorType(XmlAccessType.FIELD)
public class BasicMembersRequest {

	@XmlElement(name = "id", required = true)
	private int id;
	
	@XmlElement(name = "name", required = true)
	private String name;
	
	@XmlElement(name = "age", required = true)
	private int age;
	
	@XmlElement(name = "marriedStatus", required = true)
	private MarriedStatus marriedStatus = MarriedStatus.SINGLE;
	
	@XmlElement(name = "sexStatus", required = true)
	private SexStatus sexStatus = SexStatus.MALE;
	
	@XmlElement(name = "bodyType", required = true)
	private BodyType bodyType = BodyType.AVERAGE;
	
	@XmlElement(name = "complexion", required = true)
	private Complexion complexion = Complexion.FAIR;
	
	@XmlElement(name = "height", required = true)
	private int height;
	
	@XmlElement(name = "weight", required = true)
	private int weight;
	
	@XmlElement(name = "mothertongue", required = true)
	private String mothertongue;
	
	@XmlElement(name = "physicalStatus", required = true)
	private PhysicalStatus physicalStatus = PhysicalStatus.NORMAL;

	@XmlElement(name = "languagesKnown", required = true)
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
		return "BasicMembersRequest [id=" + id + ", name=" + name + ", age=" + age + ", marriedStatus=" + marriedStatus
				+ ", sexStatus=" + sexStatus + ", bodyType=" + bodyType + ", complexion=" + complexion + ", height="
				+ height + ", weight=" + weight + ", mothertongue=" + mothertongue + ", physicalStatus="
				+ physicalStatus + ", languagesKnown=" + languagesKnown + "]";
	}
	
}
