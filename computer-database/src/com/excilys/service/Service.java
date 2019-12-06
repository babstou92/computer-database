package com.excilys.service;

import com.excilys.dao.CompanyDAO;
import com.excilys.dao.ComputerDAO;
import com.excilys.models.Company;
import com.excilys.models.Computer;

public class Service {
	
	private static CompanyDAO companyDAO = CompanyDAO.getCompanyDAO();
	private static ComputerDAO computerDAO = ComputerDAO.getComputerDAO();
	
	public static void findAllCompany() {
		for(Company company : companyDAO.findAll()) {
			System.out.println(company.toString());
		}
	}
	
	public static void findAllComputer() {
		for(Computer computer : computerDAO.findAll()) {
			System.out.println(computer.toString());
		}
	}

	public static void findOneComputer() {	
		System.out.println((computerDAO.findOne(5)).toString());
	}
	
	public static void deleteOneComputer() {
		computerDAO.delete(102);
	}
	
	public static void createOneComputer() {
		computerDAO.create("MacBook 16", null, null, 2);
	}
	
	public static void updateOneComputer() {
		computerDAO.update(63);
	}
}
