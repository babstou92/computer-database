package com.excilys.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.excilys.models.Company;
import com.excilys.models.Computer;


public class ComputerDAO {
	
	
	public Connection connect = ConnectionSQL.seConnecter();
	
	private static final String SELECT_ALL_COMPUTER = "SELECT  computer.id, computer.name, computer.introduced, computer.discontinued, "
														+ "computer.company_id, company.name AS company_name "
														+ "FROM computer, company "
														+ "WHERE computer.company_id = company.id;";
												
	
	public List<Computer> findAll() {
		
		List<Computer> computerList = new ArrayList<Computer>();
		
		try {
			
			//PreparedStatement statement = connect.prepareStatement(SELECT_ALL_COMPUTER);
			ResultSet resultat = this.connect.createStatement().executeQuery(SELECT_ALL_COMPUTER);
			
			while (resultat.next()) {
				
				int id = resultat.getInt("id");
				Date dateDis = resultat.getDate("discontinued");
				Date dateInt = resultat.getDate("introduced");
				String name = resultat.getString("name");
				int company_id = resultat.getInt("company_id");
				String company_name = resultat.getString("company_name");
				
				
				Computer computer = new Computer(id, name, dateInt, dateDis, new Company(company_id, company_name) );
				computerList.add(computer);
			    }
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return computerList;
	}
	
	public Computer findOne(int idSearch) {
			
		Computer computer = null;
		
		try {
			
			 String selectOneComputer ="SELECT  computer.id, computer.name, computer.introduced, computer.discontinued, "
						+ "computer.company_id, company.name AS company_name "
						+ "FROM computer, company "
						+ "WHERE computer.company_id = company.id "
						+"AND company.id = "+idSearch+" ;" ;
			 
			 
			ResultSet resultat = this.connect.createStatement().executeQuery(selectOneComputer);

			resultat.next();

				int company_id = resultat.getInt("company_id");
				Date dateDis = resultat.getDate("discontinued");
				Date dateInt = resultat.getDate("introduced");
				String name = resultat.getString("name");				
				String company_name = resultat.getString("company_name");
				
				
				computer = new Computer(idSearch, name, dateInt, dateDis, new Company(company_id, company_name)); 

			
		} catch (SQLException e ) {
			e.printStackTrace();
		}
		
		return computer;
	}


	public Computer create(String computerName, Date introduced, Date discontinued, int company_id) {
		try {
			String createOneComputer = "INSERT into computer (id,name,introduced,discontinued,company_id) "
										+ "VALUES (id,"+computerName+","+introduced+","+discontinued+","+company_id+")";
			
			this.connect.createStatement().executeUpdate(createOneComputer);
			System.out.println("Creation d'un nouceau computer avec succès.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}


	public Computer update(ComputerDAO obj) {

		return null;
	}


	public void delete(int idSearch) {
		try {
			String deleteOneComputer = "DELETE from computer "
										+ "WHERE id = "+idSearch+"";
			
			this.connect.createStatement().executeUpdate(deleteOneComputer);
			System.out.println("le computeur avec l'id "+idSearch+" a été supprimé avec succès.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
