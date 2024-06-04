package fr.diginamic;

import java.util.Date;

import fr.diginamic.Banque.Compte;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class AssuranceVie extends Compte {

	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "ID")
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@Column(name = "TAUX")
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
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * Setter pour dateFin
	 * 
	 * @param dateFin the dateFin to set
	 */
	public void setDateFin(Date dateFin) {
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
