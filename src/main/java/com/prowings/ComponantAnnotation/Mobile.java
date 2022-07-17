package com.prowings.ComponantAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {
	
	@Value("Oppo_Reno")
	private String model;
	
	@Value("Oppo")
	private String compony;
	
	@Value("29000")
	private int prize;
	
	public Mobile() {
		super();
	}
	
	public Mobile(String model, String compony, int prize) {
		super();
		this.model = model;
		this.compony = compony;
		this.prize = prize;
	}
	
	@Override
	public String toString() {
		return "Mobile [model=" + model + ", compony=" + compony + ", prize=" + prize + "]";
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompony() {
		return compony;
	}
	public void setCompony(String compony) {
		this.compony = compony;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
}
