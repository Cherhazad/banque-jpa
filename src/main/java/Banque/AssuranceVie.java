package Banque;

import java.time.LocalDate;

import Banque.Entites.Compte;

public class AssuranceVie extends Compte {

	private LocalDate dateFin;
	private double taux;

	/**
	 * Constructeur
	 * 
	 */
	public AssuranceVie() {
		super();
	}

	/**
	 * Getter pour dateFin
	 * 
	 * @return the dateFin
	 */
	public LocalDate getDateFin() {
		return dateFin;
	}

	/**
	 * Setter pour dateFin
	 * 
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
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
		return "AssuranceVie [dateFin=" + dateFin + ", taux=" + taux + "]";
	}

}
