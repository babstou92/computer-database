package com.excilys.ui;

import com.excilys.service.Service;

public class Main {

	public static void main(String[] args) {
		
		Service.findAllCompany(); 
		Service.findAllComputer();
		Service.findOneComputer();
		Service.createOneComputer();
		Service.deleteOneComputer();
		Service.updateOneComputer();
		
	}

}

