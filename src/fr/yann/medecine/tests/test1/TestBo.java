package fr.yann.medecine.tests.test1;

import java.time.LocalDate;

import fr.yann.medecine.model.Adresse;
import fr.yann.medecine.model.MedecinGeneraliste;
import fr.yann.medecine.model.Patient;

public class TestBo {
	public static void main(String[] args) {
		VerifMedecins();
		VerifPatients();
		//VerifAdresses();
	}

	private static void VerifMedecins() {
		Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain");
		Adresse nio = new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort");
		Adresse comp = new Adresse(4, null, "Rue des Glatiniers", 2100, "Saint-Quentin");
		System.out.println("__________________________ Médecins ______________________________");
		MedecinGeneraliste melanie = new MedecinGeneraliste("Malalaniche", "Mélanie", "02.28.03.17.28", sh);
		MedecinGeneraliste edmond = new MedecinGeneraliste("Bosapin", "Edmond", "+33 2 17 18 19 20", nio);
		MedecinGeneraliste djemila = new MedecinGeneraliste("Table", "Djémila", "03-04-05-06-07", comp);

		melanie.afficher();
		System.out.println("------------------------------------------------------------------");
		edmond.afficher();
		System.out.println("------------------------------------------------------------------");
		djemila.afficher();

		System.out.println("-------------- Changement du prix de la consultation -------------");
		MedecinGeneraliste.setTarif(23);
		melanie.afficher();
		System.out.println("------------------------------------------------------------------");
		edmond.afficher();
		System.out.println("------------------------------------------------------------------");
		djemila.afficher();
	}

	private static void VerifPatients() {
		Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain");
		Adresse nio = new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort");
		Adresse comp = new Adresse(4, null, "Rue des Glatiniers", 2100, "Saint-Quentin");
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________ Patient _______________________________");
		Patient hillary = new Patient("Vambuce", "Hillary", "0123456789", 'F', 287060244010154l,
				LocalDate.of(1987, 6, 2), "Allergie aux arachides", sh);
		Patient ines = new Patient("Perret", "Inès", "0698745123", 'F', 245021067034521l, LocalDate.of(1945, 2, 10),
				null, nio);
		Patient adhemar = new Patient("Pamamobe", "Adhémar", "0753428619", 'M', 192112192020142l,
				LocalDate.of(1992, 11, 21), null, comp);
		
		hillary.afficher();
		System.out.println("------------------------------------------------------------------");
		ines.afficher();
		System.out.println("------------------------------------------------------------------");
		adhemar.afficher();
	}

	private static void VerifAdresses() {
		System.out.println("__________________________________________________________________");
		System.out.println("__________________________ Adresses ______________________________");
		Adresse sh = new Adresse("ZAC du Moulin Neuf", 2, "B", "rue Benjamin Franklin", 44800, "Saint Herblain");
		Adresse nio = new Adresse(19, null, "avenue Léo Lagrange", 79000, "Niort");
		Adresse comp = new Adresse(4, null, "Rue des Glatiniers", 2100, "Saint-Quentin");

		sh.afficher();
		System.out.println("------------------------------------------------------------------");
		nio.afficher();
		System.out.println("------------------------------------------------------------------");
		comp.afficher();		
	}
}
