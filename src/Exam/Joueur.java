/*Devoir 2 OOP , Equipe 6 
 * Lokmen Abid 
 * Ibrahima Ba Cisse
 * Soumaila Saré
 * Ndiao Macodou Mbow 
 * Jose-Rockendy Hede
 * */

package Exam;


// Class Joueur 
public class Joueur {
	
	// Les Variables d'instance de la classe Joueur 
	private String nom; 
	private String prenom ; 
	private int age ; 
	
	
	// Le constructeur de la classe Joueur 
	public Joueur (String name, String firstName , int Age) {
		nom=name;
		prenom=firstName; 
		age=Age; 
	}
	
	
	/* methode toString qui nous permet d'afficher les variables d'instances 
	de la classe Joueur sous la forme d'une chaine de caractère */
	public String toString() {
		return "Joueur [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
