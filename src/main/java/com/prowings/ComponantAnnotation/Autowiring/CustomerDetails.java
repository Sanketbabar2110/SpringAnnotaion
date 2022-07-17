package com.prowings.ComponantAnnotation.Autowiring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CustomerDetails {
	
	@Value("0113657")
	private int adharNum;
	
	@Value("Shree")
	private String name;
	
	@Value("Kolhapur")
	private String city;
	
	public CustomerDetails() {
		super();
	}
	
	public CustomerDetails(int adharNum, String name, String city) {
		super();
		this.adharNum = adharNum;
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "CustomerDetails [adharNum=" + adharNum + ", name=" + name + ", city=" + city + "]";
	}
	
	public int getAdharNum() {
		return adharNum;
	}
	public void setAdharNum(int adharNum) {
		this.adharNum = adharNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
