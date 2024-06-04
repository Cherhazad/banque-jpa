package Banque;

import Banque.Entites.Compte;

public class LivretA extends Compte {

	private double taux;

	/**
	 * Constructeur
	 * 
	 */
	
	public LivretA() {
		super();
	}

	/**
	 * Getter pour taux
	 * 
	 * @return the taux
	 */
	public double getTaux() {
		return taux;
	}

	/**
	 * Setter pour taux
	 * 
	 * @param taux the taux to set
	 */
	public void setTaux(double taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "LivretA [taux=" + taux + "]";
	}

}
