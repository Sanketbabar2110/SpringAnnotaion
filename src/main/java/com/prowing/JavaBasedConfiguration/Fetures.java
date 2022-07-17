package com.prowing.JavaBasedConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Fetures {
	
	@Value("5000")
	private int battery;
	
	@Value("IOS")
	private String operatingSystem;
	
	@Value("64 GB")
	private String memory;
	
	@Value("MacOs")
	private String processor;
	
	public Fetures() {
		super();
	}
	
	public Fetures(int battery, String operatingSystem, String memory, String processor) {
		super();
		this.battery = battery;
		this.operatingSystem = operatingSystem;
		this.memory = memory;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Fetures [battery=" + battery + ", operatingSystem=" + operatingSystem + ", memory=" + memory
				+ ", processor=" + processor + "]";
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}
}
