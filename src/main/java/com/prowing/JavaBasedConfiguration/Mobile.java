package com.prowing.JavaBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {
	
	@Value("Apple")
	private String compony;
	
	@Value("Iphone12")
	private String model;
	
	@Autowired
	private Fetures feture;
	public Mobile() {
		super();
	}
	
	public Mobile(String compony, String model, Fetures feture) {
		super();
		this.compony = compony;
		this.model = model;
		this.feture = feture;
	}
	
	@Override
	public String toString() {
		return "Mobile [compony=" + compony + ", model=" + model + ", feture=" + feture + "]";
	}
	
	public String getCompony() {
		return compony;
	}
	public void setCompony(String compony) {
		this.compony = compony;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Fetures getFeture() {
		return feture;
	}
	public void setFeture(Fetures feture) {
		this.feture = feture;
	}
}
