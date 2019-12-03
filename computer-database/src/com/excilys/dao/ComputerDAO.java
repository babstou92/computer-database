package com.excilys.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.excilys.models.Computer;

public class ComputerDAO {
	
	

	public Connection connect = ConnectionSQL.seConnecter();
	
	public List<Computer> findAll() {
		
		List<Computer> computerList = new ArrayList<Computer>();
		
		try {
			
			ResultSet resultat = this.connect.createStatement().executeQuery("SELECT * FROM computer");
			
			while (resultat.next()) {
				Computer computer = new Computer();
				computer.setCompanyIdComputer(resultat.getInt("company_id"));
				computer.setIdComputer(resultat.getInt("id"));
				computer.setDiscontinuedDateComputer(resultat.getDate("discontinued"));
				computer.setIntroducedDateComputer(resultat.getDate("introduced"));
				computer.setNameComputer(resultat.getString("name"));
				computerList.add(computer);
			    }
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return computerList;
	}
	
	public Computer findOne() {
			
		Computer computer = new Computer();
		try {
			
			ResultSet resultat = this.connect.createStatement().executeQuery("SELECT * FROM computer");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return computer;
	}


	public Computer create(ComputerDAO obj) {

		return null;
	}


	public Computer update(ComputerDAO obj) {

		return null;
	}


	public void delete(ComputerDAO obj) {

		
	}

}
