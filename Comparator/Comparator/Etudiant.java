package Comparator;

import java.util.List;

public class Etudiant {
	private String nom;
	private String prenom;
	private int id;
	
	Etudiant(String nom, String prenom, int id){
		this.nom=nom;
		this.prenom=prenom;
		this.id=id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public int getId() {
		return id;
	}
	
}
