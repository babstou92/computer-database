package com.excilys.ui;

import java.util.Scanner;

import com.excilys.service.Service;

public class Main {

	public static void main(String[] args) {
		
			
		Scanner scanner = new Scanner(System.in);
		String choixQuitter;
		int choixCommande;
		int choixId;
		
		do {
			System.out.println("Voici la liste de commandes que vous pouvez taper et leurs actions dans la base de donnée :");
			System.out.println(" 1 -> Afficher toutes les company "
							+ " \n 2 -> Afficher tous les computers "
							+ " \n 3 -> Afficher les infomations d'un computer "
							+ " \n 4 -> Créer une nouvelle entrée computer dans la base de donnée");
		
			System.out.println("Veuillez saisir une commande");		
			choixCommande = scanner.nextInt();
		
			if(1 <= choixCommande && choixCommande <= 4 ) {		
				switch (choixCommande) {
				case 1: 
					Service.findAllCompany(); 
					break;
				case 2:
					Service.findAllComputer();
					break;
				case 3:
					System.out.println("Veuillez choisir un Id");
					choixId = scanner.nextInt();
					Service.findOneComputer(choixId);
					break;
				case 4:
					Service.createOneComputer();
					break;
				}
			
				if(choixCommande == 3) {
					do { 
						System.out.println("\t Voici la liste de commandes que vous pouvez taper et leurs actions sur le computer récupéré :");
						System.out.println("\t 1 -> Mettre à jour une ou plusieurs données du computer séléctionné"
											+ "\n\t 2 -> Supprimer le computer séléctionné ");
						
						System.out.println("Veuillez saisir une commande");
						choixCommande = scanner.nextInt();
						
						if(choixCommande == 1 || choixCommande == 2) {		
							switch (choixCommande) {
								case 1: 
									Service.updateOneComputer(); 
									break;
								case 2:
									Service.deleteOneComputer();
									break;
							}
					
						} else { 
							System.out.println("Commande incorrecte");
						}
						
						System.out.println("Continuez ? (Y/N)");
						choixQuitter = scanner.next();
						
					} while (choixQuitter.toUpperCase().equals("Y"));
				}
			
			} else { 
				System.out.println("Commande incorrecte");					
			}
		
			System.out.println("Continuez ? (Y/N)");
			choixQuitter = scanner.next();
			
		} while (choixQuitter.toUpperCase().equals("Y"));
		
			System.out.println("Vous avez quittez le menu. Adios");

		
		}

}

