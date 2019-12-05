package com.excilys.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.excilys.models.Company;



public class CompanyDAO  {
	
	
	//appelle la methode static de la classe CoSQL - stocke le return dans l'objet connect de la classe Connection
	public Connection connect = ConnectionSQL.seConnecter();
	
	//methode pour recup tous les elements de la table Company
	public List<Company> findAll() {
		
		List<Company> companyList = new ArrayList<Company>();
		
		try {             
			//on stocke le resultat de la requete dans l'obj resultat - this correspond a l'instance de CompanyDAO appellant la methode
			//createStatement contient la requete SQL et la transmet à la BDD - executeQ methode de la classe Statement pour lire des données
			ResultSet resultat = this.connect.createStatement().executeQuery("SELECT * FROM company ;");
			
			// tant que l'element suivant de la requete existe, on creer un nouvel objet company basé sur le modele 
			// le nouvel objet company est add a la liste companyList
			while (resultat.next()) {

				int id = resultat.getInt("id");
				String name = resultat.getString("name");
				Company company = new Company(id, name);
				companyList.add(company); 
				}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return companyList;
	}

}
