/*Devoir 2 OOP , Equipe 6 
 * Lokmen Abid 
 * Ibrahima Ba Cisse
 * Soumaila Saré
 * Ndiao Macodou Mbow 
 * Jose-Rockendy Hede
 * */

package Exam;


public class GestionnaireEquipes {
	public static void main(String[] args) {

		// création des joueurs 
		Joueur joueur1 = new Joueur("Ronaldinho","Gaúcho",40);
		Joueur joueur2 = new Joueur("Carlos","Roberto",42);
		Joueur joueur3 = new Joueur("Iniesta","Andreas",38);
		Joueur joueur4 = new Joueur("Pirlo","Andrea",41);
		Joueur joueur5 = new Joueur("Beckham","David",45); 
		Joueur joueur6 = new Joueur("Halland","Earling",22);
		Joueur joueur7 = new Joueur("Mbappee","Kilyan",23);
		Joueur joueur8 = new Joueur("DeJon","Frankie",27); 
		
		// création des équipes
		Equipe equipe1 = new Equipe("FCBarcelone",Categories.Senior);
		Equipe equipe2 = new Equipe("RealMadrid",Categories.Amateur);
		
		// Methode pour ajout joueurs on'a utiliser la méthode ajouterJoueur de la classe équipe 
		/* c'est mieux d'écrir au début une liste pour les joueurs 
		 * (( Joueur[] joueurs = new Joueur []{
		 * 	new Joueur("J1","N1",5) 
		 *  etc..
		 * }
		 * pour utiliser une boucle après pour remplir les équipes avec les joueurs 
		 * on'a éviter cette methode parce qu'on n'a pas encore étudier les boucles 
		 * */
		
		equipe1.ajouterJoueur(joueur1);
		equipe1.ajouterJoueur(joueur2);
		equipe1.ajouterJoueur(joueur3);
		equipe1.ajouterJoueur(joueur4);
		
		equipe2.ajouterJoueur(joueur5);
		equipe2.ajouterJoueur(joueur6);
		equipe2.ajouterJoueur(joueur7);
		equipe2.ajouterJoueur(joueur8);
		
		
		// donner des valeurs pour les parties gagner
		equipe1.setNbr_partie_gagnees(4);
		equipe2.setNbr_partie_gagnees(5);

		// on a ajouter 2 parties gagner pour l'equipe 1 
		equipe1.ajoutPartiesGagnees(2);
		  
		
		// on a fait la comparaison entre les deux equipe pour les parties gagner 
		//avec l'affichage de nom de l'équipe gagner 
		if((equipe1.getNbr_partie_gagnees())>(equipe2.getNbr_partie_gagnees())) {
			System.out.println(equipe1.getNom()+"a gagné plus de parties");
		}
		else {
				System.out.println(equipe2.getNom()+"a gagné plus de parties");
		}
		
		//affichage de nombre de joueur pour chaque équipe 
		System.out.println("Nombre des joueurs de "+equipe1.getNom()+"="+equipe1.nombreJoueurs()); 
		System.out.println("Nombre des joueurs de "+equipe2.getNom()+"="+equipe2.nombreJoueurs()); 
		
		// on a supprimé le joueur d'indice 3 pour 1er équipe 
		equipe1.supprimerJoueur(3);
		
		// on a affiché les joueurs de 2 équipes 
		System.out.println("Les joueurs de "+equipe1.getNom()+"="+equipe1.getListJoueur()); 
		System.out.println("Les joueurs de "+equipe2.getNom()+"="+equipe2.getListJoueur()); 



	}

}
