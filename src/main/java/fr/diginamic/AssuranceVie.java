package fr.diginamic;

import java.util.Date;

import fr.diginamic.Banque.Compte;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@DiscriminatorValue("A")
public class AssuranceVie extends Compte {

	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "DATE_FIN")
	@Temporal(TemporalType.DATE)
	private Date dateFin;
	
	@Column(name = "TAUX")
	private double taux;

	/**
	 * Constructeur
	 * 
	 */
	public AssuranceVie() {
	}
	
	

	/** Constructeur
	 * @param id
	 * @param dateFin
	 * @param taux
	 */
	public AssuranceVie(int id, Date dateFin, double taux) {
		super();
		this.id = id;
		this.dateFin = dateFin;
		this.taux = taux;
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
