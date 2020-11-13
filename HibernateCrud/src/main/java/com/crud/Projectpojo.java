package com.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Projectpojo {
	
	
	@Id
	@Column
	private int proId;
	
	@Column
	private String proName;
	
	@Override
	public String toString() {
		return "Projectpojo [proId=" + proId + ", proName=" + proName + ", proNumber=" + proNumber + ", proSalary="
				+ proSalary + "]";
	}


	@Column
	private int proNumber;
	
	@Column
	private int proSalary;


	public int getProId() {
		return proId;
	}


	public void setProId(int proId) {
		this.proId = proId;
	}


	public String getProName() {
		return proName;
	}


	public void setProName(String proName) {
		this.proName = proName;
	}


	public int getProNumber() {
		return proNumber;
	}


	public void setProNumber(int proNumber) {
		this.proNumber = proNumber;
	}


	public int getProSalary() {
		return proSalary;
	}


	public void setProSalary(int proSalary) {
		this.proSalary = proSalary;
	}


	public Projectpojo(int proId, String proName, int proNumber, int proSalary) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proNumber = proNumber;
		this.proSalary = proSalary;
	}
	
	
	
	
	
	
	

}
