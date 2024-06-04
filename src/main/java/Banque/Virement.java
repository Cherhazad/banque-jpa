package Banque;

import Banque.Entites.Operation;

public class Virement extends Operation {

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
