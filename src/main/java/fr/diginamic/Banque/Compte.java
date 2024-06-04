package fr.diginamic.Banque;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "COMPTE")
public class Compte {

	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NUMERO")
	private String numero;
	
	@Column(name = "SOLDE")
	private double solde;
	
	@OneToMany(mappedBy = "comptes")
	private Set<Operation> operations;
	
	@ManyToMany
	@JoinTable(name = "COMPTES_CLIENTS",
			joinColumns = @JoinColumn(name = "ID_COM", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name = "ID_CLI", referencedColumnName = "ID"))

	private Set<Client> clients;

	/**
	 * Constructeur
	 * 
	 */
	public Compte() {
		super();
	}
	
	

	/** Constructeur
	 * @param id
	 * @param numero
	 * @param solde
	 * @param operations
	 */
	public Compte(int id, String numero, double solde) {
		super();
		this.id = id;
		this.numero = numero;
		this.solde = solde;
	}



	/**
	 * Getter pour numero
	 * 
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * Setter pour numero
	 * 
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * Getter pour solde
	 * 
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}

	/**
	 * Setter pour solde
	 * 
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]";
	}

}
