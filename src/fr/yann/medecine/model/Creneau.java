package fr.yann.medecine.model;

import java.time.LocalTime;

public class Creneau {
	private LocalTime creneau;
	private int minutes;
	private MedecinGeneraliste medecin;
	
	public Creneau(LocalTime creneau, int minutes, MedecinGeneraliste medecin) {
		super();
		this.creneau = creneau;
		this.minutes = minutes;
		this.medecin = medecin;
	}
	
	public Creneau(LocalTime creneau, int minutes) {
		super();
		this.creneau = creneau;
		this.minutes = minutes;
	}

	public LocalTime getCreneau() {
		return creneau;
	}

	public void setCreneau(LocalTime creneau) {
		this.creneau = creneau;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public MedecinGeneraliste getMedecin() {
		return medecin;
	}

	public void setMedecin(MedecinGeneraliste medecin) {
		this.medecin = medecin;
	}
	
	public void afficher() {
		LocalTime finCreneau = creneau.plusMinutes(minutes);
		System.out.println(creneau + " - " + finCreneau + " (" + minutes + " minutes)");
	}
	
	
}


