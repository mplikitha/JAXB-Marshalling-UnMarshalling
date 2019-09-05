package com.ex.javax.marshalling.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employee")
public class Employee {


	private int id;

	
	private String name;

	
	private String location;

	
	private String project;

	public Employee() {
		super();

	}

	public Employee(int id, String name, String location, String project) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.project = project;
	}

	@XmlAttribute(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "location")
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@XmlElement(name = "project")
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

}
