package com.ibm.artifact.beans;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;

@XmlRootElement(name = "Apple")
public class Apple {
	
	@JsonProperty("name")
	protected String name;
	@JsonProperty("color")
	protected String color;
	
	public Apple() {
		super();
		
	}
	public Apple(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	

}
