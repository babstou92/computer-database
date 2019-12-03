package com.excilys.ui;

import com.excilys.dao.CompanyDAO;
import com.excilys.dao.ComputerDAO;
import com.excilys.models.Company;
import com.excilys.models.Computer;

public class Main {

	public static void main(String[] args) {
		
		for(Company company : new CompanyDAO().findAll()) {
			System.out.println(company.toString());
		}
		
		for(Computer computer : new ComputerDAO().findAll()) {
			System.out.println(computer.toString());
		}
		
	}

}
