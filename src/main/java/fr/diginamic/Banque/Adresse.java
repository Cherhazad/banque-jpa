package fr.diginamic.Banque;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Id;

@Embeddable
public class Adresse {
	
	@Column(name = "NUMERO")
	private int numero;
	
	@Column(name = "RUE")
	private String rue;
	
	@Column(name = "CODE_POSTAL")
	private int codePostal;
	
	@Column(name = "VILLE")
	private String ville;
	
	

	/**
	 * Constructeur
	 * 
	 */
	public Adresse() {
		super();
	}
	

	/** Constructeur
	 * @param id
	 * @param numero
	 * @param rue
	 * @param codePostal
	 * @param ville
	 */
	public Adresse(int numero, String rue, int codePostal, String ville) {

		this.numero = numero;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
	}



	/**
	 * Getter pour numero
	 * 
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter pour numero
	 * 
	 * @param numero the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter pour rue
	 * 
	 * @return the rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * Setter pour rue
	 * 
	 * @param rue the rue to set
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * Getter pour codePostal
	 * 
	 * @return the codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter pour codePostal
	 * 
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter pour ville
	 * 
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter pour ville
	 * 
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}




}
