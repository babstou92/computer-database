package com.excilys.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.excilys.models.Company;


public class CompanyDAO  {
	
	

	public Connection connect = ConnectionSQL.seConnecter();
	
	public List<Company> findAll() {
		
		List<Company> companyList = new ArrayList<Company>();
		
		try {             

			ResultSet resultat = this.connect.createStatement().executeQuery("SELECT * FROM company ");

			while (resultat.next()) {
				Company company = new Company();
				company.setIdCompany(resultat.getInt("id"));
				company.setNameCompany(resultat.getString("name"));
				companyList.add(company); 
				}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return companyList;
	}




}
