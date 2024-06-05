package fr.diginamic;

import fr.diginamic.Banque.Operation;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "VIREMENT")
public class Virement extends Operation {

	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "BENEFICIAIRE")
	private String beneficiaire;

	/**
	 * Constructeur
	 * 
	 */
	public Virement() {
		super();
	}

	/**
	 * Getter pour beneficiaire
	 * 
	 * @return the beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * Setter pour beneficiaire
	 * 
	 * @param beneficiaire the beneficiaire to set
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

	@Override
	public String toString() {
		return "Virement [beneficiaire=" + beneficiaire + "]";
	}

}
