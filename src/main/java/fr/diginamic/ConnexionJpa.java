package fr.diginamic;

import java.util.Calendar;
import java.util.Date;

import fr.diginamic.Banque.Adresse;
import fr.diginamic.Banque.Banque;
import fr.diginamic.Banque.Client;
import fr.diginamic.Banque.Compte;
import fr.diginamic.Banque.Operation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ConnexionJpa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banque");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		transaction.begin();

		// Instanciation des objets

		// Adresse

		Adresse adresse1 = new Adresse(1, 10, "Rue de la Poste", 34000, "Montpellier");
		Adresse adresse2 = new Adresse(2, 287, "Avenue de Palavas", 34070, "Montpellier");

		// Compte

		Compte compte1 = new Compte(1, "FR75 2670 7609 2356 A58", 29876.89);
		em.persist(compte1);

		Compte compte2 = new Compte(2, "FR65 1256 7634 8798 Z28", 1768.56);
		em.persist(compte2);

		Compte compte3 = new Compte(3, "FR27 9865 2456 1745 H76", 23.98);

		// Banque

		Banque banque1 = new Banque(1, "LCL");
		em.persist(banque1);

		Banque banque2 = new Banque(2, "La Banque Populaire");
		em.persist(banque2);

		// Client

		Calendar cal = Calendar.getInstance();
		cal.set(1988, 04, 23);
		Date date1 = cal.getTime();
		cal.set(1997, 01, 02);
		Date date2 = cal.getTime();

		Client client1 = new Client(1, "Brigand", "Pierre", date1);
		client1.setAdresses(adresse1);
		client1.getBanques().add(banque1); // fonctionne car on a mis une relation maître/maître des deux côtés. Si on a
											// un ManyToMany et un mappedBy, alors c'est la classe maître qui doit
											// recevoir donc ici compte qui va recevoir un client et non l'inverse.
		client1.getComptes().add(compte1);
		em.persist(client1);

		Client client2 = new Client(2, "Durant", "Julien", date2);
		client2.setAdresses(adresse2);
		client2.getBanques().add(banque2);
		client2.getComptes().add(compte2);
		em.persist(client2);

		// Operation

		cal.set(2024, 06, 04);
		Date date3 = cal.getTime();
		Operation ope1 = new Operation(1, date3, 265.99, "Location AirB&b");
		ope1.setComptes(compte1);
		em.persist(ope1);

		cal.set(2024, 06, 04);
		Date date4 = cal.getTime();
		Operation ope2 = new Operation(2, date4, 198.99, "Cadeau anniversaire Juliette");
		ope2.setComptes(compte2);
		em.persist(ope2);

		// insérer un compte associé à 2 clients

		compte3.getClients().add(client1);
		compte3.getClients().add(client2);
		em.persist(compte3);

//		// Assurance Vie
//		cal.set(2032, 8, 31);
//		Date date5 = cal.getTime();
//		AssuranceVie assur1 = new AssuranceVie(3, date5, 10.5);
//		assur1.setNumero("FR45 7687 2456 1745 H18");
//		assur1.setSolde(18765.78);
//		em.persist(assur1);

		// Livret A

		LivretA livret1 = new LivretA(4, 6);
		livret1.setNumero("FR58 2367 2198 1919 A56");
		livret1.setSolde(2256.78);
		em.persist(livret1);

		// Insérer un client avec plusieurs comptes

		Client client3 = new Client();
		client3.getComptes().add(livret1);
//		client3.getComptes().add(assur1);
		em.persist(client3);

		transaction.commit();

		em.close();

	}

}
