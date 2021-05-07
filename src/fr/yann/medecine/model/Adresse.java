package fr.yann.medecine.model;

public class Adresse {
	
	private String mentionComplementaire;
	private Integer numVoie;
	private String complement;
	private String nomVoie;
	private long codePostal;
	private String commune;
	
	public Adresse(String mentionComplementaire, Integer numVoie, String complement, String nomVoie, long codePostal,
			String commune) {
		super();
		this.mentionComplementaire = mentionComplementaire;
		this.numVoie = numVoie;
		this.complement = complement;
		this.nomVoie = nomVoie;
		this.codePostal = codePostal;
		this.commune = commune;
	}

	public Adresse(Integer numVoie, String complement, String nomVoie, long codePostal, String commune) {
		this(null, numVoie, complement, nomVoie, codePostal, commune);
	}
	
	public void afficher() {
		if (mentionComplementaire != null && complement != null) {
			System.out.println(mentionComplementaire);
			System.out.println(numVoie + complement + " " + nomVoie);
			System.out.print(codePostal + " ");
			System.out.println(commune.toUpperCase());
		} else if (mentionComplementaire == null && complement == null) {
			System.out.println(numVoie + " " + nomVoie);
			System.out.print(codePostal + " ");
			System.out.println(commune.toUpperCase());
		} else if (mentionComplementaire == null && complement != null) {
			System.out.println(numVoie + complement + " " + nomVoie);
			System.out.print(codePostal + " ");
			System.out.println(commune.toUpperCase());
		} else if (mentionComplementaire != null && complement == null) {
			System.out.println(mentionComplementaire);
			System.out.println(numVoie + " " + nomVoie);
			System.out.print(codePostal + " ");
			System.out.println(commune.toUpperCase());
		}
	}
}
