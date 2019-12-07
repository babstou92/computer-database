package com.excilys.service;


import com.excilys.dao.ComputerDAO;
import com.excilys.models.Computer;

public class ServiceComputer {
	
	
	private static ComputerDAO computerDAO = ComputerDAO.getComputerDAO();
	
	
	public static void findAllComputer() {
		for(Computer computer : computerDAO.findAll()) {
			System.out.println(computer.toString());
		}
	}

	public static void findOneComputer(int id) {	
		System.out.println((computerDAO.findOne(id)).toString());
	}
	
	public static void deleteOneComputer() {
		computerDAO.delete(13);
	}
	
	public static void createOneComputer() {
		computerDAO.create("MacBook 16", null, null, 2);
	}
	//a terminé
	public static void updateOneComputer() {
		//computerDAO.update(63);
	}

}
