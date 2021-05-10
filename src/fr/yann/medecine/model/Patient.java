package fr.yann.medecine.model;

import java.time.LocalDate;

public class Patient {
	
	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private char sexe;
	private long securiteSociale;
	private LocalDate dateDeNaissance;
	private String commentaire;
	private Adresse adresse;
	
	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long securiteSociale,
			LocalDate dateDeNaissance, String commentaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.sexe = sexe;
		this.securiteSociale = securiteSociale;
		this.dateDeNaissance = dateDeNaissance;
		this.commentaire = commentaire;
	}
	
	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long securiteSociale,
			LocalDate dateDeNaissance, String commentaire, Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.sexe = sexe;
		this.securiteSociale = securiteSociale;
		this.dateDeNaissance = dateDeNaissance;
		this.commentaire = commentaire;
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

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	public char getSexe() {
		return sexe;
	}

	public void setSexe(char sexe) {
		this.sexe = sexe;
	}

	public long getSecuriteSociale() {
		return securiteSociale;
	}

	public void setSecuriteSociale(long securiteSociale) {
		this.securiteSociale = securiteSociale;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	public void afficher() {
		System.out.println(nom + " " + prenom);
		System.out.println("Téléphone : " + numeroDeTelephone);
		System.out.println("Sexe : " + sexe);
		System.out.println("Numéro de sécurité sociale : " + securiteSociale);
		System.out.println("Date de naissance : " + dateDeNaissance);
		System.out.println("Commentaires : " + commentaire);
		System.out.println("Adresse :");
		adresse.afficher();
	}
	
	
}
