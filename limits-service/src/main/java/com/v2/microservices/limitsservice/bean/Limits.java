package com.v2.microservices.limitsservice.bean;

public class Limits {

	int minumun;
	int maximun;

	public int getMinumun() {
		return minumun;
	}

	public void setMinumun(int minumun) {
		this.minumun = minumun;
	}

	public int getMaximun() {
		return maximun;
	}

	public void setMaximun(int maximun) {
		this.maximun = maximun;
	}

	public Limits(int minumun, int maximun) {
		super();
		this.minumun = minumun;
		this.maximun = maximun;
	}

	public Limits() {
		super();
	}

}
