package com.prowing.JavaBasedConfiguration;

import org.springframework.beans.factory.annotation.Value;

public class Shopee {
	
	@Value("Sai")
	private String name;
	
	@Value("PethVadgoan")
	private String address;
	
	@Value("007")
	private int licenceNumber;
	
	public Shopee() {
		super();
	}
	
	public Shopee(String name, String address, int licenceNumber) {
		super();
		this.name = name;
		this.address = address;
		this.licenceNumber = licenceNumber;
	}
	
	@Override
	public String toString() {
		return "Shopee [name=" + name + ", address=" + address + ", licenceNumber=" + licenceNumber + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getLicenceNumber() {
		return licenceNumber;
	}
	public void setLicenceNumber(int licenceNumber) {
		this.licenceNumber = licenceNumber;
	}
}
