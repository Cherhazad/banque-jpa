package fr.diginamic.Banque;

import java.util.Date;
import fr.diginamic.Banque.Compte;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "OPERATION")
public class Operation {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "DATE")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name = "MONTANT")
	private double montant;
	
	@Column(name = "MOTIF")
	private String motif;
	
	@ManyToOne
	@JoinColumn(name = "ID_COMPTES")
	private Compte comptes;

	/**
	 * Constructeur
	 * 
	 */
	public Operation() {
		super();
	}
	
	

	/** Constructeur
	 * @param id
	 * @param date
	 * @param montant
	 * @param motif
	 */
	public Operation(int id, Date date, double montant, String motif) {
		super();
		this.id = id;
		this.date = date;
		this.montant = montant;
		this.motif = motif;
	}



	/**
	 * Getter pour date
	 * 
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * Setter pour date
	 * 
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * Getter pour montant
	 * 
	 * @return the montant
	 */
	public double getMontant() {
		return montant;
	}

	/**
	 * Setter pour montant
	 * 
	 * @param montant the montant to set
	 */
	public void setMontant(double montant) {
		this.montant = montant;
	}

	/**
	 * Getter pour motif
	 * 
	 * @return the motif
	 */
	public String getMotif() {
		return motif;
	}

	/**
	 * Setter pour motif
	 * 
	 * @param motif the motif to set
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}

	@Override
	public String toString() {
		return "Operation [date=" + date + ", montant=" + montant + ", motif=" + motif + "]";
	}
	
	

}
