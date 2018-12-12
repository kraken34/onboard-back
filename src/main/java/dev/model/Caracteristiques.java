package dev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Caracteristiques {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	int longueur;
	int largeur;
	int poids;
	int[] empatement;
	int largeurRoues;
	public int getLongueur() {
		return longueur;
	}
	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}
	public int getLargeur() {
		return largeur;
	}
	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int poids) {
		this.poids = poids;
	}
	public int[] getEmpatement() {
		return empatement;
	}
	public void setEmpatement(int[] empatement) {
		this.empatement = empatement;
	}
	public int getLargeurRoues() {
		return largeurRoues;
	}
	public void setLargeurRoues(int largeurRoues) {
		this.largeurRoues = largeurRoues;
	}
}