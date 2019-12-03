package com.excilys.models;

import java.util.Date;

public class Computer {
	
	private int idComputer;
	private String nameComputer;
	private Date introducedDateComputer;
	private Date discontinuedDateComputer;
	private  int companyIdComputer;
	
	
	public int getIdComputer() {
		return idComputer;
	}
	
	public void setIdComputer(int idComputer) {
		this.idComputer = idComputer;
	}
	
	public String getNameComputer() {
		return nameComputer;
	}
	
	public void setNameComputer(String nameComputer) {
		this.nameComputer = nameComputer;
	}
	
	public Date getIntroducedDateComputer() {
		return introducedDateComputer;
	}
	
	public void setIntroducedDateComputer(Date introducedDateComputer) {
		this.introducedDateComputer = introducedDateComputer;
	}
	
	public Date getDiscontinuedDateComputer() {
		return discontinuedDateComputer;
	}
	
	public void setDiscontinuedDateComputer(Date discontinuedDateComputer) {
		this.discontinuedDateComputer = discontinuedDateComputer;
	}
	
	public int getCompanyIdComputer() {
		return companyIdComputer;
	}
	
	public void setCompanyIdComputer(int companyIdComputer) {
		this.companyIdComputer = companyIdComputer;
	}


	public String toString() {
		return "Computer [idComputer=" + idComputer + ", nameComputer=" + nameComputer + ", introducedDateComputer="
				+ introducedDateComputer + ", discontinuedDateComputer=" + discontinuedDateComputer
				+ ", companyIdComputer=" + companyIdComputer + "]";
	}
	
	
}
