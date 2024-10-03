/*Devoir 2 OOP , Equipe 6 
 * Lokmen Abid 
 * Ibrahima Ba Cisse
 * Soumaila Saré
 * Ndiao Macodou Mbow 
 * Jose-Rockendy Hede
 * */

package Exam;
// on a importer les bibliothèque List et ArrayList pour nous manipule les listes 
import java.util.ArrayList;
import java.util.List;


// La classe Equipe 
public class Equipe {
	
	
	// Les variables d’instances de La classe Equipe :
	private String nom ; 
	private int nbr_partie_gagnees ; 
	private Categories categories ; 
	private ArrayList<Joueur> listJoueur ; 
	
	// Le constructeur de la classe Equipe 
	public Equipe(String name, Categories cat) {
		nom = name;
		categories = cat;
		listJoueur = new ArrayList<>(); 
		nbr_partie_gagnees = 0; 
	}

	//l'accesseur et mutateur de la Variable Nom : 
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	//l'accesseur et mutateur de la Variable NBR_partie_gagnees : 
	public int getNbr_partie_gagnees() {
		return nbr_partie_gagnees;
	}


	public void setNbr_partie_gagnees(int nbr_partie_gagnees) {
		this.nbr_partie_gagnees = nbr_partie_gagnees;
	}

	//l'accesseur et mutateur de la Variable categories : 
	public Categories getCategories() {
		return categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	
	//l'accesseur et mutateur de la Variable listJoueur : 
	public List<Joueur> getListJoueur() {
		return listJoueur;
	}


	public void setListJoueur(ArrayList<Joueur> listJoueur) {
		this.listJoueur = listJoueur;
	}
	
	/* Methode ajoutPartiesGagnees qui nous permet d’incrémenter d’une
	certaine quantité le nombre de parties gagner*/ 
	
	public int ajoutPartiesGagnees(int nbr_pg) {
		return nbr_partie_gagnees+=nbr_pg ; 
	}
	
	
	/* Une méthode nombreJoueurs qui retourne le nombre de joueurs dans la
	liste. On a utilisé la methode pré-definie .size() qui donne la longeur 
	de la liste et dans notre cas c'est le nombre des joueurs */

	public int nombreJoueurs () {
		return listJoueur.size();
	}
	
	/*Une méthode ajouterJoueur permettant d’ajouter un joueur à la liste de
	joueurs (à la fin de la liste). On a utilisé la methode pré-definie .add() 
	qui nous permet d'ajouter un element à la fin de tableau */
	
	public void ajouterJoueur (Joueur J) {
		listJoueur.add(J); 
	}
	
	/*Une méthode supprimerJoueur permettant de supprimer un joueur de la
	liste de joueurs à partir de son indice. On a utilisé la mathode pré-definie 
	.remove() qui nous permet de supprimer un element de son position dans le tableau*/ 
	
	public void supprimerJoueur (int index) {
		listJoueur.remove(index); 
	}
	
	
	/* la méthode toString */
	public String toString() {
		return "Equipe [nom=" + nom + ", nbr_partie_gagnees=" + nbr_partie_gagnees + ", categories=" + categories
				+ ", listJoueur=" + listJoueur + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
