package fr.diginamic;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OPERATION")
public class Operation {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "DATE")
	private Date date;
	
	@Column(name = "MONTANT")
	private double montant;
	
	@Column(name = "MOTIF")
	private String motif;

	/**
	 * Constructeur
	 * 
	 */
	public Operation() {
		super();
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
