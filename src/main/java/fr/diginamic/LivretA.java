package fr.diginamic;


import fr.diginamic.Banque.Compte;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LIVRET_A")
public class LivretA extends Compte {
	
	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "TAUX")
	private double taux;

	/**
	 * Constructeur
	 * 
	 */
	
	public LivretA() {
		
	}
	
	

	/** Constructeur
	 * @param id
	 * @param taux
	 */
	public LivretA(int id, double taux) {
		super();
		this.id = id;
		this.taux = taux;
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
