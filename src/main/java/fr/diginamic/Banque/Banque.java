package fr.diginamic.Banque;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "BANQUE")
public class Banque {

	@Id
	@Column(name = "ID")
	private int id;
	
	@Column(name = "NOM")
	private String nom;
	
	@ManyToMany
	@JoinTable(name = "BANQUES_CLIENTS",
		joinColumns = @JoinColumn(name = "ID_BAN", referencedColumnName ="ID"),
		inverseJoinColumns = @JoinColumn(name = "ID_CLI", referencedColumnName = "ID"))
	private Set<Client> clients;

	/**
	 * Constructeur
	 * 
	 */
	public Banque() {
		super();
	}
	
	

	/** Constructeur
	 * @param id
	 * @param nom
	 * @param clients
	 */
	public Banque(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}



	/**
	 * Getter pour id
	 * 
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Setter pour id
	 * 
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Getter pour nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter pour nom
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + "]";
	}

}
