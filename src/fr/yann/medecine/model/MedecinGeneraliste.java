package fr.yann.medecine.model;

public class MedecinGeneraliste {
	
	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private static int tarif;
	private Adresse adresse;
	int MAX_CRENEAU = 15;
	private Creneau[] creneau = new Creneau[MAX_CRENEAU];
	
	public MedecinGeneraliste (String nom, String prenom, String numTel) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numTel;
	}
	
	public MedecinGeneraliste (String nom, String prenom, String numTel, Adresse adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numTel;
		this.adresse = adresse;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public void setNumeroDeTelephone(String numTel) {
		this.numeroDeTelephone = numTel;
	}

	public static int getTarif() {
		return tarif;
	}

	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}
	
	public void afficher() {
		System.out.println("Médecin " + nom + " " + prenom + "\nNuméro de téléphone : " + numeroDeTelephone + "\nTarif : " + tarif);
		System.out.println("Adresse :");
		adresse.afficher();
	}
	

	@Override
	public String toString() {
		return "MedecinGeneraliste [nom=" + nom + ", prenom=" + prenom + ", numeroDeTelephone=" + numeroDeTelephone
				+ ", adresse=" + adresse + "]";
	}

	
	
	
}
