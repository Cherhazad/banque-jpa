package fr.diginamic.Banque;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "CLIENT")
public class Client {

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "NOM")
	private String nom;

	@Column(name = "PRENOM")
	private String prenom;

	@Column(name = "DATE_NAISSANCE")
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;

	@ManyToMany
	@JoinTable(name = "BANQUES_CLIENTS",
		joinColumns = @JoinColumn(name = "ID_CLI", referencedColumnName ="ID"),
		inverseJoinColumns = @JoinColumn(name = "ID_BAN", referencedColumnName = "ID"))
	private Set<Banque> banques = new HashSet<>();

	@ManyToMany
	@JoinTable(name = "COMPTES_CLIENTS", 
		joinColumns = @JoinColumn(name = "ID_CLI", referencedColumnName = "ID"), 
		inverseJoinColumns = @JoinColumn(name = "ID_COM", referencedColumnName = "ID"))
	private Set<Compte> comptes = new HashSet<>();

	@Embedded
	private Adresse adresses;

	/**
	 * Constructeur
	 * 
	 */
	public Client() {
		super();
	}

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param dateNaissance
	 */
	public Client(int id, String nom, String prenom, Date dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;

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

	/**
	 * Getter pour prenom
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter pour prenom
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter pour dateNaissance
	 * 
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Setter pour dateNaissance
	 * 
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}

	/**
	 * Getter pour banques
	 * 
	 * @return the banques
	 */
	public Set<Banque> getBanques() {
		return banques;
	}

	/**
	 * Setter pour banques
	 * 
	 * @param banques the banques to set
	 */
	public void setBanques(Set<Banque> banques) {
		this.banques = banques;
	}

	/**
	 * Getter pour comptes
	 * 
	 * @return the comptes
	 */
	public Set<Compte> getComptes() {
		return comptes;
	}

	/**
	 * Setter pour comptes
	 * 
	 * @param comptes the comptes to set
	 */
	public void setComptes(Set<Compte> comptes) {
		this.comptes = comptes;
	}

	/**
	 * Getter pour adresses
	 * 
	 * @return the adresses
	 */
	public Adresse getAdresses() {
		return adresses;
	}

	/**
	 * Setter pour adresses
	 * 
	 * @param adresses the adresses to set
	 */
	public void setAdresses(Adresse adresses) {
		this.adresses = adresses;
	}

}
