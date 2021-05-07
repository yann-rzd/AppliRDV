package fr.yann.medecine.model;

public class MedecinGeneraliste {
	
	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private static int tarif;
	
	public MedecinGeneraliste (String nom, String prenom, String numTel) {
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numTel;
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
	}

	@Override
	public String toString() {
		return "MedecinGeneraliste [nom=" + nom + ", prenom=" + prenom + ", numTel=" + numeroDeTelephone + ", tarif=" + tarif
				+ "]";
	}
	
	
}
